package Model;

public class Cachorro extends Animal{
    public String especie;
    public String familia;

    public Cachorro(int quantidade_patas, String genero, boolean tem_rabo, String especie, String familia) {
        super(quantidade_patas, genero, tem_rabo);
        this.especie = especie;
        this.familia = familia;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "especie='" + especie + '\'' +
                ", familia='" + familia + '\'' +
                '}'+super.toString();
    }
}
