package aplicacao;

import xadrez.PartidadeXadrez;

public class Programa {
    public static void main(String[] args) {

        PartidadeXadrez p1 = new PartidadeXadrez();
        //Inteface de usuario
        UI.printBoard(p1.getPecas());

    }
}
