import java.util.Scanner;
import java.util.Random;

public class Jogo {

  private static String nomePer;
  private static String player;
  private static int vidas;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String decisao;
    int menuInicial;
    int escolha;
    int menu;
    String[] vetor = {"SUA RESPOSTA ESTÁ CORRETA!","SUA RESPOSTA ESTÁ INCORRETA!"};
    //Esse vetor serve para avisar se o jogador/usuário acertou ou não a resposta.

    do {
      do {
        do {
          do {
            do {
              do {
                do {
                  do {
                    do {
                      do {
                        do {
                          do {
                            do {
                              //todos os do/while utilizados acima são para a função de reiniciar o jogo.
                              vidas = 5;
                              System.out.println("-------------THE POWER OF KNOWLEDGE-------------");

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
                                  escolha = 0;
                                  System.out.println("\nEspero que esteja ansioso para entrar nessa aventura, onde deverá enfrentar desafios" +
                                      " matemáticos.\n\nEstá preparado?\nSim\nNão\n");
                                  decisao = input.next();

                                  switch (decisao) {
                                    case "Sim":
                                    case "sim":
                                    case "SIM":
                                      break;
                                    case "Não":
                                    case "não":
                                    case "NÃO":
                                    case "Nao":
                                    case "nao":
                                    case "NAO":
                                      do {
                                        System.out.println("\nVocê deseja voltar ao menu inicial?\n1- Sim\n2- Não\n");
                                        escolha = input.nextInt();

                                        if (escolha == 1) {
                                          escolha = 2;
                                        } else if (escolha == 2) {
                                          System.exit(0);
                                        } else {
                                          System.out.println("\nResposta inválida, tente novamente!");
                                          escolha = 3;
                                        }
                                      } while (escolha == 3);
                                      break;
                                    default:
                                      System.out.println("\nResposta inválida, tente novamente!");
                                      escolha = 3;
                                  }
                                } while (escolha == 3);
                              } while (escolha == 2);

                              System.out.println("\nVocê é corajoso!");

                              personagem(input);
                              nomePerso(input);

                              System.out.println("\nO seu " + player + " " + nomePer + " foi definido com sucesso!");

                              System.out.println("\nSaudações " + player + " " + nomePer + "\n");
                              pressEnter();
                              System.out.println("Você está prestes a embarcar em um grande desafio de conhecimento. Nesse\n" +
                                  "jogo você vai ter que colocar em prática suas habilidades matemáticas para\n" +
                                  "conseguir salvar sua vida e chegar sã e salvo ao seu objetivo.\n" +
                                  "Você deve estar se perguntando qual é esse grande desafio, não é mesmo?\n" +
                                  "Pois bem, a princesa do Reino de Tristam foi raptada por um grupo de Bruxos\n" +
                                  "e levada para a mais tenebrosa Catedral, a Catedral dos Bruxos, você foi contra-\n" +
                                  "tado pelo Rei para ir até lá e salvar a princesa. Mas tenha muito cuidado, o líder\n" +
                                  "do Bruxos, o mais poderoso, além de inteligente é muito cuidadoso com seus desafios.\n" +
                                  "Boa sorte e tente não morrer!\n");
                              pressEnter();
                              System.out.println("Logo após a conversa com o Rei, você começa a buscar informações e seguir as\n" +
                                  "pistas. O dia se passa e logo a escuridão aparece.");
                              System.out.println("Andando desconfiado de tudo ao seu redor e com dificuldade para enxergar, você\n" +
                                  "encontra com uma figura misteriosa, vestindo uma capa escura e um capuz cobrindo o rosto.\n" +
                                  "Você cuidadosamente se aproxima e logo é interrompido por ele.\n");
                              pressEnter();
                              System.out.println("Figura: O que você faz aqui? Não deveria seguir esse caminho, vá embora!\n");
                              pressEnter();
                              System.out.println("Você com muita coragem diz que não vai embora e que quer passar por ali\n" +
                                  "de qualquer jeito.");
                              System.out.println("Ouvindo isso, a misteriosa figura tira a capa e o capuz, logo você consegue" +
                                  "\nver um talismã em seu peito, em que o mesmo só é usado por Bruxos.\n");
                              pressEnter();
                              System.out.println(nomePer + ": Você é um Bruxo, vim aqui para resgatar a princesa e não vou\n" +
                                  "embora até conseguir, então se quiser me impedir, terá que me matar!\n");
                              pressEnter();
                              do {
                                System.out.println("Bruxo: Você é corajoso, não vou te matar...ainda...Para seguir seu\n" +
                                    "caminho você terá que passar por um desafio. Você aceita?");
                                do {
                                  menu = 0;
                                  vida();
                                  System.out.println("\n0- Menu\n");
                                  System.out.println("\nSim\nNão\n");

                                  decisao = input.next();

                                  escolha = 0;

                                  switch (decisao) {
                                    case "Sim":
                                    case "sim":
                                    case "SIM":
                                      System.out.println("\n" + nomePer + ": " + decisao);
                                      break;
                                    case "Não":
                                    case "não":
                                    case "NÃO":
                                    case "Nao":
                                    case "nao":
                                    case "NAO":
                                      System.out.println("\n" + nomePer + ": " + decisao);
                                      vidas = vidas - 1;
                                      gameOver();
                                      System.out.println("\nGuerreiro, você escolheu não enfrentar o desafio e perdeu uma vida,\n" +
                                          "terá de ser bravamente forte para conseguir manter-se vivo e alcançar\n" +
                                          "o seu objetivo final.\n" +
                                          "\nNão se apavore! Você chegou até aqui, vamos continuar sua jornada...");
                                      System.out.println("\nBruxo: E então " + player + ", você aceita o desafio agora?");
                                      escolha = 1;
                                      break;
                                    case "0":
                                      menu = pause(input);
                                      break;
                                    default:
                                      System.out.println("\nResposta inválida, tente novamente!\n");
                                      menu = 1;
                                  }
                                } while (escolha == 1);
                              } while (menu == 1);
                            } while (menu == 2);

                            System.out.println("\nBruxo: Muito bem, aqui vai seu primeiro desafio.");
                            do {
                              menu = 0;
                              System.out.println("\nOs computadores utilizam o sistema binário que é um sistema de numeração em que\n" +
                                  "todo os tipos de quantidades são representadas na forma de dois números, ou seja,\n" +
                                  "(0 e 1). No sistema binário, como é representado o número 23?");
                              vida();
                              System.out.println("\n0- Menu\n");
                              System.out.println("\nA) 10111\nB) 101100\nC) 10110\nD) 11001\nE) N.A.\n");
                              decisao = input.next();

                              switch (decisao) {
                                case "A":
                                case "a":
                                  System.out.println("\n" + nomePer + ": " + decisao);
                                  System.out.println("\n"+vetor[0]);
                                  break;
                                case "B":
                                case "b":
                                case "C":
                                case "c":
                                case "D":
                                case "d":
                                case "E":
                                case "e":
                                  System.out.println("\n" + nomePer + ": " + decisao);
                                  System.out.println("\n"+vetor[1]);
                                  vidas = vidas - 1;
                                  gameOver();
                                  System.out.println("\nApós escolher a alternativa errada, você leva um dano do Bruxo e perde uma" +
                                      "\nvida. Então lhe é dada mais uma chance para tentar de novo, mas tome cuida-" +
                                      "\ndo, ja que agora você só possui " + vidas + " vidas.\n");
                                  menu = 1;
                                  break;
                                case "0":
                                  menu = pause(input);
                                  break;
                                default:
                                  System.out.println("\nResposta inválida, tente novamente!");
                                  menu = 1;
                                  break;
                              }
                            } while (menu == 1);
                          } while (menu == 2);

                          System.out.println("\nBruxo: Impossivel! Você deu sorte, mas trato é trato, pode seguir adiante.");
                          System.out.println("\nDepois de correr para longe daquele Bruxo você encontra uma árvore e decide\n" +
                              "descansar para se recuperar.");
                          pressEnter();
                          System.out.println("Após se encostar na árvore para retomar o folego, você olha para o chão e vê" +
                              "\num cogumelo estranho, meio esverdeado e brilhante, ele te chama muita atenção" +
                              "\njá que você já havia escutado sobre eles, são cogumelos mágicos e raros que" +
                              "\npossuem a chance de te ajudar ou não!");

                          do {
                            menu = 0;
                            System.out.println("\nVocê quer comer o cogumelo?");
                            vida();
                            System.out.println("\n0- Menu\n");
                            System.out.println("\n1- Sim\n2- Não\n");
                            escolha = input.nextInt();

                            switch (escolha) {
                              case 1:
                                System.out.println("\nVocê pega o cogumelo na mão e come ele de uma vez!");
                                sorte();
                                break;
                              case 2:
                                System.out.println("\nMuito bem, você apena o ignora e continua sua jornada.\n");
                                break;
                              case 0:
                                menu = pause(input);
                                break;
                              default:
                                System.out.println("Resposta inválida, tente novamente!");
                                menu = 1;
                                break;
                            }
                          } while (menu == 1);
                        } while (menu == 2);

                        do {
                          menu = 0;
                          System.out.println("Ainda está de noite, começa uma tempestade e você tenta encontrar um lugar\n" +
                              "seguro para se proteger da chuva, quando você se depara com uma caverna escura.");
                          vida();
                          System.out.println("\n0- Menu\n");
                          System.out.println("\nCansado e com frio, você tem duas opções:");
                          System.out.println("\n1- Ir até a caverna.\n2- Procurar outro lugar seguro.\n");
                          escolha = input.nextInt();

                          if (escolha == 1) {
                            System.out.println("\nDepois de verificar se a caverna está segura, você se deita e dorme.");
                            System.out.println("O dia amanhece e você desperta depois de ouvir barulhos. Ouvindo passos da" +
                                "\nentrada da caverna você decide conferir o que está acontecendo e vê dois" +
                                "\nhomens vindo em sua direção. Você percebe então que eles usam o mesmo" +
                                "\ntalismã do Bruxo que encontrou noite passada.");
                          } else if (escolha == 2) {
                            System.out.println("\nVocê continuou andando pela floresta com toda aquela tempestade, até que" +
                                "\nencontrou uma casa aparentemente simples, como tomou muita chuva com frio" +
                                "\ne sem muita opção resolveu pedir abrigo ali mesmo. Era a casa de uma senho-" +
                                "\nra muito simpática. Te vendo naquela situação todo molhado da chuva, ela" +
                                "\nte recebe. Quando acorda no dia seguinte se depara com dois homens na casa," +
                                "\nolhando para o colar de um deles percebe que é um talismã idêntico ao do" +
                                "\nBruxo da noite passada.");
                          } else if (escolha == 0) {
                            menu = pause(input);
                          } else {
                            System.out.println("\nResposta inválida, tente novamente!");
                            menu = 1;
                          }
                        } while (menu == 1);
                      } while (menu == 2);

                      pressEnter();
                      System.out.println("\n" + nomePer + ": O que querem comigo?\n" +
                          "\nBruxo: Ficamos sabendo de um intruso que está nas redondezas, imagino que seja você!\n" +
                          "\n" + nomePer + ": Sou eu mesmo, deve saber também que não vai me parar até que me mate.\n" +
                          "\nBruxo: Hum, fiquei sabendo da sua coragem! Quer mesmo seguir com isso?\n" +
                          "\n" + nomePer + ": Tenho um objetivo a cumprir e vou até o fim!\n");
                      pressEnter();
                      System.out.println("O outro Bruxo então, deixa claro que agora não será apenas 1 desafio, mas sim 2. Cada" +
                          "\num deles irá te desafiar.");
                      do {
                        menu = 0;
                        vida();
                        System.out.println("\n0- Menu\n");
                        System.out.println("\nVocê aceita os desafios?");
                        System.out.println("\nSim\nNão\n");
                        decisao = input.next();

                        switch (decisao) {
                          case "Sim":
                          case "sim":
                          case "SIM":
                            System.out.println("\n" + nomePer + ": " + decisao);
                            break;
                          case "Não":
                          case "não":
                          case "NÃO":
                          case "Nao":
                          case "nao":
                          case "NAO":
                            System.out.println("\n" + nomePer + ": " + decisao);
                            vidas = vidas - 2;
                            gameOver();
                            System.out.println("\nVocê decide não enfrentar os desafios e perde mais duas vidas!" +
                                "\nLembre-se que ainda tem muito caminho pela frente, deve se atentar a suas" +
                                "\nescolhas para conseguir salvar a princesa e levá-la a salvo para seu Reino.");
                            System.out.println("\nBruxo: Então " + player + ", você vai aceitar agora?");
                            menu = 1;
                            break;
                          case "0":
                            menu = pause(input);
                            System.out.println("\nO outro Bruxo então, deixa claro que agora não será apenas 1 desafio, mas sim 2. Cada" +
                                "\num deles irá te desafiar.");
                            break;
                          default:
                            System.out.println("\nResposta inválida, tente novamente!");
                            System.out.println("\nO outro Bruxo então, deixa claro que agora não será apenas 1 desafio, mas sim 2. Cada" +
                                "\num deles irá te desafiar.");
                            menu = 1;
                            break;
                        }
                      } while (menu == 1);
                    } while (menu == 2);

                    System.out.println("\nBruxo: Muito bem, vamos ao primeiro desafio.");

                    do {
                      menu = 0;
                      System.out.println("\nEm um Show, o preço em dólares do Show é $150,00. Sabendo-se que 90 mil ingressos" +
                          "\nforam vendidos e que 95% do valor arrecadado irá para o cantor. Qual alternativa" +
                          "\nrepresenta a função do valor arrecadado em Dolares para o cantor?");
                      vida();
                      System.out.println("\n0- Menu\n");
                      System.out.println("\nA) R= 150 x 90 000 x 95 / 100" +
                          "\nB) R =((150 + 90 000) / 95) / 100" +
                          "\nC) R = ((150 x 90 000) x 95) / 100" +
                          "\nD) R = 95 / 100 x (150 x 90 000)" +
                          "\nE) R = 90 / 150 - 100\n");
                      decisao = input.next();

                      switch (decisao) {
                        case "C":
                        case "c":
                          System.out.println("\n" + nomePer + ": " + decisao);
                          System.out.println("\n"+vetor[0]);
                          break;
                        case "A":
                        case "a":
                        case "B":
                        case "b":
                        case "D":
                        case "d":
                        case "E":
                        case "e":
                          System.out.println("\n" + nomePer + ": " + decisao);
                          System.out.println("\n"+vetor[1]);
                          vidas = vidas - 1;
                          gameOver();
                          System.out.println("\nBruxo: Patético, você errou! HAHAHAHA");
                          System.out.println("\nApós errar, o Bruxo lança um raio de luz na sua direção e tira uma vida sua." +
                              "\nTome cuidado, você deve cumprir o seu objetivo, então não perca o foco, você" +
                              "\nainda tem uma princesa para salvar!");
                          System.out.println("\nVocê recebe mais uma chance para tentar novamente.");
                          menu = 1;
                          break;
                        case "0":
                          menu = pause(input);
                          break;
                        default:
                          System.out.println("\nResposta inválida, tente novamente!");
                          menu = 1;
                          break;
                      }
                    } while (menu == 1);
                  } while (menu == 2);

                  System.out.println("\nBruxo: Como isso é possivel? Você acertou essa, mas não vai passar pelo próximo" +
                      "\ndesafio!");
                  System.out.println("\nO outro Bruxo então, diz:");
                  System.out.println("\nBruxo: Você deu sorte, mas quero ver passar pelo meu desafio agora!");

                  do {
                    menu = 0;

                    System.out.println("\nO quociente de 64 por 6 é Y. Qual o valor de Y?");
                    vida();
                    System.out.println("\n0- Menu\n");
                    System.out.println("\nA) 12,16\nB) 14,33\nC) 11\nD) 10,67\nE) 128\n");
                    decisao = input.next();

                    switch (decisao) {
                      case "D":
                      case "d":
                        System.out.println("\n" + nomePer + ": " + decisao);
                        System.out.println("\n"+vetor[0]);
                        break;
                      case "A":
                      case "a":
                      case "B":
                      case "b":
                      case "C":
                      case "c":
                      case "E":
                      case "e":
                        System.out.println("\n" + nomePer + ": " + decisao);
                        System.out.println("\n"+vetor[1]);
                        vidas = vidas - 1;
                        gameOver();
                        System.out.println("\nBruxo: Você errou HAHAHA!");
                        System.out.println("\nO Bruxo então te acerta e você perde uma vida, tome cuidado com as suas" +
                            "\nrespostas, você tem que cumprir a sua missão e chegar à Catedral!");
                        System.out.println("\nVocê recebe mais uma chance do Bruxo para responder novamente.");
                        menu = 1;
                        break;
                      case "0":
                        menu = pause(input);
                        System.out.println("\nO outro Bruxo então, diz:");
                        System.out.println("\nBruxo: Você deu sorte, mas quero ver passar pelo meu desafio agora!");
                        break;
                      default:
                        System.out.println("\nResposta inválida, tente novamente!");
                        System.out.println("\nO outro Bruxo então, diz:");
                        System.out.println("\nBruxo: Você deu sorte, mas quero ver passar pelo meu desafio agora!");
                        menu = 1;
                        break;
                    }
                  } while (menu == 1);
                } while (menu == 2);

                System.out.println("\nBruxo: HAHAHA você errou!");
                System.out.println("\nO outro Bruxo cutuca ele e diz que a resposta está certa.");
                System.out.println("\nBruxo: COMO ASSIM? Não pode ser, você acertou? Droga, tudo bem.");
                pressEnter();
                System.out.println("\nPor ter passado pelos 3 primeiros desafios, um dos Bruxos lhe entrega um mapa, com" +
                    "\nele, você consegue encontrar pontos especificos para ter acesso a Catedral dos Bruxos," +
                    "\nassim, te mostrando qual caminho deve seguir, mas isso não significa que sua jornada" +
                    "\nse tornou mais facil ou menos perigoso." +
                    "\nOlhando o mapa, você identifica o caminho que te leva para a Catedral e segue por ele.");
                pressEnter();
                System.out.println("\nCaminhando e observando com atenção tudo o que vê, avista a sua frente uma vila, você" +
                    "\nnão tem outra opção que não seja passar por ali.");

                System.out.println("\nA caminho da vila, você percebe que há outro daquele mesmo cogumelo de antes," +
                    "\nvocê para, olha fixo para ele e pensa no que quer fazer.");

                do {
                  menu = 0;
                  System.out.println("\nVocê quer comer o cogumelo?");
                  vida();
                  System.out.println("\n0- Menu\n");
                  System.out.println("\n1- Sim\n2- Não\n");
                  escolha = input.nextInt();

                  switch (escolha) {
                    case 1:
                      System.out.println("\nVocê pega o cogumelo na mão e come ele de uma vez!");
                      sorte();
                      break;
                    case 2:
                      System.out.println("\nMuito bem, você apena o ignora e continua sua jornada.\n");
                      break;
                    case 0:
                      menu = pause(input);
                      break;
                    default:
                      System.out.println("Resposta inválida, tente novamente!");
                      menu = 1;
                      break;
                  }
                } while (menu == 1);
              } while (menu == 2);

              System.out.println("Chegando na vila, você encontra uma taverna e resolve dar uma pausa para" +
                  "\nbeber alguma coisa." +
                  "\nEm alguns minutos um plebeu senta ao seu lado e diz para segui-lo sem questionar." +
                  "\nSem medo algum, você acompanha o homem para fora da taverna, quanto mais você andam, mais" +
                  "\nse afastam da vila. Você disfarça e consulta o mapa, percebe então que estão cada vez mais próximos" +
                  "\nda Catedral dos Bruxos." +
                  "\nChegando próximo de uma enorme pedra, vocês param e o Plebeu diz para aguardar ali, após" +
                  "\nisso ele se vira e vai embora sem dizer mais nada. Alguns segundos depois, um Bruxo surge" +
                  "\nem cima da pedra, você se vira e ele diz.");
              pressEnter();
              do {
                menu = 0;
                System.out.println("\nBruxo: Você conseguiu chegar até aqui, realmente você esta decidido à salvar aquela" +
                    "\nprincesa, acredito que não vá desistir agora, então, está pronto para o próximo desafio?");
                vida();
                System.out.println("\n0- Menu\n");
                System.out.println("\nSim\n");
                decisao = input.next();

                switch (decisao) {
                  case "Sim":
                  case "sim":
                  case "SIM":
                    System.out.println("\n" + nomePer + ": " + decisao);
                    break;
                  case "Não":
                  case "não":
                  case "NÃO":
                  case "Nao":
                  case "nao":
                  case "NAO":
                    System.out.println("\n" + nomePer + ": " + decisao);
                    System.out.println("\nBruxo: HAHAHAHAHA Você não tem escolha!");
                    System.out.println("\nDessa vez jovem " + player + ", você não tem escolha, terá de enfrentar o seu destino.");
                    break;
                  case "0":
                    menu = pause(input);
                    break;
                  default:
                    System.out.println("Resposta inválida, tente novamente!");
                    menu = 1;
                    break;
                }
              } while (menu == 1);
            } while (menu == 2);

            do {
              menu = 0;
              System.out.println("\nBruxo: Aqui vai o seu desafio.");

              System.out.println("\nAs raízes 2 e -5 são resultados de uma equação. Qual seria essa equação?");
              vida();
              System.out.println("\n0- Menu\n");
              System.out.println("\nA) x2 + 3x – 10 = 0" +
                  "\nB) x2 - 3x – 10 = 0" +
                  "\nC) x2 - 3x – 10 = 0" +
                  "\nD) x2 - 3x + 10 = 0" +
                  "\nE) x2 + 3x + 10 = 0\n");
              decisao = input.next();

              switch (decisao) {
                case "A":
                case "a":
                  System.out.println("\n" + nomePer + ": " + decisao);
                  System.out.println("\n"+vetor[0]);
                  break;
                case "B":
                case "b":
                case "C":
                case "c":
                case "D":
                case "d":
                case "E":
                case "e":
                  System.out.println("\n" + nomePer + ": " + decisao);
                  System.out.println("\n"+vetor[1]);
                  vidas = vidas - 1;
                  gameOver();
                  System.out.println("\nBruxo: Patético, você errou HAHAHAHAHA");
                  System.out.println("\nVocê escolheu a alternativa errada e perdeu uma vida, tome cuidado" +
                      "\nporque você ainda precisa chegar a Catedral dos Bruxos e salvar a" +
                      "\nprincesa.\nVocê recebe mais uma chance.");
                  menu = 1;
                  break;
                case "0":
                  menu = pause(input);
                  break;
                default:
                  System.out.println("\nResposta inválida, tente novamente!");
                  menu = 1;
                  break;
              }
            } while (menu == 1);
          } while (menu == 2);

          System.out.println("\nBruxo: Eu ouvi falar da sua inteligência! Você pode seguir seu caminho.");
          System.out.println("\nVocê segue o mapa em direção à Catedral, começa a perceber que quanto mais se aproxima," +
              "\nmais as rendondezas se tornam sombrias e tenebrosas, isso te da arrepios, mas" +
              "\nvocê não desiste e continua caminhando.");

          System.out.println("\nUm pouco mais a frente, junto as raizes de uma árvore, você encontra outro daqueles" +
              "\ncogumelos mágicos, você para próximo dele.");

          do {
            menu = 0;
            System.out.println("\nVocê quer comer o cogumelo?");
            vida();
            System.out.println("\n0- Menu\n");
            System.out.println("\n1- Sim\n2- Não\n");
            escolha = input.nextInt();

            switch (escolha) {
              case 1:
                System.out.println("\nVocê pega o cogumelo na mão e come ele de uma vez!");
                sorte();
                break;
              case 2:
                System.out.println("\nMuito bem, você apena o ignora e continua sua jornada.\n");
                break;
              case 0:
                menu = pause(input);
                break;
              default:
                System.out.println("Resposta inválida, tente novamente!");
                menu = 1;
                break;
            }
          } while (menu == 1);
        } while (menu == 2);

