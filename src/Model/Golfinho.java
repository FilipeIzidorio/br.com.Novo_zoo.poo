package Model;

public class Golfinho extends Animal{
    public float metros;
    public float kg;

    public Golfinho(int quantidade_patas, String genero, boolean tem_rabo, float metros, float kg) {
        super(quantidade_patas, genero, tem_rabo);
        this.metros = metros;
        this.kg = kg;
    }

    public float getMetros() {
        return metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Golfinho{" +
                "metros=" + metros +
                ", kg=" + kg +
                '}'+super.toString();
    }
}
