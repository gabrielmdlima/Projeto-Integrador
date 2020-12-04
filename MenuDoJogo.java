import java.util.Scanner;

public class MenuDoJogo {

  private static String nomePer;
  private static String player;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int menu=0;
    int teste;

    do {
      System.out.println("Exemplo do jogo somente para testes");
      System.out.println("\n1- Menu\n2- Sair\n");
      teste = input.nextInt();
      if (teste == 1) {
        menu = pause(input);
      } else {
        System.exit(0);
      }
    }while(menu==2);

    System.out.println("\nO seu "+player+" "+nomePer+" foi definido com sucesso!");

  }
  public static int pause(Scanner input){
    int escolha;

    do {
      System.out.println("\n-------PAUSE-------");
      System.out.println("1- Continuar jogo\n2- Reiniciar jogo\n3- Opções do jogo\n4- Sair do jogo\n");
      escolha = input.nextInt();

      if (escolha == 3) {
        escolha = opcoes(input);
      }else if(escolha==4){
        System.exit(0);
      }else if((escolha!=1)&&(escolha!=2)){
        System.out.println("\nResposta inválida, tente novamente!");
        escolha = 5;
      }
    }while(escolha==5);

    return escolha;
  }
  public static int opcoes(Scanner input){
    int escolha;

    do {
      System.out.println("\n-------OPÇÕES-------");
        System.out.println("1- Mudar personagem\n2- Mudar nome\n3- Instruções\n4- Créditos\n5- Voltar\n");
        escolha = input.nextInt();

        if (escolha == 1) {
          personagem(input);
          escolha = 6;
        } else if (escolha == 2) {
          nomePerso(input);
          escolha = 6;
        } else if (escolha==3) {
          escolha = instrucoes(input);
          if(escolha!=6) {
            escolha = 6;
          }
        }else if(escolha==4){
          escolha = creditos(input);
          if(escolha!=6) {
            escolha = 6;
          }
        }else if(escolha!=5){
          System.out.println("\nResposta inválida, tente novamente!");
          escolha = 6;
        }
    }while(escolha==6);
    return escolha;
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
}
