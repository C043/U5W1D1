package fragnito.U5W1D1.entities;

public class Bevanda extends Cibo{
    private double litri;

    public Bevanda(String nome, int kcal, double prezzo, double litri) {
        super(nome, kcal, prezzo);
        this.litri = litri;
    }
}
