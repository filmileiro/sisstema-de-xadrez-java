package aplicacao;

import tabuleiro.Tabuleiro;
import xadrez.PartidadeXadrez;

public class Programa {
    public static void main(String[] args) {

        PartidadeXadrez p1 = new PartidadeXadrez();
        UI.printBoard(p1.getPecas());

    }
}
