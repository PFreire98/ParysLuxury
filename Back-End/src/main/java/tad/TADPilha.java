package tad;
public class TADPilha {

    //=== CONSTRUTOR: inicializa os atributos
    public TADPilha() {
        this.tamanhoMaximo = 10;
        this.topo = -1;
        this.pilha = new int[tamanhoMaximo];
    }

    public TADPilha(int TAM) {
        this.tamanhoMaximo = TAM;
        this.topo = -1;
        this.pilha = new int[tamanhoMaximo];
    }
    //---

    //=== ATRIBUTOS
    private final int tamanhoMaximo;
    private int topo;
    private int[] pilha;
    //---

    //==========================================================================
    // METODOS OPERACIONAIS FUNDAMENTAIS DO TAD PILHA
    //==========================================================================
    //
    /**
     * Insere um elemento na pilha. Somente inteiros >= 1
     *
     * @param n
     * @return
     */
    public boolean inserir(int n) {
        if (cheia()) {
            return false;
        } else {
            topo++;
            pilha[topo] = n;
            return true;
        }
    }

    /**
     * Remove e retorna um elemento da pilha. Se retornar 0 significa que a
     * pilha esta' vazia.
     *
     * @return
     */
    public int remover() {
        if(vazia()){
            return 0;
        }else{
            return pilha[topo--];
        }
    }

    /**
     * Retorna "true" se a fila estiver cheia, caso contrario retorna "false".
     *
     * @return
     */
    public boolean cheia() {
        return topo == tamanhoMaximo - 1;
    }

    /**
     * Retorna "true" se a fila estiver vazia, caso contrario retorna "false".
     *
     * @return
     */
    public boolean vazia() {
        return topo == -1;
    }
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------

    //==========================================================================
    // METODOS OPERACIONAIS COMPLEMENTARES DO TAD PILHA
    //==========================================================================
    //
    /**
     * Gera uma string com os elementos da pilha.
     *
     * @return String com os elementos da pilha em sequencia horizontal.
     */
    public String print() {
        String p = "";
        p += "[ ";
        if (!vazia()) {
            for (int i = 0; i <= topo; i++) {
                p += pilha[i] + " ";
            }
        }
        p += "]";
        return p;
    }

    /**
     * Obtem o tamanho maximo que a pilha pode atingir.
     *
     * @return
     */
    public int getTamanhoMaximo() {
        return this.tamanhoMaximo;
    }

    /**
     * Obtem a quantidade de slots vagos na pilha.
     *
     * @return
     */
    public int getDisponibilidade() {
        return (this.tamanhoMaximo - this.topo - 1);
    }

    /**
     * Verifica se um determinado elemento se encontra na pilha. Serve também
     * para impedir duplicações na pilha.
     *
     * @param n
     * @return Posicao em que se encontra o elemento (indice + 1). Se o elemento
     * nao estiver na pilha retorna 0.
     */
    public int procurar(int n) {
        if (n <= 0) {
            return 0;
        }
        for (int i = 0; i <= this.topo; i++) {
            if (n == pilha[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * Verifica se um elemento esta' na pilha.
     *
     * @param n
     * @return -1 se a pilha estiver vazia ou se o elemento nao se encontra; se
     * encontrar o elemento, retorna a sua posicao.
     */
    public int estaNaPilha(int n) {
        if (vazia()) {
            return -1;
        }
        for (int i = 0; i <= topo; i++) {
            if (n == pilha[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    //= verifica o tamanho da pilha
    public int tamanho() {
        return topo +1;
    }

    //= posicao do elemento a partir do topo (cima para baixo)
    //= se estiver no topo -> posicao = 1
    public int elementoNaPosicaoN_DoTopo(int n) {
        for (int i = 1; i < n; i++){
            remover();
        }
        System.out.println("O elemento na posição "+ n + " é o " + pilha[topo]);
        return -1;
    }

    /**
     * Retorna a posicao sequencial de um elemento a partir do fundo (indice 0).
     * O elemento na posicao 0 e' o elemento de posicao 1 (primeira posicao).
     *
     * @param
     * @return
     */
    public int alteraElementoN(int n1, int n2) {
        int[] pilhaAuxiliar = new int[this.tamanhoMaximo];
        int topoAuxiliar = -1;
        int[] pilhaAuxiliar2 = new int[this.tamanhoMaximo];
        int topoAuxiliar2 = -1;
        int x = 0;
        int y = 0;

        //DESEMPILHANDO E ALTERANDO O ELEMENTO
        for(int i = topo; i >= 0; i--){
            if(i == n1-1){
                pilhaAuxiliar[x] = n2;
                topoAuxiliar++;
                x++;
            }else {
                pilhaAuxiliar[x] = pilha[i];
                topoAuxiliar++;
                x++;
            }
        }

        //EMPILHANDO NOVAMENTE
        for(int i = topoAuxiliar; i >= 0; i--){
            pilhaAuxiliar2[y] = pilhaAuxiliar[i];
            topoAuxiliar2++;
            y++;
        }

        this.pilha = pilhaAuxiliar2;

        return -1;
    }

    /**
     * Remove o elemento da posição n
     * @param n
     * */
    public int removeElementoN(int n) {
        int[] pilhaAuxiliar = new int[this.tamanhoMaximo];
        int topoAuxiliar = -1;
        int[] pilhaAuxiliar2 = new int[this.tamanhoMaximo];
        int topoAuxiliar2 = -1;
        int x = 0;
        int y = 0;

        //DESEMPILHANDO E REMOVENDO O ELEMENTO
        for(int i = topo; i >= 0; i--){
            if(i == n-1){
                remover();
            }else {
                pilhaAuxiliar[x] = pilha[i];
                topoAuxiliar++;
                x++;
            }
        }

        //EMPILHANDO NOVAMENTE
        for(int i = topoAuxiliar; i >= 0; i--){
            pilhaAuxiliar2[y] = pilhaAuxiliar[i];
            topoAuxiliar2++;
            y++;
        }

        this.pilha = pilhaAuxiliar2;

        return -1;
    }

    public int getElemento(int i){
        return pilha[i];
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
}
