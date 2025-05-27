package List.ConjuntoConvidados;

public class Aluno {
    
    private String Aluno;
    private int telefone;
   private int idade;


    @Override
    public String toString() {
        return "Aluno: " + Aluno + ", telefone: " + telefone + ", idade: " + idade;
    }
    public Aluno(String nome, int telefone, int idade) {
        this.Aluno = nome;
        this.telefone = telefone;
        this.idade = idade;
    }
    public String getAluno() {

        return Aluno;
    }
    public void setAluno(String aluno)
    {
        Aluno = aluno;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getIdade() {
        return idade;
    } 
    public void setIdade(int idade) {
        this.idade = idade;
    }


    
}
