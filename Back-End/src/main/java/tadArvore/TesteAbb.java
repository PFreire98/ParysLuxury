package tadArvore;

public class TesteAbb {
    public static void main(String[] args) {

        Abb abb = new Abb();
        abb.inserir(10);
        abb.inserir(4);
        abb.inserir(15);
        abb.inserir(5);
        abb.inserir(2);
        abb.inserir(7);
        abb.inserir(9);
        abb.inserir(20);
        abb.inserir(22);
        abb.ordem(abb.raiz);
        abb.excluir(7);
        System.out.println(" ");
        abb.ordem(abb.raiz);
    }
}
