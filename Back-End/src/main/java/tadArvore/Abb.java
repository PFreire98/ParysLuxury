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

    public void excluir(NoAbb no, NoAbb pai, int valor) {
        //se o no em questao nao possui o valor a ser removido
        if (no.getValor() != valor) {
            if (valor < no.getValor()) {
                if (no.getNoAbbEsquerda() != null) {
                    excluir(no.getNoAbbEsquerda(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            } else {
                if (no.getNoAbbDireita() != null) {
                    excluir(no.getNoAbbDireita(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            }

        }
        //se o no em questao possui o valor a ser removido      
        else {
            NoAbb aux;
            //caso de remocao de folha
            if (no.getNoAbbDireita() == null && no.getNoAbbEsquerda() == null) {

                // se o no a ser removido for filho direito do pai
                if(pai.getNoAbbDireita() == no)
                {
                    pai.setNoAbbDireita(null);
                }
                else
                {
                    pai.setNoAbbEsquerda(null);
                }
            }
            //caso onde o no possui 1 filho
            else if (no.getNoAbbDireita() == null || no.getNoAbbEsquerda() == null) {

                //se nao há subarvore à direita, pegue o antecessor
                if (no.getNoAbbEsquerda() != null) {
                    if(no == this.raiz)
                    {
                        this.raiz = no.getNoAbbEsquerda();
                    }
                    else
                    {
                        if(no.getNoAbbEsquerda() != null)
                            pai.setNoAbbDireita(no.getNoAbbEsquerda());
                        else
                            pai.setNoAbbDireita(no.getNoAbbDireita());
                    }
                }
                //se nao há subarvore à esquerda, pegue o sucessor
                else {
                    if(no == this.raiz)
                        this.raiz = no.getNoAbbDireita();
                    else
                    {
                        if(no.getNoAbbDireita() != null)
                            pai.setNoAbbDireita(no.getNoAbbDireita());
                        else
                            pai.setNoAbbDireita(no.getNoAbbEsquerda());
                    }
                }
            }
            /*caso de remocao de no com dois filhos: copie o sucessor para o no a ser removido
            e remova o sucessor*/
            else
            {
                aux = no.sucessor(no);
                no.setValor(aux.getValor());
                excluir(no.getNoAbbDireita(), no, aux.getValor());
            }
        }
    }

    public void excluir(int valor) {
        //caso em que a arvore está vazia
        if (raiz == null);
            //caso em que há apenas a raiz
        else if(raiz.getValor() == valor &&
                raiz.getNoAbbEsquerda() == null &&
                raiz.getNoAbbDireita() == null)
        {
            this.raiz = null;
        }
        else {
            excluir(raiz, raiz, valor);
        }
    }

    public void preordem(NoAbb _no) {
        if (_no != null) {
            System.out.print(_no.getValor() + ",");
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

// =========[Imprimir Árvore em representação de Árvore]=========
//    public void percorrerDecrescente(NoAbb node) {	// Imprime do maior para o menor
//
//        if (node != null) {
//
//            percorrerDecrescente (node.getNoAbbDireita());	// Percorre sub-árvore direita
//
//            if (node  == raiz){
//                System.out.print("_ _ _" + node.getValor() + " ");	// Visita Nó
//                System.out.println(" ") ;
//            } else {
//                System.out.print("_ _ _ _ _ _" + node.getValor() + " ");    // Visita Nó
//                System.out.println(" ");
//                percorrerDecrescente(node.antecessor(node));
//            }
//            percorrerDecrescente (node.getNoAbbEsquerda());      // Percorre sub-árvore esquerda
//        }
//    }

}