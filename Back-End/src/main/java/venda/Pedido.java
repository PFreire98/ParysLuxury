package venda;

import produtos.Produto;
import tad.TADFila;

public class Pedido {

    private int quantidade;
    private int quantidadeTotal;
    private Produto produto;
    private double valorTotal;
    private TADFila fPedido = new TADFila(15);

//    public Pedido(){}

    public Pedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade += quantidade;
        this.quantidadeTotal += quantidade;
        this.valorTotal += produto.getValorVenda();
        fPedido.inserir(produto.getId());
        System.out.println("Passei por aqui!");
        System.out.println(produto.getNome());
    }

    public void delProduro(Produto produto, int quantidade){
        if(quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            this.quantidadeTotal -= quantidade;
            this.valorTotal -= produto.getValorVenda();
            fPedido.remover();
        }
        else{
            System.out.println("[!] Quantidade excedeu a quantidade no carrinho!");
        }
    }

    public void getPedido(){
        fPedido.toString();
    }

}
