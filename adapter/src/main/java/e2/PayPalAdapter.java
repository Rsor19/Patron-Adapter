package e2;

public class PayPalAdapter implements IProcesadorPago {
    private PayPalAPI payPalApi;

    public PayPalAdapter(PayPalAPI payPalApi) {
        this.payPalApi = payPalApi;
    }

    @Override
    public void procesarPago() {
        payPalApi.enviarPago();
    }
}