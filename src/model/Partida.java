package model;

public class Partida implements Motor {

    public Participante compararJogadas(Participante jogador1, Participante jogador2) {
        String jogada1 = jogador1.getJogada();
        String jogada2 = jogador2.getJogada();

        if (jogada1.equals("Pedra") && jogada2.equals("Papel")) {
            jogador2.setPontuacao(jogador2.getPontuacao() + 1);
            return jogador2;
        } else if (jogada1.equals("Pedra") && jogada2.equals("Tesoura")) {
            jogador1.setPontuacao(jogador1.getPontuacao() + 1);
            return jogador1;
        } else if (jogada1.equals("Papel") && jogada2.equals("Pedra")) {
            jogador1.setPontuacao(jogador1.getPontuacao() + 1);
            return jogador1;
        } else if (jogada1.equals("Papel") && jogada2.equals("Tesoura")) {
            jogador2.setPontuacao(jogador2.getPontuacao() + 1);
            return jogador2;
        } else if (jogada1.equals("Tesoura") && jogada2.equals("Pedra")) {
            jogador2.setPontuacao(jogador2.getPontuacao() + 1);
            return jogador2;
        } else if (jogada1.equals("Tesoura") && jogada2.equals("Papel")) {
            jogador1.setPontuacao(jogador1.getPontuacao() + 1);
            return jogador1;
        } else {
            return null;
        }
    }
}
