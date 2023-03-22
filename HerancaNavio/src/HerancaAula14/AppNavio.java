package HerancaAula14;

import java.util.ArrayList;
import java.util.List;

public class AppNavio {

    public static void main(String[] args) {

        List<NavioContainer> navioCont = new ArrayList<NavioContainer>();
        List<NavioGraneleiro> navioGran = new ArrayList<NavioGraneleiro>();

        navioGran.add(new NavioGraneleiro(10, "Estrela do Mar", 4,
                50000, "lotado", 4));
        navioGran.add(new NavioGraneleiro(25, "Cruzeiro do Sul", 3,
                80000, "lotado", 6));

        navioCont.add(new NavioContainer(33, "Bela Fera", 2,
                100000, "Lotado", 2,30));
        navioCont.add(new NavioContainer(48, "Arrecifes", 2,
                120000, "Lotado", 2, 30));
        navioCont.add(new NavioContainer(52,"Águas Belas", 1,
                90000, "Vazio", 0,25));

        System.out.print("\n----------NAVIO GRANELEIRO 1----------");
        System.out.print("\nIdentificador.....................: " + navioGran.get(0).getId());
        System.out.print("\nNome do Navio.....................: " + navioGran.get(0).getNome());
        System.out.print("\nQuantidades de Porões.............: " + navioGran.get(0).getQuantidadePoroes());
        System.out.print("\nCapacidade de Carga (Toneladas)...: " + navioGran.get(0).getCapacidadeCarga());
        System.out.print("\nQuantidades de Escotilhas.........: " + navioGran.get(0).getQuantidadeEscotilhas());
        System.out.println();

        System.out.print("\n----------NAVIO GRANELEIRO 2----------");
        System.out.print("\nIdentificador.....................: " + navioGran.get(1).getId());
        System.out.print("\nNome do Navio.....................: " + navioGran.get(1).getNome());
        System.out.print("\nQuantidades de Porões.............: " + navioGran.get(1).getQuantidadePoroes());
        System.out.print("\nCapacidade de Carga (Toneladas)...: " + navioGran.get(1).getCapacidadeCarga());
        System.out.print("\nQuantidades de Escotilhas.........: " + navioGran.get(1).getQuantidadeEscotilhas());
        System.out.println();

        System.out.print("\n----------NAVIO PORTA-CONTAINER 1----------");
        System.out.print("\nIdentificador.....................: " + navioCont.get(0).getId());
        System.out.print("\nNome do Navio.....................: " + navioCont.get(0).getNome());
        System.out.print("\nQuantidades de Porões.............: " + navioCont.get(0).getQuantidadePoroes());
        System.out.print("\nCapacidade de Carga (Toneladas)...: " + navioCont.get(0).getCapacidadeCarga());
        System.out.print("\nQuantidades de Guindastes.........: " + navioCont.get(0).getQuantidadeGuindastes());
        System.out.print("\nQuantidades de Câmaras............: " + navioCont.get(0).getQuantidadeCamadas());
        System.out.println();

        System.out.print("\n----------NAVIO PORTA-CONTAINER 2----------");
        System.out.print("\nIdentificador.....................: " + navioCont.get(1).getId());
        System.out.print("\nNome do Navio.....................: " + navioCont.get(1).getNome());
        System.out.print("\nQuantidades de Porões.............: " + navioCont.get(1).getQuantidadePoroes());
        System.out.print("\nCapacidade de Carga (Toneladas)...: " + navioCont.get(1).getCapacidadeCarga());
        System.out.print("\nQuantidades de Guindastes.........: " + navioCont.get(1).getQuantidadeGuindastes());
        System.out.print("\nQuantidades de Câmaras............: " + navioCont.get(1).getQuantidadeCamadas());
        System.out.println();

        System.out.print("\n----------NAVIO PORTA-CONTAINER 3----------");
        System.out.print("\nIdentificador.....................: " + navioCont.get(2).getId());
        System.out.print("\nNome do Navio.....................: " + navioCont.get(2).getNome());
        System.out.print("\nQuantidades de Porões.............: " + navioCont.get(2).getQuantidadePoroes());
        System.out.print("\nCapacidade de Carga (Toneladas)...: " + navioCont.get(2).getCapacidadeCarga());
        System.out.print("\nQuantidades de Guindastes.........: " + navioCont.get(2).getQuantidadeGuindastes());
        System.out.print("\nQuantidades de Câmaras............: " + navioCont.get(2).getQuantidadeCamadas());
    }
}
