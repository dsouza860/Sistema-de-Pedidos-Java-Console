package br.com.sistemapedidos.model;

import java.util.ArrayList;

public class Pedido {
    private String cliente;
    private ArrayList<Produto> produtos;

    public Pedido(){
        this.produtos = new ArrayList<>();
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!\n");
    }
    public double calcularTotal(){
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    public void listarProdutosPedido(){
        for (Produto produto : produtos) {
            produto.exibirProduto();
        }
    }
}
