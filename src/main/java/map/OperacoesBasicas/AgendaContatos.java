package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Cristian", 123456);
        agendaContatos.adicionarContato("Cristian B", 5665);
        agendaContatos.adicionarContato("Cristian F", 11111111);
        agendaContatos.adicionarContato("Cristian", 87765432);
        agendaContatos.adicionarContato("Cristian", 11111111);
        agendaContatos.adicionarContato("Cristian H", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Cristian H");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Cristian B"));
    }
}
