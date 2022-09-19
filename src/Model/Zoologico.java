package Model;

public class Zoologico {
    public String nome;
    public Ambiente ambiente;

    public Zoologico(String nome, Ambiente ambiente) {
        this.nome = nome;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", ambiente=" + ambiente +
                '}';
    }
}
