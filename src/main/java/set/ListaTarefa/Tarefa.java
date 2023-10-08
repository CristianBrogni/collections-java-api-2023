package main.java.set.ListaTarefa;

import java.util.Objects;

public class Tarefa {
    private Boolean tarefaConcluida;
    private String descricao;

    public Tarefa(Boolean tarefaConcluida, String descricao) {
        this.tarefaConcluida = tarefaConcluida;
        this.descricao = descricao;
    }

    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTarefaConcluida(Boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "tarefaConcluida=" + tarefaConcluida +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
