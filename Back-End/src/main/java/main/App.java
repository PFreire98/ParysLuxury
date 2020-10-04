package main;

import connection.ReadBD;
import produtos.Produto;
import venda.Pedido;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu\n" +
                "1- Criar um produto\n" +
                "2- Criar um pedido\n" +
                "3- Sair ");
        int menu = in.nextInt();

        switch(menu){
            case 1:
                System.out.println("id do produto: ");
                int id = in.nextInt();
                System.out.println("nome do produto");
                String nome = in.nextLine();
                System.out.println("quantidade do produto: ");
                int quantidade = in.nextInt();
                System.out.println("valor venda: ");
                double valor = in.nextDouble();
                System.out.println("tamanho do produto: ");
                char tamanho = in.next().charAt(0);
                Produto produto = new Produto(id, nome, quantidade, valor);

            case 2:
                System.out.println("id do produto: ");
                int id2 = in.nextInt();
                System.out.println("Quantidade do produto: ");
                int quantidade2 = in.nextInt();
                Produto produtos = new Produto();
                produtos = ReadBD.getProdutoById(id2);
                Pedido pedido = new Pedido(produtos, quantidade2);
        }
    }
}
