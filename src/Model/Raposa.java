package Model;

public class Raposa extends Animal {
    public String cor;
    public int KG;
    public int CM;
    public String habitat;

    public Raposa(int quantidade_patas, String genero, boolean tem_rabo, String cor, int KG, int CM, String habitat) {
        super(quantidade_patas, genero, tem_rabo);
        this.cor = cor;
        this.KG = KG;
        this.CM = CM;
        this.habitat = habitat;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKG() {
        return KG;
    }

    public void setKG(int KG) {
        this.KG = KG;
    }

    public int getCM() {
        return CM;
    }

    public void setCM(int CM) {
        this.CM = CM;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Raposa{" +
                "cor='" + cor + '\'' +
                ", KG=" + KG +
                ", CM=" + CM +
                ", habitat='" + habitat + '\'' +
                '}'+super.toString();
    }
}
