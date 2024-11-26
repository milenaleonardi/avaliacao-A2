public class Main {
    public static void main(String[] args) {
        //Criando os objetos
        ITransporteStrategy terrestre = new TransporteTerrestre(100);
        ITransporteStrategy maritimo = new TransporteMaritimo();
        ITransporteStrategy aereo = new TransporteAereo(150, 300);
        ITransporteStrategy drone = new Drones(120);

        Encomenda encomenda = new Encomenda(
                50,
                7,
                150,
                false,
                true
        );

        // Selecionar transporte com base nas características da encomenda
        if (encomenda.peso <= 5 && encomenda.isAreaMetropolitana) {
            drone.operarTransporte(encomenda);
        } else if (encomenda.isInternacional) {
            maritimo.operarTransporte(encomenda);
        } else if (encomenda.peso <= 50) {
            aereo.operarTransporte(encomenda);
        } else {
            terrestre.operarTransporte(encomenda);
        }
    }
}
