import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    
    private List<Item> itensList;
     
       public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
 }

 public void adicionarItem(String item, double preco, int quantidade) {
     itensList.add(new Item(item, preco, quantidade));
 }
 public void removerItem(String item) {
    List<Item> itensParaRemover = new ArrayList<>();
    for (Item i : itensList) {
        if (i.getProduto().equalsIgnoreCase(item)) {
        itensParaRemover.remove(i);
        }
 }
 itensList.removeAll(itensParaRemover);
 }
 public double CalcularValorTotal() {
        double total = 0;
        for (Item item : itensList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
        

public void exibirItens() {
    for (Item i : itensList) {
        System.out.println("Produto: " + i.getProduto() + ", Preço: " + i.getPreco() + ", Quantidade: " + i.getQuantidade());
    }
} 

public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
   carrinho.adicionarItem("Banana", 10.0, 2);
    carrinho.adicionarItem("Maçã", 5.0, 3);
    carrinho.adicionarItem("Laranja", 7.0, 1);
    carrinho.adicionarItem("Uva", 15.0, 4);
    System.out.println("Calculando valor total do carrinho...");
    
carrinho.removerItem("Maçã");
    carrinho.removerItem("Banana");
    System.out.println("Após remover Maçã e Banana, o valor total do carrinho é: " + carrinho.CalcularValorTotal());
    


    carrinho.exibirItens();
    
}
}