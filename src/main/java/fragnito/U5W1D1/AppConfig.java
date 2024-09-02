package fragnito.U5W1D1;

import fragnito.U5W1D1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Tomato tomato(){
        return new Tomato("Tomato", 50, 1);
    }
    @Bean
    public Cheese cheese(){
        return new Cheese("Cheese", 50, 0.69);
    }
    @Bean
    public Ham ham(){
        return new Ham("Ham", 120, 0.99);
    }
    @Bean
    public Pineapple pineapple(){
        return new Pineapple("Pineapple", 24, 0.79);
    }
    @Bean
    public Salami salami(){
        return new Salami("Salami", 86, 0.99);
    }
    @Bean
    public PizzaMargherita pizzaMargherita(Tomato tomato, Cheese cheese){
        return new PizzaMargherita("Pizza Margherita (tomato, cheese)", 1104, 4.99, tomato,  cheese);
    }
    @Bean
    public HawaiianPizza hawaiianPizza(Tomato tomato, Cheese cheese, Ham ham, Pineapple pineapple){
        return new HawaiianPizza("Hawaiian Pizza (tomato, cheese, ham, pineapple)", 1024, 6.49, tomato, cheese, ham, pineapple);
    }
    @Bean
    public SalamiPizza salamiPizza(Tomato tomato, Cheese cheese, Salami salami){
        return new SalamiPizza("Salami Pizza (tomato, cheese, salami)", 1160, 5.99, tomato, cheese, salami);
    }
    @Bean
    public Acqua acqua(){
        return new Acqua("Water", 0, 1.29, 0.5);
    }
    @Bean
    public Birra birra(){
        return new Birra("Birra", 355, 5, 0.55);
    }
    @Bean
    public Vino vino(){
        return new Vino("Vino", 607, 7.49, 0.75);
    }
    @Bean
    public Menu menu(PizzaMargherita pizzaMargherita, HawaiianPizza hawaiianPizza, SalamiPizza salamiPizza, Cheese cheese, Ham ham, Pineapple pineapple, Salami salami, Acqua acqua, Birra birra, Vino vino){
        return new Menu(pizzaMargherita, hawaiianPizza, salamiPizza, cheese, ham, pineapple, salami, acqua, vino, birra);
    }
}
