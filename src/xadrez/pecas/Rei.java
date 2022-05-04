package xadrez.pecas;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

    public Rei(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
