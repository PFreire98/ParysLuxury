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

    public void setValor(int valor) {
        this.valor =  valor;
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

    public NoAbb sucessor(NoAbb no)
    {
        NoAbb sucessor = no;

        sucessor = sucessor.getNoAbbDireita();

        while(sucessor.getNoAbbEsquerda() != null)
            sucessor = sucessor.getNoAbbEsquerda();

        return sucessor;
    }

    public NoAbb antecessor(NoAbb no)
    {
        NoAbb antecessor = no;

        antecessor = antecessor.getNoAbbEsquerda();

        while(antecessor.getNoAbbDireita() != null)
        {
            antecessor = antecessor.getNoAbbDireita();
        }

        return antecessor;
    }

}
