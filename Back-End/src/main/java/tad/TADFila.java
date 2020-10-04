package tad;

public class TADFila {

    int inicio, fim, numelem,tamanho;
    Object array[];

    public TADFila(int tam){
        this.inicio = 0;
        this.fim = 0;
        this.numelem = 0;
        this.tamanho=tam;
        this.array = new Object[tam];
    }
    public TADFila(){}

    public boolean vazia(){
        if(numelem==0)
            return true;
        return false;
    }
    public boolean cheia(){
        if(numelem==tamanho)
            return true;
        return false;
    }
    public void inserir(Object elem){
        if(!cheia()){
            array[fim]=elem;
            numelem++;
            fim++;
            if(fim==tamanho)
                fim=0;
            System.out.println("Estou aqui tambem!");
            System.out.println(array[0]);
        }
        else
            System.out.println("Fila Cheia");
    }
    public Object remover(){
        Object temp=null;
        if(!vazia()){
            temp=array[inicio];
            array[inicio]=null;
            inicio++;
            numelem--;
            if(inicio==tamanho)
                inicio=0;
        }
        else
            System.out.println("Fila vazia");
        return temp;
    }
}

//public class TADFila {
//    private Produto lista[];
//    private int inicio;
//    private int fim;
//    private boolean vazia;
//
//    public TADFila() {
//        this.lista = new Produto[20];
//        this.inicio = 0;
//        this.fim = 0;
//        this.vazia = true;
//    }
//
//    public boolean isCheia() {
//        return this.inicio == this.fim && !this.vazia;
//    }
//
//    public void adicionar(Produto produto) {
//        if (isCheia()) {
//            throw new IllegalStateException("Fila cheia");
//        }
//        this.lista[this.fim] = produto;
//        this.fim = (this.fim + 1) % this.lista.length;
//        this.vazia = false;
//    }
//
//    public int remover() {
//        if (this.vazia) {
//            throw new IllegalStateException("Fila vazia");
//        }
//        Produto produto = this.lista[inicio];
//        this.inicio = (this.inicio + 1) % this.lista.length;
//        this.vazia = this.inicio == this.fim;
//        return 0;
//    }
//
//    public void mostrar() {
//        int inicio = this.inicio;
//        if (this.isCheia()) {
//            System.out.println(this.lista[this.inicio]);
//            inicio++;
//        }
//        for (int i = inicio; i != this.fim; i = (i + 1) % this.lista.length) {
//            System.out.println(this.lista[i]);
//        }
//    }
//
//    public int getTamanho() {
//        System.out.println(this.inicio + ", " + this.fim);
//        if (this.vazia)
//            return 0;
//        if (this.isCheia())
//            return this.lista.length;
//        if (this.fim > this.inicio)
//            return this.fim - this.inicio;
//
//        return this.fim + this.lista.length - this.inicio;
//    }
//}