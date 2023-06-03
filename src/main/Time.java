package main;
import java.util.ArrayList;

class Time {
	private String nome;
	private ArrayList<Jogador> jogadores;

	public Time(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<>();
	}

	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public String getNome() {
		return nome;
	}
}