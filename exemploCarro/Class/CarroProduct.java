package exemploCarro.Class;

public class CarroProduct {
    private double preco;
    private String dscMotor;
    private int ano;
    private String modelo;
    private String montadora;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDscMotor() {
        return dscMotor;
    }

    public void setDscMotor(String dscMotor) {
        this.dscMotor = dscMotor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarroProduct{");
        sb.append("preco=").append(preco);
        sb.append(", dscMotor='").append(dscMotor).append('\'');
        sb.append(", ano=").append(ano);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", montadora='").append(montadora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
