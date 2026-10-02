package e2;

public class PagoTarjetaInterno extends Pago implements IProcesadorPago {
    // Solo numeroTarjeta para Pago Tarjeta Interno
    private String numeroTarjeta;

    public PagoTarjetaInterno(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void crearPago() {
        System.out.println("Registrando transacción de Tarjeta...");
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando $" + monto + " directamente a la tarjeta " + numeroTarjeta);
    }
}