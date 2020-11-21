package tadArvore;

public class NoAbb {

    private int valor;
    private NoAbb noAbbEsquerda;
    private NoAbb noAbbDireita;

    public NoAbb(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public NoAbb getNoAbbEsquerda() {
        return noAbbEsquerda;
    }

    public void setNoAbbEsquerda(NoAbb noAbbEsquerda) {
        this.noAbbEsquerda = noAbbEsquerda;
    }

    public NoAbb getNoAbbDireita() {
        return noAbbDireita;
    }

    public void setNoAbbDireita(NoAbb noAbbDireita) {
        this.noAbbDireita = noAbbDireita;
    }


}
