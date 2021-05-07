public class FedEx extends StrategyEnvio{
    private double pesoMaximo;
    private double precioNormal;
    private double porcentajeAumento; //entre 0 y 1.

    public FedEx(double pesoMaximo, double precioNormal, double porcentajeAumento) {
        this.pesoMaximo = pesoMaximo;
        this.precioNormal = precioNormal;
        this.porcentajeAumento = porcentajeAumento;
    }

    @Override
    public double calcularPrecio(boolean esLargaDistancia,double pesoPaquete){
        return precioNormal*pesoPaquete*(1 + porcentajePenalizacionPorPeso(pesoPaquete));
    }

    private double porcentajePenalizacionPorPeso(double pesoPaquete) {
        return pesoMaximo<pesoPaquete? porcentajeAumento : 0;
    }
}
