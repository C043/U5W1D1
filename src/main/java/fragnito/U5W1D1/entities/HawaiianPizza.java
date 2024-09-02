package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HawaiianPizza extends PizzaMargherita{
    private Ham ham;
    private Pineapple pineapple;

    public HawaiianPizza(String nome, int kcal, double prezzo, Tomato tomato, Cheese cheese, Ham ham, Pineapple pineapple) {
        super(nome, kcal, prezzo, tomato, cheese);
        this.ham = ham;
        this.pineapple = pineapple;
    }
}
