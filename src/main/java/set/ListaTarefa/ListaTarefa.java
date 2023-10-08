package main.java.set.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    Set<Tarefa> tarefaSet = new HashSet<>();

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(false,descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("O conjunto esta vazio");
        }
        if(tarefaParaRemover == null){
            System.out.println("Tarefa nao encontrada");
        }
    }

    public void exibirTarefas(){
        System.out.println( tarefaSet );
    }

    public void contarTarefas(){
        System.out.println("Existem " + tarefaSet.size() + " tarefa(s) na lista");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if(t.getTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if(!t.getTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t: tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Limpar a casa");
        listaTarefa.adicionarTarefa("Ir ao mercado");
        listaTarefa.adicionarTarefa("Fazer o trabalho");
        listaTarefa.adicionarTarefa("Fazer a atividade");

        listaTarefa.exibirTarefas();
        listaTarefa.contarTarefas();

        listaTarefa.removerTarefa("Limpar a casa");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        listaTarefa.contarTarefas();


        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaConcluida("Ir ao mercado");
        listaTarefa.marcarTarefaConcluida("Fazer a atividade");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaPendente("Fazer a atividade");
        System.out.println(listaTarefa.obterTarefasPendentes());
        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();
        listaTarefa.contarTarefas();

    }
}
