public class TransporteAereo implements ITransporteStrategy {
    public double limiteTransportePeso;
    public double limiteTransporteDimensao;

    public TransporteAereo(double limiteTransportePeso, double limiteTransporteDimensao) {
        this.limiteTransportePeso = limiteTransportePeso;
        this.limiteTransporteDimensao = limiteTransporteDimensao;
    }

    @Override
    public void operarTransporte(Encomenda encomenda) {
        if (encomenda.peso < limiteTransportePeso && encomenda.dimensao < limiteTransporteDimensao ){
            System.out.println("Transporte aéreo pronto para realizar a entrega.");
            return;
        }
        System.out.println("Peso ou dimensão da encomenda ultrapassam o limite definido para o transporte.");
    }
}
