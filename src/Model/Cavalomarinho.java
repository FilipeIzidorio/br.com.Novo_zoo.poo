package Model;

public class Cavalomarinho extends Animal {
    public String CM;
    public boolean temEscama;
    public boolean ameacadoExtincao;
    public String tipoAgua;

    public Cavalomarinho(int quantidade_patas, String genero, boolean tem_rabo, String CM, boolean temEscama, boolean ameacadoExtincao, String tipoAgua) {
        super(quantidade_patas, genero, tem_rabo);
        this.CM = CM;
        this.temEscama = temEscama;
        this.ameacadoExtincao = ameacadoExtincao;
        this.tipoAgua = tipoAgua;
    }

    public String getCM() {
        return CM;
    }

    public void setCM(String CM) {
        this.CM = CM;
    }

    public boolean isTemEscama() {
        return temEscama;
    }

    public void setTemEscama(boolean temEscama) {
        this.temEscama = temEscama;
    }

    public boolean isAmeacadoExtincao() {
        return ameacadoExtincao;
    }

    public void setAmeacadoExtincao(boolean ameacadoExtincao) {
        this.ameacadoExtincao = ameacadoExtincao;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String toString() {
        return "Cavalo_marinho{" +
                "CM='" + CM + '\'' +
                ", temEscama=" + temEscama +
                ", ameacadoExtincao=" + ameacadoExtincao +
                ", tipoAgua='" + tipoAgua + '\'' +
                '}'+super.toString();
    }
}
