package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavraUnica> palavraUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraUnicaSet.add(new PalavraUnica(palavra));
    }

    public void removerPalavra(String palavra){
        PalavraUnica palavraUnicaParaRemover = null;
        for (PalavraUnica p : palavraUnicaSet){
            if(p.getPalavraUnica() == palavra){
                palavraUnicaParaRemover = p;
                break;
            }
        }
        palavraUnicaSet.remove(palavraUnicaParaRemover);
    }

    public void verificarPalavra(String palavra){
        for(PalavraUnica p: palavraUnicaSet){
            if(p.getPalavraUnica() == palavra) {
                System.out.println(palavra + " esta dentro do Set");
                break;
            }
        }

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraUnicaSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Caderno");
        conjuntoPalavrasUnicas.adicionarPalavra("Livros");
        conjuntoPalavrasUnicas.adicionarPalavra("Lapis");
        conjuntoPalavrasUnicas.adicionarPalavra("Caneta");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Caneta");
        conjuntoPalavrasUnicas.verificarPalavra("Caderno");

        conjuntoPalavrasUnicas.removerPalavra("Lapis");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
