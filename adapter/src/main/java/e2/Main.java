package e2;

public class Main {
    public static void main(String[] args) {

        PagoFactory tarjetaFactory = new PagoTarjetaFactory();
        IProcesadorPago pago1 = tarjetaFactory.crearPago();
        pago1.procesarPago();

        PagoFactory paypalFactory = new PayPalAPIFactory();
        IProcesadorPago pago2 = paypalFactory.crearPago();
        pago2.procesarPago();

        PagoFactory mpFactory = new ServicioMPFactory();
        IProcesadorPago pago3 = mpFactory.crearPago();
        pago3.procesarPago();
    }
}
