package main;

import connection.ReadBD;
import produtos.Produto;
import venda.Pedido;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        Pedido pedido = new Pedido();
        Produto produtos = new Produto();

        int menu = 0;
        double valor;
        while(menu != 9) {
            System.out.println("" +
                    "|===============================|\n" +
                    "|          ParisLuxury          |\n" +
                    "|===============================|\n" +
                    "|1) Verificar o catálogo        |\n" +
                    "|2) Criar um pedido             |\n" +
                    "|3) Alterar um produto do pedido|\n" +
                    "|4) Verificar o pedido          |\n" +
                    "|9) Sair                        |\n" +
                    "|===============================|");
            System.out.println("Digite a opção desejada: ");
            menu = in.nextInt();
                if(menu == 1) {
                    ReadBD.getCatalogo();
                }else if(menu == 2) {
                    System.out.println("[!] Qual é o id do produto que deseja colocar no pedido? ");
                    int id = in.nextInt();
                    System.out.println("[!] E qual é a quantidade? ");
                    int quantidade = in.nextInt();
                    produtos = ReadBD.getProdutoById(id);
                    pedido.setPedido(produtos);
                    valor = ReadBD.getValorById(id);
                    pedido.setQuantidade(quantidade, valor);
                    int menu2 = 0;
                    do {
                        System.out.println("" +
                                "===========================\n" +
                                "1) Adicionar outro produto\n" +
                                "2) Sair do pedido\n" +
                                "============================");
                        menu2 = in.nextInt();
                        if (menu2 == 1){
                            System.out.println("[!] Qual é o id do produto que deseja colocar no pedido? ");
                            id = in.nextInt();
                            produtos = ReadBD.getProdutoById(id);
                            System.out.println("[!] E qual é a quantidade? ");
                            quantidade = in.nextInt();
                            pedido.setPedido(produtos);
                            valor = ReadBD.getValorById(id) ;
                            pedido.setQuantidade(quantidade, valor);
                        }
                    } while (menu2 != 2);
                }else if (menu == 3){
                    pedido.alteraPedido();
                }else if (menu == 4) {
                    System.out.println(pedido.getPedido());
                }
        }
    }
}
