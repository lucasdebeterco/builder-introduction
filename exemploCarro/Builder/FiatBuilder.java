package exemploCarro.Builder;

public class FiatBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.setPreco(33000.00);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("2.0 Turbo");
    }

    @Override
    public void buildAno() {
        carro.setAno(2004);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("Marea");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("Fiat");
    }
}
