package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Estabelecimento estabelecimento = new Estabelecimento();

    short opcao;

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostar relatório");
      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com a sua idade:");
        int idade = scanner.nextInt();
        estabelecimento.inserirIdadeCliente(idade);
      } else if (opcao == 2) {
        estabelecimento.gerarRelatorio();
      } else {
        System.out.println("Entre com uma opção válida!");
      }

    } while (opcao != 2);
  }
}
