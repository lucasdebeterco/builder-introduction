package exemploPizza.Director;

import exemploPizza.Interface.IPizza;
import exemploPizza.Class.Pizza;

public class PizzaDirector {
    protected IPizza builder;
    public PizzaDirector(IPizza pizzabuilder) {
        this.builder = pizzabuilder;
    }

    public void construirPizza(int tamanho) {
        builder.bacon();
        builder.queijo();
        builder.tomate();
        builder.tamanho(tamanho);
    }

    public Pizza getPizza() {
        return builder.build();
    }
}
