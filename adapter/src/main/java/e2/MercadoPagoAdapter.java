package e2;

public class MercadoPagoAdapter implements IProcesadorPago {
    private ServicioMercadoPago servicioMercadoPago;

    public MercadoPagoAdapter(ServicioMercadoPago servicioMercadoPago) {
        this.servicioMercadoPago = servicioMercadoPago;
    }

    @Override
    public void procesarPago() {
        servicioMercadoPago.realizarPago();
    }
}
