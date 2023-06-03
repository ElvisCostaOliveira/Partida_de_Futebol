package main;
import java.util.Scanner;

public class GerenciadorPartidaFutebol {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do time mandante: ");
		String nomeMandante = scanner.nextLine();
		Time timeMandante = new Time(nomeMandante);

		System.out.print("Digite o nome do time visitante: ");
		String nomeVisitante = scanner.nextLine();
		Time timeVisitante = new Time(nomeVisitante);

		int opcao;
		do {
			System.out.println("----- Menu de Opções -----");
			System.out.println("1. Adicionar jogador ao time mandante");
			System.out.println("2. Adicionar jogador ao time visitante");
			System.out.println("3. Registrar gol do time mandante");
			System.out.println("4. Registrar gol do time visitante");
			System.out.println("0. Encerrar partida");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				scanner.nextLine();
				System.out.print("Digite o nome do jogador: ");
				String nomeJogadorMandante = scanner.nextLine();
				System.out.print("Digite o número da camisa do jogador: ");
				int camisaJogadorMandante = scanner.nextInt();
				Jogador jogadorMandante = new Jogador(nomeJogadorMandante, camisaJogadorMandante);
				timeMandante.adicionarJogador(jogadorMandante);
				break;
			case 2:
				scanner.nextLine();
				System.out.print("Digite o nome do jogador: ");
				String nomeJogadorVisitante = scanner.nextLine();
				System.out.print("Digite o número da camisa do jogador: ");
				int camisaJogadorVisitante = scanner.nextInt();
				Jogador jogadorVisitante = new Jogador(nomeJogadorVisitante, camisaJogadorVisitante);
				timeVisitante.adicionarJogador(jogadorVisitante);
				break;
			case 3:
				if (timeMandante.getJogadores().isEmpty()) {
					System.out.println("Adicione jogadores ao time mandante primeiro!");
					break;
				}
				System.out.print("Digite o número da camisa do jogador que marcou o gol: ");
				int camisaGolMandante = scanner.nextInt();
				Jogador jogadorGolMandante = null;
				for (Jogador jogador : timeMandante.getJogadores()) {
					if (jogador.getNumeroCamisa() == camisaGolMandante) {
						jogadorGolMandante = jogador;
						break;
					}
				}
				if (jogadorGolMandante == null) {
					System.out.println("Número de camisa inválido!");
					break;
				}
				PartidaFutebol partida = new PartidaFutebol(timeMandante, timeVisitante);
				partida.registrarGol(timeMandante, jogadorGolMandante);
				break;
			case 4:
				if (timeVisitante.getJogadores().isEmpty()) {
					System.out.println("Adicione jogadores ao time visitante primeiro!");
					break;
				}
				System.out.print("Digite o número da camisa do jogador que marcou o gol: ");
				int camisaGolVisitante = scanner.nextInt();
				Jogador jogadorGolVisitante = null;
				for (Jogador jogador : timeVisitante.getJogadores()) {
					if (jogador.getNumeroCamisa() == camisaGolVisitante) {
						jogadorGolVisitante = jogador;
						break;
					}
				}
				if (jogadorGolVisitante == null) {
					System.out.println("Número de camisa inválido!");
					break;
				}
				partida = new PartidaFutebol(timeMandante, timeVisitante);
				partida.registrarGol(timeVisitante, jogadorGolVisitante);
				break;
			case 0:
				if (timeMandante.getJogadores().isEmpty() || timeVisitante.getJogadores().isEmpty()) {
					System.out.println("Adicione jogadores aos times antes de encerrar a partida!");
					opcao = -1;
				}
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);

		if (opcao == 0) {
			PartidaFutebol partida = new PartidaFutebol(timeMandante, timeVisitante);
			partida.exibirResultado();
		}
	}
}