package e2;

public class PayPalAPI extends Pago {
    // Solo token para PayPal API
    private String token;

    public PayPalAPI(String token) {
        this.token = token;
    }

    @Override
    public void crearPago() {
        System.out.println("Creando pago en PayPal API (Token: " + token + ")");
    }

    public void enviarPago() {
        System.out.println("Enviando pago de $" + monto + " con Token PayPal: " + token);
    }
}


