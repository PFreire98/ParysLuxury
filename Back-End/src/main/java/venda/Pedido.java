package venda;

import connection.ReadBD;
import produtos.Produto;
import tad.TADPilha;

import java.sql.SQLException;

public class Pedido {

    private int quantidadeTotal;
    private Produto produto;
    private double valorTotal;
    private TADPilha fPedido = new TADPilha(15);
    private TADPilha fQuantidade = new TADPilha(15);

    public Pedido(){}

    public void setPedido(Produto produto){
        this.produto = produto;
        fPedido.inserir(produto.getId());
    }

    public void setQuantidade(int quantidade, double valor){
        this.quantidadeTotal += quantidade;
        fQuantidade.inserir(quantidade);
        this.valorTotal += (quantidade * valor);
    }
/*
    public void delProduto(Produto produto, int quantidade){
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

 */

    public String getPedido() throws SQLException, ClassNotFoundException {
        String p ="=======================\n" +
                "  Carrinho de Compras\n" +
                "=======================\n";
        for(int i = 0; i < fPedido.tamanho(); i++) {
            Produto produto =  ReadBD.getProdutoById(fPedido.getElemento(i));
            p +=    "|ID: " + produto.getId() +"\n"+
                    "|Produto: " + produto.getNome() +"\n"+
                    "|Quantidade: " + fQuantidade.getElemento(i) +"\n"+
                    "|Valor: " + "R$"+ produto.getValorVenda() +"\n"+
                    "=======================\n";
        }
        p += "Valor Total: R$" + valorTotal + "\n";
        return p;
    }

}
