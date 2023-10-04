package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String name, double preco, int quantiadade){
        itemList.add(new Item(name,preco,quantiadade));
    }

    public void removerItem(String name){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i: itemList){
            if(i.getName().equalsIgnoreCase(name)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double precoFinal = 0;

        for (Item i: itemList){
            precoFinal += (i.getPreco() * i.getQuantidade());
        }
        return precoFinal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Prego",0.50,10);
        carrinho.adicionarItem("Arame",0.50,10);
        System.out.println("O preço total do seu carrinho é: R$" + carrinho.calcularValorTotal());
        carrinho.removerItem("Prego");
        System.out.println("O preço total do seu carrinho é: R$" + carrinho.calcularValorTotal());
        carrinho.exibirItens();
    }
}
