package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca {

    private Cor color;

    public PecaDeXadrez(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro);
        this.color = color;
    }

    public Cor getColor() {
        return color;
    }



}
