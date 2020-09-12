package exemploPizza.Interface;

import exemploPizza.Class.Pizza;

public interface IPizza {
    Pizza pizza = new Pizza();
    public void tamanho (int tamanho);
    public void queijo();
    public void tomate();
    public void bacon();
    public default Pizza build() {
        return pizza;
    }
}
