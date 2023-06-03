package main;
import java.util.ArrayList;

class PartidaFutebol {
	private Time timeMandante;
	private Time timeVisitante;
	private ArrayList<Jogador> gols;

	public PartidaFutebol(Time timeMandante, Time timeVisitante) {
		this.timeMandante = timeMandante;
		this.timeVisitante = timeVisitante;
		this.gols = new ArrayList<>();
	}

	public void registrarGol(Time time, Jogador jogador) {
		gols.add(jogador);
		System.out.println("Gol do " + time.getNome() + " - " + jogador.getNome());
	}

	public void exibirResultado() {
		System.out.println("Resultado da partida:");
		System.out.println(timeMandante.getNome() + " " + contarGols(timeMandante) + " x " + contarGols(timeVisitante)
				+ " " + timeVisitante.getNome());
		System.out.println("Gols do " + timeMandante.getNome() + ":");
		exibirGols(timeMandante);
		System.out.println("Gols do " + timeVisitante.getNome() + ":");
		exibirGols(timeVisitante);
	}

	private int contarGols(Time time) {
		int totalGols = 0;
		for (Jogador jogador : gols) {
			if (time.getJogadores().contains(jogador)) {
				totalGols++;
			}
		}
		return totalGols;
	}

	private void exibirGols(Time time) {
		for (Jogador jogador : gols) {
			if (time.getJogadores().contains(jogador)) {
				System.out.println(jogador.getNumeroCamisa() + " - " + jogador.getNome());
			}
		}
	}
}