package exemploCarro.Director;

import exemploCarro.Builder.CarroBuilder;
import exemploCarro.Class.CarroProduct;

public class ConcessionariaDirector {
    protected CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro () {
        montadora.buildPreco();
        montadora.buildAno();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }

    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
}
