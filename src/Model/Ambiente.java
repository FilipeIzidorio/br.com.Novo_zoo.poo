package Model;

public class Ambiente{
    Animal[] list_animal;
    public Ambiente(int capacidade_do_ambiente){
        list_animal = new Animal[capacidade_do_ambiente];
    }

    public void getLista_animal() {
        for(int i = 0; i < this.list_animal.length; i++){
            System.out.println(list_animal[i]);
        }

    }

    public void setLista_animal(int posicao,Animal animal) {
        this.list_animal[posicao] = animal;
    }

    @Override
    public String toString() {
        this.getLista_animal();
        return "lista_animal";
    }
}
