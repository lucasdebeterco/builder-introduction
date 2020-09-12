package exemploPizza.Class;

public class Pizza {
    private int tamanho = 10;
    private boolean queijo = false;
    private boolean tomate = false;
    private boolean bacon = false;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("tamanho=").append(tamanho);
        sb.append(", queijo=").append(queijo);
        sb.append(", tomate=").append(tomate);
        sb.append(", bacon=").append(bacon);
        sb.append('}');
        return sb.toString();
    }
}
