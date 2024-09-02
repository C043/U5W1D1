package fragnito.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
    private PizzaMargherita pizzaMargherita;
    private HawaiianPizza hawaiianPizza;
    private SalamiPizza salamiPizza;

    private Cheese cheese;
    private Ham ham;
    private Pineapple pineapple;
    private Salami salami;

    private Acqua acqua;
    private Vino vino;
    private Birra birra;

    public Menu(PizzaMargherita pizzaMargherita, HawaiianPizza hawaiianPizza, SalamiPizza salamiPizza, Cheese cheese, Ham ham, Pineapple pineapple, Salami salami, Acqua acqua, Vino vino, Birra birra) {
        this.pizzaMargherita = pizzaMargherita;
        this.hawaiianPizza = hawaiianPizza;
        this.salamiPizza = salamiPizza;
        this.cheese = cheese;
        this.ham = ham;
        this.pineapple = pineapple;
        this.salami = salami;
        this.acqua = acqua;
        this.vino = vino;
        this.birra = birra;
    }

    public void printMenu(){
        System.out.println("Pizzas:");
        System.out.println(this.pizzaMargherita.getNome() + " (tomato, cheese) KCAL: " + this.pizzaMargherita.getKcal() + " Price: " + this.pizzaMargherita.getPrezzo());
        System.out.println(this.hawaiianPizza.getNome() + " (tomato, cheese, ham, pineapple) KCAL: " + this.hawaiianPizza.getKcal() + " Price: " + this.hawaiianPizza.getPrezzo());
        System.out.println(this.salamiPizza.getNome() + " (tomato, cheese, salami) KCAL: " + this.salamiPizza.getKcal() + " Price: " + this.salamiPizza.getPrezzo());
        System.out.println("Toppings:");
        System.out.println(this.cheese.getNome() + " KCAL: " + this.cheese.getKcal() + " Price: " + this.cheese.getPrezzo());
        System.out.println(this.ham.getNome() + " KCAL: " + this.ham.getKcal() + " Price: " + this.ham.getPrezzo());
        System.out.println(this.pineapple.getNome() + " KCAL: " + this.pineapple.getKcal() + " Price: " + this.pineapple.getPrezzo());
        System.out.println(this.salami.getNome() + " KCAL: " + this.salami.getKcal() + " Price: " + this.salami.getPrezzo());
        System.out.println("Drinks:");
        System.out.println(this.acqua.getNome() + " " + this.acqua.getLitri() + "l KCAL: " + this.acqua.getKcal() + " Price: " + this.acqua.getPrezzo());
        System.out.println(this.birra.getNome() + " " + this.birra.getLitri() + "l KCAL: " + this.birra.getKcal() + " Price: " + this.birra.getPrezzo());
        System.out.println(this.vino.getNome() + " " + this.vino.getLitri() + "l KCAL: " + this.vino.getKcal() + " Price: " + this.vino.getPrezzo());
    }
}
