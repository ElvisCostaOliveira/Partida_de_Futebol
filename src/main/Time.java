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

//A classe Time representa um time de futebol. Ela possui dois atributos: nome e jogadores. O construtor da classe recebe o nome do time e inicializa a lista de jogadores vazia.
//
//A classe possui tr�s m�todos p�blicos:
//
//O m�todo adicionarJogador(Jogador jogador) recebe um objeto Jogador como par�metro e adiciona esse jogador � lista de jogadores do time.
//
//O m�todo getJogadores() retorna a lista de jogadores do time.
//
//O m�todo getNome() retorna o nome do time.
//
//Essa � a explica��o do c�digo fornecido. Espero que isso ajude a compreender o funcionamento do programa!