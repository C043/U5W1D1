package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalamiPizza extends PizzaMargherita{
    private Salami salami;

    public SalamiPizza(String nome, int kcal, double prezzo, Tomato tomato, Cheese cheese, Salami salami) {
        super(nome, kcal, prezzo, tomato, cheese);
        this.salami = salami;
    }
}
