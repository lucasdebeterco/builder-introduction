package exemploCarro;

import exemploCarro.Class.CarroProduct;
import exemploCarro.Builder.ChevroletBuilder;
import exemploCarro.Builder.FiatBuilder;
import exemploCarro.Director.ConcessionariaDirector;

public class Main {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println(carro);

        concessionaria = new ConcessionariaDirector(new ChevroletBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println(carro);

    }
}
