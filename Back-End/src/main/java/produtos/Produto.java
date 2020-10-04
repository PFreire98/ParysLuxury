package produtos;

import java.sql.*;

public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private String descricao;
    private double valorCompra;
    private double valorVenda;
    private String categoria;
    private char tamanho;

    public Produto(){}

    public Produto(int id, String nome, int quantidade, double valorVenda){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.categoria =  categoria;
        this.tamanho = tamanho;
    }

//    public Produto(int id, int quantidade, String descricao, double valorCompra, double valorVenda, String categoria, char tamanho){
//        this.id = id;
//        this.quantidade = quantidade;
//        this.descricao = descricao;
//        this.valorCompra = valorCompra;
//        this.valorVenda = valorVenda;
//        this.categoria =  categoria;
//        this.tamanho = tamanho;
//    }

    /**
     * getId
     * @return Retorna o id do produto.
     */
    public int getId(){return id;}

    /**
     * getNome
     * @return Retorna o nome do produto.
     */
    public String getNome(){return nome;}

    /**
     * getQuantidade
     * @return Retorna a quantidade do produto em estoque.
     */
    public int getQuantidade(){return quantidade;}

    /**
     * getDescricao
     * @return Retorna a descrição do produto.
     */
    public String getDescricao(){return descricao;}

    /**
     * getValorCompra
     * @return Retorna o valor de compra do produto.
     */
    public double getValorCompra(){return valorCompra;}

    /**
     * getValorVenda
     * @return Retorna o valor de venda do produto.
     */
    public double getValorVenda(){return valorVenda;}

    /**
     * getCategoria
     * @return Retorna a categoria do produto.
     */
    public String getCategoria(){return categoria;}

    /**
     * getTamanho
     * @return Retorna o tamanho do produto.
     */
    public char getTamanho(){return tamanho;}


}
