package List.ConjuntoConvidados;
import java.util.HashSet;
import java.util.Set;

public class ListaDeAlunos  {
    Set<Aluno> alunos;
    private Set<Aluno> conjuntoalunosSet = new HashSet<>(); // Conjunto para armazenar os alunos

    public void ConjuntoAlunos() {
        this.alunos = new HashSet<>();
    }
        public void adicionarAluno(String nome, int telefone, int idade) {
    conjuntoalunosSet.add(new Aluno(nome, telefone, idade)); // Cria um novo convidado e adiciona ao conjunto
  }
  public void exibirAlunos() {
    for (Aluno aluno : conjuntoalunosSet) {
        if (!aluno.getAluno().isEmpty()) {
            System.out.println(aluno.getAluno());
        } else {
            System.out.println("Nome não informado.");
        }
    }
  }
  public void removerAlunoPorTelefone(int telefone) {
    Aluno alunoParaRemover = null;
    if (!conjuntoalunosSet.isEmpty()) {
        for (Aluno a : conjuntoalunosSet) {
            if (a.getTelefone() == telefone) {
                alunoParaRemover = a;
                break;
            }
        }
        if (alunoParaRemover != null) {
            conjuntoalunosSet.remove(alunoParaRemover);
            System.out.println("Aluno removido: " + alunoParaRemover.getAluno());
        } else {
            System.out.println("Nenhum aluno encontrado com o telefone: " + telefone);
        }
    }
  }

  public static void main(String[] args) {
    ListaDeAlunos lista = new ListaDeAlunos();
    lista.ConjuntoAlunos();
    lista.adicionarAluno("João", 123456789, 20);
    lista.adicionarAluno("Maria", 987654321, 25);
    lista.adicionarAluno("Maria", 987654321, 25);
    lista.exibirAlunos();
    System.out.println("Lista de Alunos:" + lista.conjuntoalunosSet);
    lista.removerAlunoPorTelefone(987654321);
    System.out.println("Existem: " + lista.conjuntoalunosSet.size() + " apos a remoçao.");


  }
}
