public class JogoVidas {

  private static int vidas;

  public static void main(String[] args) {
    vidas = vidas-1;
    do {
      vida();
      vidas = vidas - 1;
    }while(vidas!=0);
  }
  public static void vida(){
    for(int i=0;i<vidas;i++){
      String coracao = "♡";
      System.out.print(coracao);
    }
    System.out.print("\n");
  }
}
