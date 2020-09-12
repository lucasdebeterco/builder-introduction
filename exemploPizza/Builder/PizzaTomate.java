package exemploPizza.Builder;

import exemploPizza.Interface.IPizza;

public class PizzaTomate implements IPizza {
    @Override
    public void tamanho(int tamanho) {
        pizza.setTamanho(tamanho);
    }

    @Override
    public void queijo() {
        pizza.setQueijo(false);
    }

    @Override
    public void tomate() {
        pizza.setTomate(true);
    }

    @Override
    public void bacon() {
        pizza.setBacon(false);
    }
}
