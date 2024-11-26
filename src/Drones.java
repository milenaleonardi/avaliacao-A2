public class Drones implements ITransporteStrategy{
    public double limiteDimensaoEncomenda;

    public Drones(double limiteDimensaoEncomenda) {
        this.limiteDimensaoEncomenda = limiteDimensaoEncomenda;
    }

    @Override
    public void operarTransporte(Encomenda encomenda) {
        if(encomenda.isAreaMetropolitana && encomenda.dimensao < limiteDimensaoEncomenda){
            System.out.println("Drone pronto para realizar a entrega.");
        }
        System.out.println("Área fora da entrega permitida ou dimensão do pacote maior do que o limite definido para o drone.");
    }
}
