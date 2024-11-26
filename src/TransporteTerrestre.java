public class TransporteTerrestre implements ITransporteStrategy {
    public double limiteDistancia;

    public TransporteTerrestre(double limiteDistancia) {
        this.limiteDistancia = limiteDistancia;
    }

    @Override
    public void operarTransporte(Encomenda encomenda) {
        if (isTransportadoraLocal(encomenda.distanciaEntrega)){
            System.out.println("Transporte terrestre pronto para realizar a entrega.");
        }
        System.out.println("Somente entregas para transportadoras locais.");
    }

    public boolean isTransportadoraLocal(double distancia){
        if(distancia < limiteDistancia)
            return true;
        return false;
    }
}
