package e2;

public class PagoTarjetaFactory implements PagoFactory {
    @Override
    public IProcesadorPago crearPago() {
        return new PagoTarjetaInterno(150.0, "4500-XXXX-XXXX-1234");
    }
}
