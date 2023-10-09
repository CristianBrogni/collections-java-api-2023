package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula,double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }else {
            System.out.println("Lista de alunos vazia");
        }
        if(alunoParaRemover == null){
            System.out.println("Aluno nao encontrado");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos =  new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joao", 33224,7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 33233,7);
        gerenciadorAlunos.adicionarAluno("Carlos", 33226,8.2);
        gerenciadorAlunos.adicionarAluno("Alisson", 33269,6.7);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(33233);
        gerenciadorAlunos.exibirAlunos();
    }

}
