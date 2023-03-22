package HerancaAula14;

import java.util.ArrayList;

public abstract class Navio {

    private int id;
    private String nome;
    private int quantidadePoroes;
    private double capacidadeCarga;
    private String disponibilidade;


    public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "Vazio";
    }

    public void iniciaCarregamento(){
        this.disponibilidade = "Carregando";
    }

    public void bloqueiaCarregamento(){
        this.disponibilidade = "Lotado";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
}
