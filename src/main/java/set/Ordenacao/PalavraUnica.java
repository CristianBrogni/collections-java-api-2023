package main.java.set.Ordenacao;

import java.util.Objects;

public class PalavraUnica {
    private String palavraUnica;

    public PalavraUnica(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public String toString() {
        return "PalavraUnica{" +
                "palavraUnica='" + palavraUnica + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PalavraUnica that)) return false;
        return getPalavraUnica().equals(that.getPalavraUnica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavraUnica());
    }
}
