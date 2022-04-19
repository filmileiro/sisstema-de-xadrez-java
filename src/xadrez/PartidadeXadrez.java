package xadrez;

import tabuleiro.Tabuleiro;

public class PartidadeXadrez {
    private Tabuleiro tabuleiro;

    //Passando o tamanho do tabuleiro
    public PartidadeXadrez(){
        tabuleiro = new Tabuleiro(8,8);

    }
    // Esse método retornará uma matriz de peças de xadrez correspondentes da partida.
    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat  = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
}
