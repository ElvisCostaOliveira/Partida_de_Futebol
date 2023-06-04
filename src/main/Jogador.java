package main;

class Jogador {
    private String nome;
    private int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }
}

//A classe Jogador representa um jogador de futebol. Ela possui dois atributos: nome e numeroCamisa. 
//O construtor da classe recebe o nome e o número da camisa como parâmetros e atribui esses valores aos atributos correspondentes.
//
//Além disso, a classe possui dois métodos de acesso (getters): getNome() retorna o nome do jogador e getNumeroCamisa() retorna o número da camisa do jogador.