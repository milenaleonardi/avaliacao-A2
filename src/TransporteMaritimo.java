public class TransporteMaritimo implements ITransporteStrategy{
    @Override
    public void operarTransporte(Encomenda encomenda) {
        if (encomenda.isInternacional) {
            System.out.println("Transporte marítimo pronto para realizar a entrega.");
        }
        System.out.println("Transporte realizado somente para entregas internacionais.");
    }
}
