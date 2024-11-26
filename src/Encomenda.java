public class Encomenda {
    public double peso; // em Kg
    public double dimensao; // em cm
    public boolean isInternacional;
    public boolean isAreaMetropolitana;
    public double distanciaEntrega; // em km

    public Encomenda(double distanciaEntrega, double peso, double dimensao, boolean isInternacional, boolean isAreaMetropolitana) {
        this.distanciaEntrega = distanciaEntrega;
        this.peso = peso;
        this.dimensao = dimensao;
        this.isInternacional = isInternacional;
        this.isAreaMetropolitana = isAreaMetropolitana;
    }

    public Encomenda() {
    }
}
