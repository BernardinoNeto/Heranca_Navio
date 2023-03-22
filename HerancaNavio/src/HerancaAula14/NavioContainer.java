package HerancaAula14;

import java.util.ArrayList;

public class NavioContainer extends Navio{

    private int quantidadeGuindastes;
    private int quantidadeCamadas;
    private ArrayList<NavioContainer> navioCont;


    public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga,
                          String disponibilidade, int quantidadeGuindastes, int quantidadeCamadas) {
        super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
        this.navioCont = new ArrayList<NavioContainer>();
    }

    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }
}
