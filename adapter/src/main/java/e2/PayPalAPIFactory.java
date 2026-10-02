package e2;

public class PayPalAPIFactory implements PagoFactory {
    @Override
    public IProcesadorPago crearPago() {
        PayPalAPI api = new PayPalAPI("TOKEN_PP_998877");
        api.setMonto(250.0);
        return new PayPalAdapter(api);
    }
}
