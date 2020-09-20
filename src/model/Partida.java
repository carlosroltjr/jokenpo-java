package model;

import java.util.Scanner;

public class Partida implements Motor {

    public Partida() {}

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        Jogador jogador = new Jogador(scanner.nextLine());
        Computador computador = new Computador();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha Pedra, Papel ou Tesoura");
            jogador.setJogada(scanner.nextLine());
            computador.setJogada(computador.gerarJogadaAleatoria());

            compararJogadas(jogador, computador);

            System.out.println("Placar: " + jogador.getNome() + " " +  jogador.getPontuacao() + " e " + "Computador " + computador.getPontuacao());

            System.out.println("Jogar novamente? [s / n]");
            continuar = scanner.nextLine().equals("s");
        }


    }

    public void compararJogadas(Jogador jogador, Computador computador) {
        String jogada1 = jogador.getJogada();
        String jogada2 = computador.getJogada();

        System.out.println(jogador.getNome() + " jogou " + jogada1);
        System.out.println("Computador jogou " + jogada2);

        if (jogada1.equals("Pedra") && jogada2.equals("Papel")) {
            computador.setPontuacao(computador.getPontuacao() + 1);
            System.out.println("Computador ganhou!");
        } else if (jogada1.equals("Pedra") && jogada2.equals("Tesoura")) {
            jogador.setPontuacao(jogador.getPontuacao() + 1);
            System.out.println(jogador.getNome() + " ganhou!");
        } else if (jogada1.equals("Papel") && jogada2.equals("Pedra")) {
            jogador.setPontuacao(jogador.getPontuacao() + 1);
            System.out.println(jogador.getNome() + " ganhou!");
        } else if (jogada1.equals("Papel") && jogada2.equals("Tesoura")) {
            computador.setPontuacao(computador.getPontuacao() + 1);
            System.out.println("Computador ganhou!");
        } else if (jogada1.equals("Tesoura") && jogada2.equals("Pedra")) {
            computador.setPontuacao(computador.getPontuacao() + 1);
            System.out.println("Computador ganhou!");
        } else if (jogada1.equals("Tesoura") && jogada2.equals("Papel")) {
            jogador.setPontuacao(jogador.getPontuacao() + 1);
            System.out.println(jogador.getNome() + " ganhou!");
        }
    }
}
