package Model;

public class Animal {
    public int quantidade_patas;
    public String genero;
    public boolean tem_rabo;

    public Animal(int quantidade_patas, String genero, boolean tem_rabo) {
        this.quantidade_patas = quantidade_patas;
        this.genero = genero;
        this.tem_rabo = tem_rabo;
    }

    public Animal(int quantidade_patas, String genero) {
    }

    public Animal(int quantidade_patas) {
    }

    public int getQuantidade_patas() {
        return quantidade_patas;
    }

    public void setQuantidade_patas(int quantidade_patas) {
        this.quantidade_patas = quantidade_patas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isTem_rabo() {
        return tem_rabo;
    }


    public void setTem_rabo(boolean tem_rabo) {
        this.tem_rabo = tem_rabo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "quantidade_patas=" + quantidade_patas +
                ", genero='" + genero + '\'' +
                ", tem_rabo=" + tem_rabo +
                '}';
    }
}

