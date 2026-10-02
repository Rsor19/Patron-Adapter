package e2;

public abstract class Pago {

    protected double monto;

    public Pago() {
    }

    public Pago(double monto) {
        this.monto = monto;
    }

    public abstract void crearPago();

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

}
