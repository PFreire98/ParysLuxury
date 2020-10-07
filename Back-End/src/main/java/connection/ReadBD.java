package connection;

import produtos.Produto;

import java.sql.*;

public class ReadBD {

    //RETORNA O CATÁLOGO DE PRODUTOS DO BANCO DE DADOS
    public static void getCatalogo() throws ClassNotFoundException, SQLException {
        String nome = "";
        int quantidade = 0;
        double valor = 0;
        String url = "jdbc:mysql://localhost:3306/parisluxury?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, user, pwd);
        String readsql = "SELECT * FROM produto";
        PreparedStatement readStm = conexao.prepareStatement(readsql);
        ResultSet resultSet = readStm.executeQuery();
        System.out.println("|====================");
        while (resultSet.next()) {
            System.out.println("|ID: " + (resultSet.getString("id")) );
            System.out.println("|Produto: " + (resultSet.getString("nome")) );
            System.out.println("|Descrição: " + (resultSet.getString("descricao")) );
            System.out.println("|Quantidade em estoque: " + (resultSet.getString("quantidade")) );
            System.out.println("|Valor: " + "R$"+(resultSet.getString("valorVenda")));
            System.out.println("|--------------------");
        }
        System.out.println("|====================");
        System.out.println("\n");
        conexao.close();
    }

    //RETORNA UM PRODUTO DO BANCO DE DADOS ATRAVÉS DE SEU ID
    public static Produto getProdutoById(int id) throws ClassNotFoundException, SQLException {
        String nome = "";
        int quantidade = 0;
        double valor = 0;
        String url = "jdbc:mysql://localhost:3306/parisluxury?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, user, pwd);
        String readsql = "SELECT id, nome, quantidade, valorVenda FROM produto WHERE id = " + id;
        PreparedStatement readStm = conexao.prepareStatement(readsql);
        ResultSet resultSet = readStm.executeQuery();
        while (resultSet.next()) {
            nome = (resultSet.getString("nome"));
            quantidade = (resultSet.getInt("quantidade"));
            valor = (resultSet.getDouble("valorVenda"));

        }
        Produto produto = new Produto(id, nome, quantidade, valor);
        conexao.close();
        return produto;
    }

    //RETORNA O VALOR DE UM PRODUTO DO BANCO DE DADOS ATRAVÉS DE SEU ID
    public static double getValorById(int id) throws ClassNotFoundException, SQLException {
        String nome = "";
        int quantidade = 0;
        double valor = 0;
        String url = "jdbc:mysql://localhost:3306/parisluxury?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, user, pwd);
        String readsql = "SELECT valorVenda FROM produto WHERE id = " + id;
        PreparedStatement readStm = conexao.prepareStatement(readsql);
        ResultSet resultSet = readStm.executeQuery();
        while (resultSet.next()) {
            valor = (resultSet.getDouble("valorVenda"));

        }
        conexao.close();
        return valor;
    }

    //RETORNA O CARRINHO DO BANCO DE DADOS
    public static void getCarrinho(int id) throws ClassNotFoundException, SQLException {
        String nome = "";
        int quantidade = 0;
        double valor = 0;
        String url = "jdbc:mysql://localhost:3306/parisluxury?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, user, pwd);
        String readsql = "SELECT id, nome, quantidade, valorVenda FROM produto WHERE id = " + id;
        PreparedStatement readStm = conexao.prepareStatement(readsql);
        ResultSet resultSet = readStm.executeQuery();
        System.out.println("|====================");
        while (resultSet.next()) {
            System.out.println("|ID: " + (resultSet.getString("id")) );
            System.out.println("|Produto: " + (resultSet.getString("nome")) );
            System.out.println("|Quantidade: " + (resultSet.getString("quantidade")) );
            System.out.println("|Valor: " + "R$"+(resultSet.getString("valorVenda")));
            System.out.println("|--------------------");
        }
        System.out.println("|====================");
        System.out.println("\n");
        conexao.close();
    }
}