package model;

public class Jogador extends Participante {

    private final String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
