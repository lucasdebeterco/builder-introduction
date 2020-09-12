package exemploCarro.Builder;

public class ChevroletBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.setPreco(120000.00);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("6.2");
    }

    @Override
    public void buildAno() {
        carro.setAno(2011);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("Camaro");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("Chevrolet");
    }
}
