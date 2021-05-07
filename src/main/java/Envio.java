import java.math.BigDecimal;

public class Envio {
    boolean esLargaDistancia;
    double pesoPaquete;
    StrategyEnvio estrategiaEnvio;

    public Envio(boolean esLargaDistancia, double pesoPaquete, StrategyEnvio estrategiaEnvio) {
        this.esLargaDistancia = esLargaDistancia;
        this.pesoPaquete = pesoPaquete;
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public double calcularPrecio(){
        double precio = estrategiaEnvio.calcularPrecio(esLargaDistancia,pesoPaquete);

        return BigDecimal.valueOf(precio).doubleValue();
    }


}
