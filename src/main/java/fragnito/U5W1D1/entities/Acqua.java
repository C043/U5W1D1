package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Acqua extends Bevanda{
    public Acqua(String nome, int kcal, double prezzo, double litri) {
        super(nome, kcal, prezzo, litri);
    }
}
