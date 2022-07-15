package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Classe do estabelecimento que armazena clientes e gera relatórios.
 */
public class Estabelecimento {

  ArrayList<Integer> idades = new ArrayList<>();
  float qtdMenores = 0;
  float qtdAdultos = 0;
  float qtdAcimaCinquenta = 0;

  /**
   * Método que verifica idade do cliente.
   */
  public void verificaIdade(int idade) {
    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      qtdMenores += 1;
    } else if (idade < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
      qtdAdultos += 1;
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      qtdAcimaCinquenta += 1;
    }
  }

  /**
   * Método que insere o cliente.
   */
  public void inserirIdadeCliente(int idade) {
    verificaIdade(idade);
    idades.add(idade);
  }

  /**
   * Método formata o percentual.
   */
  public String formatadorDecimal(float numero) {
    Locale currentLocale = Locale.getDefault();
    DecimalFormatSymbols newSymbol = new DecimalFormatSymbols(currentLocale);
    newSymbol.setDecimalSeparator('.');

    return new DecimalFormat("00.00%", newSymbol).format(numero);
  }

  /**
   * Método que gera o relatório.
   */
  public void gerarRelatorio() {
    int total = idades.size();
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + (int) qtdMenores);
    System.out.println("adultas: " + (int) qtdAdultos);
    System.out.println("a partir de 50: " + (int) qtdAcimaCinquenta);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + formatadorDecimal(qtdMenores / total));
    System.out.println("adultas: " + formatadorDecimal(qtdAdultos / total));
    System.out.println("a partir de 50: " + formatadorDecimal(qtdAcimaCinquenta / total));

    System.out.println("TOTAL: " + total);
  }
}
