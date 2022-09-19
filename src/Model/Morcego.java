package Model;

public class Morcego extends Animal{
    public String espercie;
    public String ordem;
    public String habitos;

    public Morcego(int quantidade_patas, String genero, boolean tem_rabo, String espercie, String ordem, String habitos) {
        super(quantidade_patas, genero, tem_rabo);
        this.espercie = espercie;
        this.ordem = ordem;
        this.habitos = habitos;
    }

    public String getEspercie() {
        return espercie;
    }

    public void setEspercie(String espercie) {
        this.espercie = espercie;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    @Override
    public String toString() {
        return "Morcego{" +
                "espercie='" + espercie + '\'' +
                ", ordem='" + ordem + '\'' +
                ", habitos='" + habitos + '\'' +
                '}'+super.toString();
    }
}
