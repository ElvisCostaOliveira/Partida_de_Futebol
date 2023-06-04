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
//A classe possui três métodos públicos:
//
//O método adicionarJogador(Jogador jogador) recebe um objeto Jogador como parâmetro e adiciona esse jogador à lista de jogadores do time.
//
//O método getJogadores() retorna a lista de jogadores do time.
//
//O método getNome() retorna o nome do time.
//
//Essa é a explicação do código fornecido. Espero que isso ajude a compreender o funcionamento do programa!