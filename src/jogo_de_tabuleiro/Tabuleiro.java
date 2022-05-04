package jogo_de_tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1){
            throw new ExecoesDoTabuleiro("Ao criar o tabuleiro ocorreu um erro: é importante que haja ao menos 1 linha e 1 coluna.");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna){
        if (!posicaoExiste(posicao)){
            throw new ExecoesDoTabuleiro("Posição não está de acordo com o tamanho do tabuleiro.");
        }
        return  pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }


    public void colocarPeca(Peca peca, Posicao posicao){
        if (eUmaPeca(posicao)){
            throw new ExecoesDoTabuleiro("já existe uma peça na possição " + posicao);
        }
        pecas[posicao.getLinha()] [posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExiste(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
    }

    public boolean eUmaPeca(Posicao posicao){
        if (!posicaoExiste(posicao)){
            throw new ExecoesDoTabuleiro("Posição não está de acordo com o tamanho do tabuleiro.");
        }
       return peca(posicao) != null;
    }


}
