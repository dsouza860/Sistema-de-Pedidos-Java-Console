package br.com.sistemapedidos.service;

import br.com.sistemapedidos.model.Pedido;
import br.com.sistemapedidos.model.Produto;
import br.com.sistemapedidos.pagamento.Pagamento;

public class PedidoService {

    public void finalizarPedido(Pedido pedido, Pagamento pagamento) {
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produtos: ");

        for(Produto p : pedido.getProdutos()) {
            p.exibirProduto();
        }

        double total = pedido.calcularTotal();
        System.out.printf("Total: R$ %.2f\n", total);
        pagamento.pagar(total);
    }
}
