public class Ups extends StrategyEnvio{
    double pesoMinimo;
    double precioNormal;
    double porcentajeAumento;
    double costoEnvio;

    public Ups(double pesoMinimo, double precioNormal, double porcentajeAumento, double costoEnvio) {
        this.pesoMinimo = pesoMinimo;
        this.precioNormal = precioNormal;
        this.porcentajeAumento = porcentajeAumento;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecio(boolean esLargaDistancia, double pesoPaquete){
        double porcentajePenalizacion = pesoMinimo<pesoPaquete? porcentajeAumento: 0;

        return precioNormal*pesoPaquete*(1+porcentajePenalizacion)+costoEnvio;
    }
}
