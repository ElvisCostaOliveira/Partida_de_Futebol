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


//A classe PartidaFutebol representa uma partida de futebol. 
//Ela possui três atributos: timeMandante, timeVisitante e gols. O construtor da classe recebe como parâmetros os times mandante e visitante e inicializa esses atributos. 
//Além disso, é criada uma lista vazia de gols.
//
//A classe possui três métodos públicos:
//O método registrarGol(Time time, Jogador jogador) recebe como parâmetros o time que marcou o gol e o jogador que marcou o gol. 
//Ele adiciona o jogador à lista de gols e exibe uma mensagem informando o time e o jogador que marcou o gol.
//
//O método exibirResultado() mostra o resultado da partida. Ele exibe o nome dos times, a quantidade de gols de cada time e a lista de jogadores que marcaram gols para cada time.

//Os métodos privados contarGols(Time time) e exibirGols(Time time) são utilizados internamente para contar a quantidade de gols de um determinado time e 
//exibir a lista de gols desse time, respectivamente.







