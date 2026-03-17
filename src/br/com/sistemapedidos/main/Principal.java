package br.com.sistemapedidos.main;

import br.com.sistemapedidos.model.Pedido;
import br.com.sistemapedidos.model.Produto;
import br.com.sistemapedidos.pagamento.Boleto;
import br.com.sistemapedidos.pagamento.Cartao;
import br.com.sistemapedidos.pagamento.PIX;
import br.com.sistemapedidos.pagamento.Pagamento;
import br.com.sistemapedidos.service.PedidoService;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        Pedido pedido = null;
        double preco;
        PedidoService service = new PedidoService();
        int op;
        do {
            System.out.println("\nSistema de Pedidos");
            System.out.println(
                    "1 - Criar Pedido\n" +
                            "2 - Adicionar Produto ao Pedido\n" +
                            "3 - Ver Pedido\n" +
                            "4 - Finalizar Pedido\n" +
                            "5 - Sair");
            System.out.print("=>: ");
            op = ler.nextInt();
            ler.nextLine();
            switch (op) {
                case 1:
                    System.out.println("\n###Criar Pedido###");
                    pedido = new Pedido();
                    System.out.print("Informe o nome do Cliente: ");
                    pedido.setCliente(ler.nextLine());
                    System.out.println("Pedido criado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n###Adicionar Produto ao Pedido###");
                    if (pedido == null) {
                        System.out.println("Crie um pedido primeiro!");
                        break;
                    }
                    System.out.print("Informe nome do produto: ");
                    nome = ler.nextLine();
                    System.out.print("Informe o valor do produto: ");
                    preco = ler.nextDouble();
                    Produto p = new Produto(nome, preco);
                    pedido.adicionarProduto(p);
                    System.out.println("Produto adicionado ao pedido com sucesso!\n");
                    ler.nextLine();
                    break;
                case 3:
                    System.out.println("\n###Ver Pedido###");
                    if (pedido == null) {
                        System.out.println("Nenhum pedido criado!");
                        break;
                    }
                    System.out.println("Cliente: " +  pedido.getCliente());
                    pedido.listarProdutosPedido();
                    System.out.printf("Total: R$ %.2f\n", pedido.calcularTotal());
                    break;
                case 4:
                    System.out.println("\n###Finalizar Pedido###");
                    if (pedido == null) {
                        System.out.println("Nenhum pedido criado!");
                        break;
                    }
                    if (pedido.getProdutos().isEmpty()) {
                        System.out.println("Pedido sem produtos!");
                        break;
                    }
                    System.out.println("Formas de Pagamento: ");
                    System.out.println("1 - PIX");
                    System.out.println("2 - Cartão");
                    System.out.println("3 - Boleto");
                    System.out.print("=>: ");
                    int fp = ler.nextInt();
                    ler.nextLine();
                    Pagamento pag = null;
                    switch (fp) {
                        case 1:
                            pag = new PIX();
                            break;
                        case 2:
                            pag= new Cartao();
                            break;
                        case 3:
                            pag = new Boleto();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    if (pag == null){
                        break;
                    }
                    service.finalizarPedido(pedido, pag);
                    pedido = null;
            break;
            case 5:
                System.out.println("\nSair");
                ler.close();
                break;
            default:
                System.out.println("\nOpção Inválida!\n");
        }
    }while(op !=5);
}
}
