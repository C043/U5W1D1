package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Birra extends Bevanda{
    public Birra(String nome, int kcal, double prezzo, double litri) {
        super(nome, kcal, prezzo, litri);
    }
}
