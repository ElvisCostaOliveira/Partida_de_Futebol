package main;
import java.util.Scanner;

public class GerenciadorPartidaFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usu�rio que digite o nome do time mandante
        System.out.print("Digite o nome do time mandante: ");
        String nomeMandante = scanner.nextLine();
        Time timeMandante = new Time(nomeMandante);

        // Solicita ao usu�rio que digite o nome do time visitante
        System.out.print("Digite o nome do time visitante: ");
        String nomeVisitante = scanner.nextLine();
        Time timeVisitante = new Time(nomeVisitante);

        int opcao;
        do {
            // Exibe as op��es do menu
            System.out.println("----- Menu de Op��es -----");
            System.out.println("1. Adicionar jogador ao time mandante");
            System.out.println("2. Adicionar jogador ao time visitante");
            System.out.println("3. Registrar gol do time mandante");
            System.out.println("4. Registrar gol do time visitante");
            System.out.println("0. Encerrar partida");
            System.out.print("Escolha uma op��o: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adiciona um jogador ao time mandante
                    scanner.nextLine();
                    System.out.print("Digite o nome do jogador: ");
                    String nomeJogadorMandante = scanner.nextLine();
                    System.out.print("Digite o n�mero da camisa do jogador: ");
                    int camisaJogadorMandante = scanner.nextInt();
                    Jogador jogadorMandante = new Jogador(nomeJogadorMandante, camisaJogadorMandante);
                    timeMandante.adicionarJogador(jogadorMandante);
                    break;
                case 2:
                    // Adiciona um jogador ao time visitante
                    scanner.nextLine();
                    System.out.print("Digite o nome do jogador: ");
                    String nomeJogadorVisitante = scanner.nextLine();
                    System.out.print("Digite o n�mero da camisa do jogador: ");
                    int camisaJogadorVisitante = scanner.nextInt();
                    Jogador jogadorVisitante = new Jogador(nomeJogadorVisitante, camisaJogadorVisitante);
                    timeVisitante.adicionarJogador(jogadorVisitante);
                    break;
                case 3:
                    // Registra um gol para o time mandante
                    if (timeMandante.getJogadores().isEmpty()) {
                        System.out.println("Adicione jogadores ao time mandante primeiro!");
                        break;
                    }
                    System.out.print("Digite o n�mero da camisa do jogador que marcou o gol: ");
                    int camisaGolMandante = scanner.nextInt();
                    Jogador jogadorGolMandante = null;
                    for (Jogador jogador : timeMandante.getJogadores()) {
                        if (jogador.getNumeroCamisa() == camisaGolMandante) {
                            jogadorGolMandante = jogador;
                            break;
                        }
                    }
                    if (jogadorGolMandante == null) {
                        System.out.println("N�mero de camisa inv�lido!");
                        break;
                    }
                    PartidaFutebol partida = new PartidaFutebol(timeMandante, timeVisitante);
                    partida.registrarGol(timeMandante, jogadorGolMandante);
                    break;
                case 4:
                	
//                	Nesta parte, o programa come�a pedindo ao usu�rio que digite os nomes dos times mandante e visitante. 
//                	Em seguida, � apresentado um menu com op��es:
//                	Adicionar jogador ao time mandante: Permite adicionar um jogador ao time mandante. 
//                	Solicita o nome e o n�mero da camisa do jogador e cria um objeto Jogador, que � adicionado ao time mandante.
//                	
//                	Adicionar jogador ao time visitante: Funciona da mesma forma que a op��o 1, mas adiciona o jogador ao time visitante.
//                	Registrar gol do time mandante: Permite registrar um gol para o time mandante. Solicita o n�mero da camisa do jogador que marcou 
//                	o gol e verifica se o n�mero � v�lido, ou seja, se corresponde a um jogador do time mandante. Em seguida, cria um objeto PartidaFutebol e 
//                	chama o m�todo registrarGol, passando o time mandante e o jogador que marcou o gol.
//                	
//                	Registrar gol do time visitante: Funciona da mesma forma que a op��o 3, mas registra o gol para o time visitante.
                	
//                	Encerrar partida: Encerra a partida se houver pelo menos um jogador em cada time. Caso contr�rio, exibe uma mensagem informando 
//                	que � necess�rio adicionar jogadores antes de encerrar a partida.
//                	Ap�s o t�rmino do loop do-while, � verificado se a op��o escolhida � 0 (Encerrar partida). Se for, � criado um objeto PartidaFutebol e chamado 
//                	o m�todo exibirResultado, que mostra o resultado da partida, o n�mero de gols de cada time e a lista de jogadores que marcaram gols para cada time.

                case 0:
                    if (timeMandante.getJogadores().isEmpty() || timeVisitante.getJogadores().isEmpty()) {
                        System.out.println("Adicione jogadores aos times antes de encerrar a partida!");
                        opcao = -1;
                    }
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
                    break;
            }
        } while (opcao != 0);

        if (opcao == 0) {
            PartidaFutebol partida = new PartidaFutebol(timeMandante, timeVisitante);
            partida.exibirResultado();
        }
    }
}

//Nesta parte do c�digo, ap�s o t�rmino do loop do-while, � verificado se a op��o escolhida � 0 (Encerrar partida). 
//Se for, � verificado se h� jogadores em ambos os times. Se algum dos times n�o tiver jogadores, � exibida uma mensagem informando que � 
//necess�rio adicionar jogadores antes de encerrar a partida.

//Depois disso, fora do loop, � criado um objeto PartidaFutebol com os times mandante e visitante e, em seguida, 
//� chamado o m�todo exibirResultado(), que mostra o resultado da partida.



