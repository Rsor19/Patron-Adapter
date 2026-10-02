package e2;

public class ServicioMercadoPago extends Pago {
    // Solo idCliente para Servicio Mercado Pago
    private String idCliente;

    public ServicioMercadoPago(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void crearPago() {
        System.out.println("Creando pago en Mercado Pago para Cliente ID: " + idCliente);
    }

    public void realizarPago() {
        System.out.println("Realizando pago de $" + monto + " para cliente ID: " + idCliente);
    }
}