        System.out.println("Enquanto caminha, você percebe que o grupo de Bruxos que raptaram a princesa estava" +
            "\nespalhado pelo caminho, afim de impedir qualquer um de chegar até a Catedral com" +
            "\nos seus desafios de matemática. A partir dai, as coisas começam a fazer sentido" +
            "\ne você entende o porque deles estarem no seu caminho.");
        pressEnter();
        System.out.println("\nDeterminado você segue pela floresta e consegue ver a Catedral dos Bruxos, a enorme" +
            "\ne assustadora construção estava bem na sua frente. Sem saber o que poderia acon-" +
            "\ntecer, você se prepara para o pior." +
            "\nVocê decide dar a volta e entrar pelos fundos, evitando os serviçais. Sem que ninguem te veja, você" +
            "\npula a janela e entra na primeira porta a sua frente, sem fazer barulho nenhum.");
        pressEnter();
        System.out.println("Quando você se da conta, está em uma sala com as paredes cobertas por ossos, aparentemente" +
            "\nhumanos. Isso te assusta, porém já é tarde demais, a porta havia sido trancada" +
            "\npor fora, como se já soubessem que você estava ali. Não seria novidade se você" +
            "\ntivesse sido induzido por magia, afinal, você estava na Catedral dos" +
            "\nBruxos não é mesmo?");
        pressEnter();
        System.out.println("Quando você da as costas para a porta e para de prestar atenção nas paredes, percebe que" +
            "\nna sua frente havia um altar e um trono, vazio, conforme você se aproxima, a sala" +
            "\ncomeça a ficar cada vez mais fria, derrepente uma fumaça escura envolve o trono e" +
            "\nnele surge uma criatura horripilante. Essa criatura é chamada de Coven, o lider dos" +
            "\nBruxos, ele é o mais poderoso, o chefe de todos os outros que você encontrou até" +
            "\naquele momento.");
        pressEnter();
        System.out.println("\nEle olha nos seus olhos, bem la no fundo, você sente um arrepio estranho na espinha," +
            "\nmas não se abala, ele levanta e desce os degrais do altar, você sente o frio dominar" +
            "\no seu corpo e subir dos pés até a nuca. Você escuta uma voz arrepiante na sua cabeça.");
        pressEnter();
        System.out.println("\nCoven: Você deve ser o " + player + " que vem dando trabalho aos meus subordinados.\n" +
            "\nVocê concorda com a cabeça.\n" +
            "\nCoven: É realmente muita coragem vir até aqui, entrar na minha Catedral, para pegar o que é " +
            "meu por direito.\n" +
            "\nVocê faz uma cara de dúvida sem entender.\n" +
            "\nCoven: Então o Rei de Tristam não te contou a verdade?\n" +
            "\nVocê nega com a cabeça.\n" +
            "\nCoven: Há alguns anos, o seu querido Rei veio até aqui me pedir um favor, ele queria que eu" +
            "\no ajudasse a ganhar a guerra, pediu a ajuda dos meus Bruxos e sigilo, ja que nós somos vistos" +
            "\ncom más olhos pelo seu povo, os humanos. Eu disse que ajudaria, mas com uma condição, quando" +
            "\na princesa completasse 18 anos, ela seria minha para que eu pudesse absorver todo o conhecimento" +
            "\ndela. Ele aceitou, disse que eu nunca seria capaz de passar pelos guardas do castelo, patético.\n" +
            "\nEle sorri orgulhoso.");
        pressEnter();
        System.out.println("\nVocê respira fundo, enche o peito e fala.");
        System.out.println("\n" + nomePer + ": Infelizmente, não vou deixar que isso aconteça. Me entregue a princesa!");
        System.out.println("\nCoven: Não é tão simples assim, mas o que você me diz de um acordo?");
        pressEnter();
        System.out.println("\n" + nomePer + ": Que tipo de acordo?");
        System.out.println("\nEle da um sorriso assustador que vai literalmente de orelha a orelha.");
        System.out.println("\nCoven: Vou te desafiar, se você acertar a princesa vai com você, mas se errar...");
        System.out.println("\n" + nomePer + ": Se eu errar o que acontece?");
        pressEnter();
        System.out.println("\nCoven: Se você errar, você fica no lugar da princesa e todo o seu conhecimento é meu.");
        System.out.println("\nCoven: Mas veja bem, você só tem uma chance para acertar, o que me diz?");
        pressEnter();
        System.out.println("\n" + nomePer + ": Como vou saber que ela ainda esta viva?");
        System.out.println("\nCom um estalar de dedos dele, a princesa aparece na sua frente flutuando na mesma" +
            "\nfumaça escura que ele apareceu, ela parece presa em uma caixa de invisivel, 'batendo'" +
            "\nna parede e gritando socorro, mas você não consegue escutar. Com a mesma velocidade em" +
            "\nque ela apareceu, ela desaparece.");
        pressEnter();
        System.out.println("\nCoven: E agora " + player + "?");
        pressEnter();
        System.out.println("\nConfiante, você olha no fundo dos olhos dele e responde.");
        System.out.println("\n" + nomePer + ": Muito bem, eu aceito!");
        System.out.println("\nEle da o mesmo sorriso assustador de antes.");

