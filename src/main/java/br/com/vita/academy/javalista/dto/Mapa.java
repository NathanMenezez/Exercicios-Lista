package br.com.vita.academy.javalista.dto;

public class Mapa {
    private String cidade;
    private Double populacao;

    

    public Mapa(String cidade, Double populacao) {
        this.cidade = cidade;
        this.populacao = populacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }
}
