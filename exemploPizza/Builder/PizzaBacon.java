package exemploPizza.Builder;

import exemploPizza.Interface.IPizza;

public class PizzaBacon implements IPizza {
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
        pizza.setTomate(false);
    }

    @Override
    public void bacon() {
        pizza.setBacon(true);
    }
}
