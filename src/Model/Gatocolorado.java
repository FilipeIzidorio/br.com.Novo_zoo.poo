package Model;

public class Gatocolorado extends Animal {
    public String cor;
    public int cm;
    public float KG;
    public String viveEm;

    public Gatocolorado(int quantidade_patas, String genero, boolean tem_rabo, String cor, int cm, float KG, String viveEm) {
        super(quantidade_patas, genero, tem_rabo);
        this.cor = cor;
        this.cm = cm;
        this.KG = KG;
        this.viveEm = viveEm;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public float getKG() {
        return KG;
    }

    public void setKG(float KG) {
        this.KG = KG;
    }

    public String getViveEm() {
        return viveEm;
    }

    public void setViveEm(String viveEm) {
        this.viveEm = viveEm;
    }

    @Override
    public String toString() {
        return "Gato_colorado{" +
                "cor='" + cor + '\'' +
                ", cm=" + cm +
                ", KG=" + KG +
                ", viveEm='" + viveEm + '\'' +
                '}'+super.toString();
    }
}
