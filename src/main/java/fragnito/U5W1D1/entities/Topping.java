package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Topping extends Cibo{
    public Topping(String nome, int kcal, double prezzo) {
        super(nome, kcal, prezzo);
    }
}
