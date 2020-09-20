package model;

import java.util.Random;

public class Computador extends Participante {

    public String gerarJogadaAleatoria() {
        Random random = new Random();

        int jogada = random.nextInt(3) + 1;

        return switch (jogada) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            default -> "Tesoura";
        };
    }
}
