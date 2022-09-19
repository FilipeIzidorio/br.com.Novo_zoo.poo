package Main;
import Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner copia = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("  BEM-VINDO AO ZOOLOGICO ");
        System.out.println("******************************");
        String menu = """
                1 - ENTRAR
                2 - SAIR
                """;

        System.out.println(menu);
        System.out.print("DIGITE A OPCAO QUE DESEJA: ");
        int opcao;
        opcao = copia.nextInt();
        switch (opcao) {
            case 1 -> {
                System.out.println("*********************");
                System.out.println(" ENTRANDO NO SISTEMA ");
                System.out.println("*********************\n");
                System.out.println("ESCOLHA UMA OPCAO ABAIXO\n");
                String cadastro =
                        """
                                1 - AMBIENTE AQUATICO
                                2 - AMBIENTE TERRESTRE
                                3 - AMBIENTE AEREO
                                """;
                System.out.println(cadastro);
                int opcao1;
                System.out.print("\nDIGITE UMA OPCAO:");
                opcao1 = copia.nextInt();
                if (opcao1 == 1) {
                    Ambiente ambienteAguatico = new Ambiente(3);

                    Sardinha sardinha = new Sardinha(0, "Marinho", false, true,
                            true);
                    Cavalomarinho cavalomarinho = new Cavalomarinho(0, "masculino", false,
                            "15", false, true, "salgada");
                    Golfinho golfinho = new Golfinho(0, "masculino", false, 2, 75);
                    ambienteAguatico.setLista_animal(0, sardinha);
                    ambienteAguatico.setLista_animal(1, cavalomarinho);
                    ambienteAguatico.setLista_animal(2, golfinho);
                    System.out.println("\nAMBIENTE AQUATICO");
                    ambienteAguatico.getLista_animal();


                } else if (opcao1 == 2) {
                    Ambiente ambienteTerreste = new Ambiente(3);
                    Gatocolorado gatocolorado = new Gatocolorado(4,"masculino",true,"amarelo",45,2,"floresta");
                    Raposa raposa = new Raposa(4,"femea",true,"cinza",12,120,"vive em qualquer lugar");
                    Cachorro cachorro = new Cachorro(4,"masculino",true,"mamifero","canis familiaris");

                    ambienteTerreste.setLista_animal(0,gatocolorado);
                    ambienteTerreste.setLista_animal(1,raposa);
                    ambienteTerreste.setLista_animal(2,cachorro);

                    System.out.println("\nAMBIENTE TERRESTRE");
                    ambienteTerreste.getLista_animal();

                } else if (opcao1 == 3) {
                    Ambiente ambienteAereo = new Ambiente(3);
                    Morcego morcego = new Morcego(2,"masculino",false,"mamifero","chiroptera","nortuno");
                    Arara arara = new Arara(2,"femenina",false,"Azul",true,"psitacideos");
                    Aguia aguia = new Aguia(2,"masculino",false,"afiadas","falconiformes","acipitrideos",true);
                    ambienteAereo.setLista_animal(0,morcego);
                    ambienteAereo.setLista_animal(1,arara);
                    ambienteAereo.setLista_animal(2,aguia);

                    System.out.println("\nAMBIENTE AEREO");
                    ambienteAereo.getLista_animal();



                } else
                    System.out.println("opcao invalida: \n");
            }
            case 2 -> {
                System.out.println("*********************");
                System.out.println("    SAINDO... ");
                System.out.println("*********************");
            }
            default -> System.out.println("OPCAO INVALIDA!\n");
        }

    }
}

