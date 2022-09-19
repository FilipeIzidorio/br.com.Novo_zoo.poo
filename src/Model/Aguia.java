package Model;

public class Aguia extends Animal{
    public String garras;
    public String familia;
    public String espercie;
    public boolean possuemBico;

    public Aguia(int quantidade_patas, String genero,boolean tem_rabo,String garras, String familia, String espercie, boolean possuemBico) {
        super(quantidade_patas,genero,tem_rabo);
        this.garras = garras;
        this.familia = familia;
        this.espercie = espercie;
        this.possuemBico = possuemBico;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEspercie() {
        return espercie;
    }

    public void setEspercie(String espercie) {
        this.espercie = espercie;
    }

    public boolean isPossuemBico() {
        return possuemBico;
    }

    public void setPossuemBico(boolean possuemBico) {
        this.possuemBico = possuemBico;
    }

    @Override
    public String toString() {
        return "Aguia{" +
                "garras='" + garras + '\'' +
                ", familia='" + familia + '\'' +
                ", espercie='" + espercie + '\'' +
                ", possuemBico=" + possuemBico +
                '}'+super.toString();
    }
}
