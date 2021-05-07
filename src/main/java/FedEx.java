public class FedEx extends StrategyEnvio{
    double pesoMaximo;
    double precioNormal;
    double porcentajeAumento; //entre 0 y 1.

    public FedEx(double pesoMaximo, double precioNormal, double porcentajeAumento) {
        this.pesoMaximo = pesoMaximo;
        this.precioNormal = precioNormal;
        this.porcentajeAumento = porcentajeAumento;
    }

    double calcularPrecio(boolean esLargaDistancia,double pesoPaquete){
        if(pesoPaquete >pesoMaximo){
            return precioNormal*pesoPaquete+precioNormal*pesoPaquete*porcentajeAumento;
        }else{
            return precioNormal*pesoPaquete;
        }
    }
}
