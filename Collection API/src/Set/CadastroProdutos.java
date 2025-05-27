package Set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class CadastroProdutos { // Cadastro de produtos
    // Atributos
    private Set<Produto> produtoSet; // Set para armazenar os produtos, evitando duplicatas

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>(); // Inicializa o set de produtos

    }
    
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) { // Adiciona um novo produto ao set
        produtoSet.add(new Produto(cod, nome, preco, quantidade)); // Cria um novo produto e adiciona ao set
        }
        public Set<Produto> exibirProdutosPorNome() { // Exibe produtos por nome
            Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // set ogarnizado por nome
                return produtosPorNome; // retorna o set organizado por nome
    }   
    public Set<Produto> exibiProdutosPorPreco()  {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco()); // set organizado por preco
        produtoSet.addAll(produtoSet); // adiciona todos os produtos do set original
        return produtosPorPreco; // retorna o set organizado por preco

}

        public static void main(String[] args) {
            
        }
}