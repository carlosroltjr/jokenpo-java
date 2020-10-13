package test;

import model.Computador;
import model.Participante;
import model.Partida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida();
        Computador computador = new Computador("Computador");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        Participante jogador = new Participante(scanner.nextLine());

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha Pedra, Papel ou Tesoura");
            jogador.setJogada(scanner.nextLine());
            computador.setJogada(computador.gerarJogadaAleatoria());

            System.out.println(jogador.getNome() + " jogou " + jogador.getJogada());
            System.out.println(computador.getNome() + " jogou " + computador.getJogada());

            Participante vencedor = partida.compararJogadas(jogador, computador);

            if (vencedor == null) {
                System.out.println("Empate!");
            } else {
                System.out.println(vencedor.getNome() + " ganhou!");
                System.out.println("Placar: " + jogador.getNome() + " " +  jogador.getPontuacao() +
                        " e " + computador.getNome() + " " + computador.getPontuacao());
            }

            System.out.println("Jogar novamente? [s / n]");
            continuar = scanner.nextLine().equals("s");
        }
    }
}
