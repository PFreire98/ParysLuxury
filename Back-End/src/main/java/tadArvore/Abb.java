package tadArvore;

public class Abb {

    public NoAbb raiz;

    public void inserir(int valor) {
        inserir(raiz, valor);
    }

    public void inserir(NoAbb _no, int valor) {
        if (_no == null) {
            System.out.println("Raiz " + valor);
            raiz = new NoAbb(valor);
        } else {
            if (valor < _no.getValor()) {
                if (_no.getNoAbbEsquerda() != null) {
                    inserir(_no.getNoAbbEsquerda(), valor);
                } else {
                    System.out.println("Inserindo " + valor + " a esquerda de " + _no.getValor());
                    _no.setNoAbbEsquerda(new NoAbb(valor));
                }

            } else {
                if (_no.getNoAbbDireita() != null) {
                    inserir(_no.getNoAbbDireita(), valor);
                } else {
                    System.out.println("Inserindo " + valor + " a direita de " + _no.getValor());
                    _no.setNoAbbDireita(new NoAbb(valor));
                }
            }
        }
    }

    public NoAbb excluir(int v) {
        if (raiz == null) {
            NoAbb _no = new NoAbb(v);
            return _no;
        }

        NoAbb cursor = raiz;
        NoAbb aux;
        if (cursor.getValor() == v) {
            if (cursor.getNoAbbDireita() == null && cursor.getNoAbbEsquerda() == null) {
                aux = raiz;
                raiz = null;
                return aux;
            }else return null;
        }

        while (true) {

            if (cursor.getValor() < v) {
                aux = cursor;
                cursor = cursor.getNoAbbDireita();
                if (cursor == null)
                    return new NoAbb(v);
                if (cursor.getValor() == v) {
                    if (cursor.getNoAbbEsquerda() == null && cursor.getNoAbbDireita() == null) {
                        aux.setNoAbbDireita(null);
                        return cursor;
                    } else return null;
                }
            } else if (cursor.getValor() > v) {
                aux = cursor;
                cursor = cursor.getNoAbbEsquerda();
                if (cursor == null)
                    return new NoAbb(v);
                if (cursor.getValor() == v) {
                    if (cursor.getNoAbbEsquerda() == null && cursor.getNoAbbDireita() == null) {
                        aux.setNoAbbEsquerda(null);
                        return cursor;
                    } else return null;
                }
            }

        }
    }

    public void preordem(NoAbb _no) {
        if (_no != null) {
            System.out.print(_no.getValor() + ", ");
            preordem(_no.getNoAbbEsquerda());
            preordem(_no.getNoAbbDireita());

        }
    }

    public void posordem(NoAbb _no) {
        if (_no != null) {

            posordem(_no.getNoAbbEsquerda());
            posordem(_no.getNoAbbDireita());
            System.out.print(_no.getValor() + ", ");

        }

    }

    public void ordem(NoAbb _no) {
        if (_no != null) {
            ordem(_no.getNoAbbEsquerda());
            System.out.print(_no.getValor() + ", ");
            ordem(_no.getNoAbbDireita());

        }
    }

}