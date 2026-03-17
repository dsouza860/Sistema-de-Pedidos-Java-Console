package br.com.sistemapedidos.pagamento;

public class Cartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no valor de R$ " + valor + " via cartão.");
    }
}
