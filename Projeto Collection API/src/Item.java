public class Item {
    private String produto;
    private double preco;
    private int quantidade;

    public Item(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return preco + quantidade;
    }
    
}
