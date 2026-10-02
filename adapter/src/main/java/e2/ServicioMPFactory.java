package e2;

public class ServicioMPFactory implements PagoFactory {
    @Override
    public IProcesadorPago crearPago() {
        ServicioMercadoPago mp = new ServicioMercadoPago("CLIENTE_MP_4433");
        mp.setMonto(80.5);
        return new MercadoPagoAdapter(mp);
    }
}