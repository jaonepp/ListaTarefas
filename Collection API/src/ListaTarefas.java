import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)); {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void ObterDescricoesTarefas() {
     System.out.println(tarefaList);
        
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
       System.out.println("O numero total de elementos na lista e: " + listaTarefa.ObterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 0");
        listaTarefa.adicionarTarefa("Tarefa 3");
         System.out.println("O numero total de elementos na lista e: " + listaTarefa.ObterNumeroTotalTarefas());
        //listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista e: " + listaTarefa.ObterNumeroTotalTarefas());

        listaTarefa.ObterDescricoesTarefas();
    }


}
