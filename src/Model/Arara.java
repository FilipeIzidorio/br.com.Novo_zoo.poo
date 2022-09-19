package Model;

public class Arara extends Animal{
    public String cor;
    public boolean possuemCauda;
    public String familia;

    public Arara(int quantidade_patas, String genero,boolean tem_rabo, String cor, boolean possuemCauda, String familia) {
        super(quantidade_patas,genero,tem_rabo);
        this.cor = cor;
        this.possuemCauda = possuemCauda;
        this.familia = familia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getPossuemCauda() {
        return possuemCauda;
    }

    public void setPossuemCauda(boolean possuemCauda) {
        this.possuemCauda = possuemCauda;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Arara{" +
                "cor='" + cor + '\'' +
                ", possuemCauda='" + possuemCauda + '\'' +
                ", familia='" + familia + '\'' +
                '}'+super.toString();
    }
}
