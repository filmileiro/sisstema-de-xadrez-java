package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeChadrez extends Peca {

    private Color color;

    public PecaDeChadrez(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



}
