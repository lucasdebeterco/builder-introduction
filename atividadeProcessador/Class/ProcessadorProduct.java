package atividadeProcessador.Class;

public class ProcessadorProduct {
    private String marca;
    private String modelo;
    private double frequencia;
    private int qntNucleos;
    private int qntThreads;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getQntNucleos() {
        return qntNucleos;
    }

    public void setQntNucleos(int qntNucleos) {
        this.qntNucleos = qntNucleos;
    }

    public int getQntThreads() {
        return qntThreads;
    }

    public void setQntThreads(int qntThreads) {
        this.qntThreads = qntThreads;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProcessadorProduct{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", frequencia=").append(frequencia);
        sb.append(", qntNucleos=").append(qntNucleos);
        sb.append(", qntThreads=").append(qntThreads);
        sb.append('}');
        return sb.toString();
    }
}