        do {
          menu = 0;
          System.out.println("\nCoven: Seu desafio é o seguinte.");
          System.out.println("\nQuais são as raízes da equação x² - x - 30 = 0?");
          vida();
          System.out.println("\n0- Menu\n");
          System.out.println("\nA) -6 e -5\nB) -1 e -30\nC) 6 e -5\nD) 30 e 1\nE) -6 e 5\n");
          decisao = input.next();

          switch (decisao) {
            case "C":
            case "c":
              System.out.println("\n" + nomePer + ": " + decisao);
              System.out.println("\n"+vetor[0]);
              break;
            case "A":
            case "a":
            case "B":
            case "b":
            case "D":
            case "d":
            case "E":
            case "e":
              System.out.println("\n" + nomePer + ": " + decisao);
              System.out.println("\n"+vetor[1]);
              vidas = 0;
              System.out.println("\nCoven: Eu sabia que você jamais conseguiria me derrotar, eu sou invencível!" +
                  "\nMas nós tinhamos um acordo, a princesa está livre e de volta ao castelo, agora você é meu!");
              System.out.println("\nSem que você pudesse reagir, ele segura o seu pescoço com umas das mãos geladas," +
                  "\nte coloca bem perto do rosto dele e começa a sugar todo o seu conhecimento." +
                  "\nVocê começa a atrofiar e em questão de segundos se transforma em pó.");
              pressEnter();
              System.out.println("\nA princesa acordou em seu quarto, desceu as escadas e foi de encontro ao pai." +
                  "\nDepois de se abraçarem e matarem a saudade, o Rei perguntou onde estava o" +
                  "\njovem que ele enviou para salva-la, a princesa então começou a chorar e" +
                  "\ncontou tudou ao pai. O Rei mandou então construir uma estátua sua na praça" +
                  "\ndo reino, em homenagem a você por ter salvado a princesa e você sempre foi" +
                  "\nlembrado pela sua coragem e por ter salvado a princesa do reino Tristam.\n");

              System.out.println("\nFim!\n");

              System.out.println("\nInfelizmente, você não conseguiu derrotar o Mestre dos Bruxos, mas esperamos" +
                  "\nque tenha gostado e agradecemos por jogar!");
              escolha = creditos(input);
              if (escolha == 1) {
                menu = 2;
              }
              break;
            case "0":
              menu = pause(input);
              break;
            default:
              System.out.println("Resposta inválida, tente novamente!");
              menu = 1;
              break;
          }
        } while (menu == 1);
      } while (menu == 2);

      System.out.println("\nCoven: O QUE? NINGUÉM JAMAIS ME DERROT...");

      System.out.println("\nO Mestre dos Bruxos começa a se transformar em pó, derrepente somente suas roupas" +
          "\nestavam no chão, junto com o que ele se tornou. A princesa surge sobre você e você" +
          "\na segura nos braços, evitando a de cair no chão, ela olha para você e agradece, vocês" +
          "\npercebem que as paredes da Catedral começam a desmoronar, já que ela era sustentada" +
          "\npela magia de Coven, assim como todos os Bruxos subordinados, vocês dois começam a correr" +
          "\nem direção a porta de saída, a mesma que ja não estava mais trancada pela magia, após" +
          "\npassarem por ela, desviar dos destroços que estavam caindo e pular pela janela, vocês caem" +
          "\nao lado da Catedral que em questão de minutos se torna apenas um monte de entulho.");
      pressEnter();
      System.out.println("\nVocê olha para a princesa e pergunta se ela está bem, ela confirma com a cabeça e" +
          "\nagradece por salvar ela.");
      System.out.println("\nVocê consulta o mapa para ver em qual direção seguir, os dois se levantam e seguem" +
          "\npelo caminho que você veio, estava começando a escurecer e vocês aceleram o passo," +
          "\nlogo passam pela pedra onde você encontrou o 4º Bruxo, proximo a ela, vocês veem" +
          "\nsomente a capa do Bruxo e seus restos mortais em pó, igual ao Coven. Vocês continuam" +
          "\naté que avistam a vila pela qual você passou. Chegando nela já haavia escurecido e" +
          "\nvocês procuram por uma estalagem, assim que encontram, entram nela e pedem um quarto" +
          "\npassam a noite na vila e acordam com barulhos de batida na porta.");
      System.out.println("\nDUM! DUM! DUM! DUM!\n");
      pressEnter();
      System.out.println("Vocês acordam assustados, se prepara para o pior e vai até em direção a porta devagar," +
          "\nentão você escuta a voz do plebeu que te levou até o bruxo.");
      System.out.println("\nPlebeu: Hey " + player + ", sou eu, abra a porta.");
      pressEnter();
      System.out.println("\nVocê abre a porta devagar e olho no rosto dele, ele parecia assustado em te ver.");
      pressEnter();
      System.out.println("\nPlebeu: Vo-você conseguiu? Co-como ainda esta vivo?");
      pressEnter();
      System.out.println("\nVocê abre a porta completamente e sorri.\n" +
          "\n" + nomePer + ": Estamos bem, eu consegui derrotar o Mestre dos Bruxos e sair de la com a princesa.");
      pressEnter();
      System.out.println("\nEle abre a boca impressionado.");
      System.out.println("\nPlebeu: Fico feliz que estejam bem e tenham conseguido.");
      pressEnter();
      System.out.println("\nPlebeu: Sinto muito ter te levado até aquele lugar, eu não sei o que aconteceu," +
          " não conseguiu controlar o meu corpo.");
      System.out.println("\nVocê apenas concorda com a cabeça.");
      pressEnter();
      System.out.println("\nPlebeu: Deixe me levar vocês até o castelo na mina carroça, é o minimo que posso fazer.");
      pressEnter();
      System.out.println("\nVocê olha na direção da princesa, depois vira na direção dele, aceita e agradece," +
          "\nvocês juntam suas coisas e seguem ele até a carroça. O sol havia acabado de nascer" +
          "\ne você respira fundo aliviado, tinha conseguido cumprir a sua missão. Um pouco mais" +
          "\ntarde, depois de algumas horas de viagem, vocês chegam ao castelo, o Rei de Tristam" +
          "\naguardava ansioso no trono. Vocês se despedem do plebeu e agradecem mais uma vez," +
          "\nassim que entram no castelo e na sala do trono, o Rei corre em direção a sua filha" +
          "\ne comemora alegremente a volta dela. Depois de alguns choros, ele volta para você" +
          "\ne agradece por ter conseguido, pede para contar com detalhes como foi a sua jornada" +
          "\ne depois de horas, você termina a história. O Rei então planeja uma festa com todos" +
          "\ndo reino para comemorar a volta de sua filha.");
      pressEnter();
      System.out.println("\nFoi uma grande festa que durou 7 dias, a princesa se apaixonou por você e você se" +
          "\ncasaram. Após alguns anos, assumiram junto o trono e governaram felizes por muitos" +
          "\nanos.\n");

      System.out.println("\nFim!\n");

      System.out.println("\nAgradecemos por jogar e esperamos que tenham gostado!");

      escolha = creditos(input);

    }while(escolha==1);
  }

  public static int menuPrincipal(Scanner input){
    //método para chamar o menu principal, do inicio do jogo.
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
    //método para chamar as instruções quando selecionado no menu ou nas opções.
    int escolha;

    System.out.println("\n-------INTRUÇÕES-------");
    System.out.println("\nO jogador deve escolher uma classe e um nome para iniciar o jogo. Feito isso,\n" +
                       "uma pequena introdução irá explicar qual é o objetivo do jogador e o que ele\n" +
                       "vai enfrentar. Você terá 5 vidas, que são representadas da forma abaixo.");
    System.out.print("Exemplo: ");
    vida();
    System.out.println("Se você as zerar, perde o jogo. Alem disso, também possuem cogumelos durante o" +
        "\njogo, que são eventos de sorte e que podem: Somar, Subtrair ou simplesmente não" +
        "\nacontecer nada com suas vidas.");

    System.out.println("\nMuito cuidado com suas decisões. Cada escolha que fizer terá consequências," +
                       "\nsejam elas boas ou ruins.");

    System.out.println("\n1- Voltar ao menu\n");
    escolha = input.nextInt();

    return escolha;
  }

  public static int creditos(Scanner input){
    //método para chamar os créditos, tanto no final, quanto quando selecionado no menu ou nas opções.
    int escolha;

    System.out.println("\n-------CRÉDITOS-------");
    System.out.println("\n---DESENVOLVEDORES---");
    System.out.println("\nGabriel Machado de Lima" +
        "\nDouglas Proença Rolim de Souza" +
        "\nStéfane Cristina Timote" +
        "\nVinicius Lopes Paz Silva");
      System.out.println("\n1- Voltar ao menu\n");
      escolha = input.nextInt();

    return escolha;
  }

  public static void personagem(Scanner input){
    //método utilizado para seleção dos personagens, tanto no incio quanto quando o jogador quiser
    //alterar durante o game.
    int escolha;

    System.out.println("\n-----------PERSONAGENS-----------");
    do {
      System.out.println("\nEscolha uma classe para jogar:");
      System.out.println("1- Cavaleiro\n2- Feiticeiro\n3- Bardo\n");
      escolha = input.nextInt();
      if (escolha == 1) {
        System.out.println("\nCavaleiros: Os cavaleiros são guerreiros que defendem o território em torno" +
            "\ndo castelo e estão sob as ordens do Rei.");
        do {
          System.out.println("\nVocê deseja ser Cavaleiro?\n1- Sim\n2- Não\n");
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
        System.out.println("\nFeiticeiros: Os feiticeiros conseguem desenvolver o poder naturalmente, tendo" +
            "\nmenos habilidade que os bardos e usam sempre as mesmas magias.");
        do {
          System.out.println("\nVocê deseja ser Feiticeiro?\n1- Sim\n2- Não\n");
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
        System.out.println("\nBardos: Os bardos usam talentos artísticos para induzir efeitos mágicos, dando" +
            "\nsuporte a seus aliados e conseguem adquirir mais magias através de pergaminhos" +
            "\ne livros.");
        do {
          System.out.println("\nVocê deseja ser Bardo?\n1- Sim\n2- Não\n");
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
    //método para dar nome ao personagem, tanto no inicio quanto durante o jogo, caso o jogador deseje.
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

  public static int pause(Scanner input){
    //método utilizado para chamar o menu de pausa durante o jogo.
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
    //método para chamar as opções quando selecionado no menu de pause do jogo.
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

  public static void vida(){
    //método para contabilização das vidas e para sua impressão quando necessario.
    for(int i=0;i<vidas;i++){
      String coracao = "♡";
      System.out.print(coracao);
    }
    System.out.print("\n");
  }

  public static void gameOver(){
    if(vidas<=0){
      System.out.println("\nGAME OVER!\n");
      System.out.println("Você perdeu todas as suas vidas!\n");
      System.out.println("Obrigado por jogar!");
      System.exit(0);
    }
  }

  public static void sorte(){
    Random random = new Random();
    int sorte;

    do {
      sorte = random.nextInt(7);

      switch (sorte) {
        case 1:
        case 4:
          System.out.println("\nVocê realmente tem sorte "+player+". Você ganhou uma vida!\n");
          vidas = vidas + 1;
          break;
        case 2:
        case 5:
          System.out.println("\nVocê não teve sorte dessa vez "+player+". Você perdeu uma vida!\n");
          vidas = vidas - 1;
          break;
        case 3:
        case 6:
          System.out.println("\nNão aconteceu nada, seria isso sorte ou azar?\n");
          break;
        default:
          sorte = 0;
          break;
      }
    }while (sorte==0);
      gameOver();
  }

  public static void pressEnter(){
    Scanner input = new Scanner(System.in);
    System.out.print("(press ENTER)\n");

    input.nextLine();
  }
}

