package Model;


public class Sardinha extends Animal{

    public boolean respiracao;
    public boolean temEscama;


    public Sardinha(int quantidade_patas, String genero, boolean tem_rabo, boolean respiracao, boolean tem_escama) {
                super(quantidade_patas, genero, tem_rabo);
        this.respiracao = respiracao;
        this.temEscama = tem_escama;
    }
    public boolean isRespiracao() {
        return respiracao;
    }

        public void setRespiracao(boolean respiracao) {

        this.respiracao = respiracao;
    }

        public boolean isTemEscama() {

        return temEscama;
    }

        public void setTem_escamaem_escama(boolean tem_escama) {

        tem_escama = tem_escama;
    }

    @Override
        public String toString() {
        return "Sardinha{" +
                "respiracao=" + respiracao +
                ", Tem_escama=" + temEscama +
                '}'+super.toString();
        }
}
