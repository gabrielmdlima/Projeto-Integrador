import java.util.Scanner;

public class IncioDoJogo {

  private static String nomePer;
  private static String player;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int menuInicial;
    int escolha;

    System.out.println("-------------THE POWER OF KNOWLEDGE-------------");
    //System.out.println("\nSeja bem-vindo");

    do {
      do {
        escolha = 0;
        menuInicial = menuPrincipal(input);
        if (menuInicial == 2) {
          escolha = instrucoes(input);
        } else if (menuInicial == 3) {
          escolha = creditos(input);
        } else if (menuInicial == 4) {
          System.exit(0);
        }

      } while (escolha == 1);

      System.out.println("\nSeja bem-vindo Guerreiro!");
      do {
        System.out.println("\nEspero que esteja ansioso para entrar nessa aventura, onde deverá enfrentar desafios" +
            " matemáticos.\n\nEstá preparado?\n1- Sim\n2- Não\n");
        escolha = input.nextInt();

        if ((escolha != 1) && (escolha != 2)) {
          System.out.println("\nResposta inválida, tente novamente!");
          escolha=3;
        }
      }while(escolha==3);
    }while(escolha!=1);

    System.out.println("\nVocê é corajoso!\n");

    personagem(input);
    nomePerso(input);

    System.out.println("\nO seu "+player+" "+nomePer+" foi definido com sucesso!\n");

    System.out.println("Tudo pronto, vamos começar!");

  }

  public static int menuPrincipal(Scanner input){
    int menuInicial;

    do {
      System.out.println("\n-------MENU-------");
      System.out.println("1- Jogar\n2- Instruções\n3- Créditos\n4- Sair\n");
      menuInicial = input.nextInt();
      if((menuInicial!=1)&&(menuInicial!=2)&&(menuInicial!=3)&&(menuInicial!=4)){
        System.out.println("\nResposta inválida, tente novamente!");
        menuInicial=5;
      }
    }while(menuInicial==5);

    return menuInicial;
  }

  public static int instrucoes(Scanner input){
    int escolha;

    do {
      System.out.println("\n-------INTRUÇÕES-------");
      System.out.println("\nAqui vão as intruções!");
      System.out.println("\nVocê entendeu?\n1- Sim\n2- Não\n");
      escolha = input.nextInt();
    }while(escolha==2);
    System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
    escolha = input.nextInt();
    if(escolha==2){
      System.exit(0);
    }

    return escolha;
  }

  public static int creditos(Scanner input){
    int escolha;

    System.out.println("\n-------CRÉDITOS-------");
    System.out.println("\nAqui vão os créditos!");
    System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
    escolha = input.nextInt();
    if(escolha==2){
      System.exit(0);
    }

    return escolha;
  }
  public static void personagem(Scanner input){
    int escolha;

    System.out.println("\n-----------PERSONAGENS-----------");
    do {
      System.out.println("\nEscolha seu personagem para jogar:");
      System.out.println("1- Cavaleiro\n2- Feiticeiro\n3- Bardo\n");
      escolha = input.nextInt();
      if (escolha == 1) {
        System.out.println("\nO Cavaleiro...");
        do {
          System.out.println("\nVocê deseja ser O Cavaleiro?\n1- Sim\n2- Não\n");
          escolha = input.nextInt();

          if (escolha == 2) {
            escolha = 4;
          }else if(escolha==1) {
            player = "cavaleiro";
          }else {
            System.out.println("\nResposta inválida, tente novamente!");
            escolha=0;
          }
        }while(escolha==0);
      } else if (escolha == 2) {
        System.out.println("\nO Feiticeiro...");
        do {
          System.out.println("\nVocê deseja ser O Feiticeiro?\n1- Sim\n2- Não\n");
          escolha = input.nextInt();

          if (escolha == 2) {
            escolha = 4;
          }else if(escolha==1){
            player = "feiticeiro";
          }else {
            System.out.println("\nResposta inválida, tente novamente!");
            escolha=0;
          }
        }while(escolha==0);
      } else if (escolha == 3) {
        System.out.println("\nO Bardo...");
        do {
          System.out.println("\nVocê deseja ser O Bardo?\n1- Sim\n2- Não\n");
          escolha = input.nextInt();

          if (escolha == 2) {
            escolha = 4;
          }else if(escolha==1){
            player = "bardo";
          }else {
            System.out.println("\nResposta inválida, tente novamente!");
            escolha=0;
          }
        }while(escolha==0);
      } else {
        System.out.println("\nResposta inválida, tente novamente!");
        escolha = 4;
      }
    }while(escolha==4);
  }
  public static void nomePerso(Scanner input){
    int escolha;

    do {
      System.out.println("\nDigite um nome para o seu personagem:\n");
      nomePer = input.next();

      System.out.println("\n" + nomePer + " é o nome que você deseja utilizar?");
      do {
        System.out.println("\n1- Sim\n2- Não\n");
        escolha = input.nextInt();
        if ((escolha != 1) && (escolha != 2)) {
          System.out.println("\nResposta inválida, tente novamente!");
          escolha = 3;
        }
      }while(escolha==3);
    }while(escolha==2);
  }
}

