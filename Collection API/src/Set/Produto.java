package Set;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long cod; // código do produto
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public int compareTo(Produto p) { // compara produtos por nome
        return nome.compareToIgnoreCase(p.getNome()); // compara strings // ignorando maiúsculas e minúsculas
    }

    
    
    @Override
    public int hashCode() {     // gera o hashCode do produto
        return Objects.hash(getCodigo()); // gera o hashCode a partir do código
    }
    @Override
    public boolean equals(Object o) { // compara dois produtos
        if (this == o) return true; // verifica se o objeto é o mesmo
        if (!(o instanceof Produto produto)) return false; // verifica se o objeto é do tipo Produto
        return getCodigo() == produto.getCodigo(); // compara os códigos dos produtos
    }
    @Override
    public String toString() { // retorna uma representação em string do produto
        return "Produto [codigo=" + cod + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]"; // retorna uma string com os atributos do produto
    }
    public long getCodigo() { // retorna o código do produto
        return cod; // código do produto
    }
    public String getNome() { // retorna o nome do produto
        return nome; // nome do produto
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


    public Produto(long codigo, String nome, double preco, int quantidade) { // construtor da classe Produto
        this.cod = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    

}


class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}