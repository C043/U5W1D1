package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PizzaMargherita extends Cibo{
    private Tomato tomato;
    private Cheese cheese;

    public PizzaMargherita(String nome, int kcal, double prezzo, Tomato tomato, Cheese cheese) {
        super(nome, kcal, prezzo);
        this.tomato = tomato;
        this.cheese = cheese;
    }
}
