import java.util.Random;
import java.util.Scanner;

public class CogumeloMagico {

  private static int vidas;

  public static void main(String[] args) {
    vidas = 5;
    Scanner input = new Scanner(System.in);
    int escolha;

    do {
      System.out.println("Você quer comer o cogumelo?");
      System.out.println("1- Sim\n2- Não\n");
      escolha = input.nextInt();

      switch (escolha) {
        case 1:
          System.out.println("\nVocê pega o cogumelo na mão e come ele de uma vez!");
          sorte();
          break;
        case 2:
          break;
        default:
          System.out.println("Resposta inválida, tente novamente!");
          escolha = 3;
          break;
      }
    }while(escolha==3);

    vida();
  }
  public static void sorte(){
    Random random = new Random();
    int sorte;

    do {
      sorte = random.nextInt(4);

      System.out.println(sorte);

      switch (sorte) {
        case 1:
          System.out.println("\nVocê realmente é um rapaz de sorte. Você ganhou uma vida!");
          vidas = vidas + 1;
          break;
        case 2:
          System.out.println("\nVocê não teve sorte dessa vez. Você perdeu uma vida!");
          vidas = vidas - 1;
          break;
        case 3:
          System.out.println("\nNão aconteceu nada, seria isso sorte ou azar?");
          break;
        default:
          sorte = 0;
          break;
      }
    }while (sorte==0);
  }
  public static void vida(){
    //método para contabilização das vidas e para sua impressão quando necessario.
    for(int i=0;i<vidas;i++){
      String coracao = "♡";
      System.out.print(coracao);
    }
    System.out.print("\n");
  }
}
