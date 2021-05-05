public class Ups extends StrategyEnvio{
    int pesoMinimo;
    int precioNormal;
    double porcentajeAumento;
    int costoEnvio;

    public Ups(int pesoMinimo, int precioNormal, double porcentajeAumento, int costoEnvio) {
        this.pesoMinimo = pesoMinimo;
        this.precioNormal = precioNormal;
        this.porcentajeAumento = porcentajeAumento;
        this.costoEnvio = costoEnvio;
    }

    int calcularPrecio(boolean esLargaDistancia, int pesoPaquete){
        if(pesoMinimo < pesoPaquete){
            return (int) (precioNormal*pesoPaquete+precioNormal*pesoPaquete*porcentajeAumento+costoEnvio);
        }else{
            return precioNormal*pesoPaquete+costoEnvio;
        }
    }

}
