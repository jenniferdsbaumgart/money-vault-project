package meu_cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

  // Scanner para entrada do usuário
  private Scanner scan;
  // Instância do cofrinho
  private Cofrinho cofrinho;
  // Instâncias das moedas
  private Moeda dolar;
  private Moeda euro;
  private Moeda libra;
  private Moeda real;

  // Construtor da classe Menu
  public Menu() {
    // Inicializa o Scanner para entrada do usuário
    scan = new Scanner(System.in);
    // Inicializa o cofrinho
    cofrinho = new Cofrinho();
    // Adiciona diferentes moedas ao cofrinho
    dolar = new Dolar();
    cofrinho.getListaValores().add(dolar);
    euro = new Euro();
    cofrinho.getListaValores().add(euro);
    libra = new Libra();
    cofrinho.getListaValores().add(libra);
    real = new Real();
    cofrinho.getListaValores().add(real);
  }

  // Método para exibir o menu principal e processar escolhas do usuário
  public void MenuPrincipal() {
    while (true) {
      // Exibe o cabeçalho do menu principal
      System.out.println("------ MEU COFRINHO ------");
      System.out.println("Escolha uma das opções abaixo:");
      System.out.println("1 - Adicionar Valor em Dinheiro");
      System.out.println("2 - Remover Valor em Dinheiro");
      System.out.println("3 - Listar Valores Armazenados");
      System.out.println("4 - Conversor de Moedas");
      System.out.println("5 - Encerrar o Programa");
      System.out.println("-------------------------");

      try {
        // Lê a opção escolhida pelo usuário
        int opcao = scan.nextInt();
        // Processa a escolha do usuário
        switch (opcao) {
          case 1:
            // Chama o método para adicionar valor
            adicionarValor(scan, dolar, euro, libra, real);
            break;
          case 2:
            // Chama o método para remover valor
            removerValor(scan, dolar, euro, libra, real);
            break;
          case 3:
            // Chama o método para listar os valores armazenados
            cofrinho.listarValores();
            System.out.println("");
            break;
          case 4:
            // Chama o método para o conversor de moedas
            converterMoeda(scan, cofrinho, dolar, euro, libra, real);
            break;
          case 5:
            // Encerra o programa
            System.out.println("O cofrinho foi encerrado!");
            return;
          default:
            System.out.println("Opção inválida!");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida! Por favor, insira um número.");
        // Limpa a entrada inválida
        scan.next();
      }
    }
  }

  // Método para exibir o menu secundário para escolha da moeda
  private static void MenuSecundario() {
    System.out.println("------------------------");
    System.out.println("Escolha uma moeda:");
    System.out.println("1 - Dólar");
    System.out.println("2 - Euro");
    System.out.println("3 - Libra");
    System.out.println("4 - Real");
    System.out.println("5 - Voltar ao menu principal");
    System.out.println("------------------------");
  }

  // Método para adicionar valor em uma moeda selecionada pelo usuário
  public static void adicionarValor(
    Scanner scan,
    Moeda dolar,
    Moeda euro,
    Moeda libra,
    Moeda real
  ) {
    // Exibe o menu secundário
    MenuSecundario();
    try {
      // Lê a opção escolhida pelo usuário
      int opcao = scan.nextInt();
      double valor;

      // Solicita que o usuário digite um valor positivo
      while (true) {
        System.out.println("Digite o valor que deseja adicionar:");
        valor = scan.nextDouble();
        if (valor > 0) {
          break;
        }
        System.out.println("O valor deve ser positivo.");
      }
      // Adiciona o valor à moeda escolhida pelo usuário
      switch (opcao) {
        case 1:
          dolar.valor += valor;
          break;
        case 2:
          euro.valor += valor;
          break;
        case 3:
          libra.valor += valor;
          break;
        case 4:
          real.valor += valor;
          break;
        case 5:
          System.out.println("");
          // Volta ao menu principal
          return;
        default:
          System.out.println("Opção inválida!");
          break;
      }
      System.out.println("Valor adicionado!");
    } catch (InputMismatchException e) {
      System.out.println("Entrada inválida! Por favor, insira um número.");
      // Limpa a entrada inválida
      scan.next();
    }
  }

  // Método para remover valor de uma moeda selecionada pelo usuário
  public static void removerValor(
    Scanner scan,
    Moeda dolar,
    Moeda euro,
    Moeda libra,
    Moeda real
  ) {
    // Exibe o menu secundário
    MenuSecundario();
    try {
      // Lê a opção escolhida pelo usuário
      int opcao = scan.nextInt();
      double valorRemovido;

      // Solicita que o usuário digite um valor positivo
      while (true) {
        System.out.println("Digite o valor que deseja remover:");
        valorRemovido = scan.nextDouble();
        if (valorRemovido > 0) {
          break;
        }
        System.out.println("O valor deve ser positivo.");
      }
      boolean removeuValor = false;

      // Remove o valor da moeda escolhida pelo usuário, se houver saldo suficiente
      switch (opcao) {
        case 1:
          if (dolar.valor >= valorRemovido) {
            dolar.valor -= valorRemovido;
            removeuValor = true;
          }
          break;
        case 2:
          if (euro.valor >= valorRemovido) {
            euro.valor -= valorRemovido;
            removeuValor = true;
          }
          break;
        case 3:
          if (libra.valor >= valorRemovido) {
            libra.valor -= valorRemovido;
            removeuValor = true;
          }
          break;
        case 4:
          if (real.valor >= valorRemovido) {
            real.valor -= valorRemovido;
            removeuValor = true;
          }
          break;
        case 5:
          // Volta ao menu principal
          System.out.println("");
          return;
        default:
          System.out.println("Opção inválida!");
          break;
      }

      // Exibe uma mensagem indicando se o valor foi removido ou se o saldo era insuficiente
      if (removeuValor) {
        System.out.println("Valor removido!");
      } else {
        System.out.println(
          "Saldo insuficiente para remover o valor específicado!"
        );
      }
    } catch (InputMismatchException e) {
      System.out.println("Entrada inválida! Por favor, insira um número.");
      // Limpa a entrada inválida
      scan.next();
    }
  }

  // Método para realizar conversão de moeda
  public static void converterMoeda(
    Scanner scan,
    Cofrinho cofrinho,
    Moeda dolar,
    Moeda euro,
    Moeda libra,
    Moeda real
  ) {
    System.out.println("------------------------");
    System.out.println("Escolha uma opção de conversão:");
    System.out.println("1 - Dólar para Real");
    System.out.println("2 - Euro para Real");
    System.out.println("3 - Libra para Real");
    System.out.println("4 - Todas as moedas convertidas em Real");
    System.out.println("5 - Voltar ao menu principal");
    System.out.println("------------------------");

    try {
      // Lê a opção escolhida pelo usuário
      int opcao = scan.nextInt();
      // Realiza a conversão de acordo com a opção escolhida
      switch (opcao) {
        case 1:
          System.out.println(
            "Dólar convertido para Real: " + cofrinho.totalConvertido(dolar)
          );
          break;
        case 2:
          System.out.println(
            "Euro convertido para Real: " + cofrinho.totalConvertido(euro)
          );
          break;
        case 3:
          System.out.println(
            "Libra convertido para Real: " + cofrinho.totalConvertido(libra)
          );
          break;
        case 4:
          double total = 0;

          // Calcula o valor total de todas as moedas convertidas para Real
          total += cofrinho.totalConvertido(real);
          total += cofrinho.totalConvertido(dolar);
          total += cofrinho.totalConvertido(euro);
          total += cofrinho.totalConvertido(libra);
          System.out.println(
            "Valor de todas as moedas convertidas em Real: " + total
          );
          break;
        case 5:
          // Volta ao menu principal
          System.out.println("");
          return;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } catch (InputMismatchException e) {
      System.out.println("Entrada inválida! Por favor, insira um número.");
      // Limpa a entrada inválida
      scan.next();
    }
  }
}
