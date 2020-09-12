package exemploPizza;

import exemploPizza.Builder.PizzaBacon;
import exemploPizza.Builder.PizzaQueijo;
import exemploPizza.Builder.PizzaTomate;
import exemploPizza.Class.Pizza;
import exemploPizza.Director.PizzaDirector;

public class Main {
    public static void main(String[] args) {
        PizzaDirector pd = new PizzaDirector(new PizzaBacon());
        pd.construirPizza(10);
        Pizza p1 = pd.getPizza();
        System.out.println(p1);

        pd = new PizzaDirector(new PizzaQueijo());
        pd.construirPizza(20);
        Pizza p2 = pd.getPizza();
        System.out.println(p2);

        pd = new PizzaDirector(new PizzaTomate());
        pd.construirPizza(15);
        Pizza p3 = pd.getPizza();
        System.out.println(p3);
    }
}
