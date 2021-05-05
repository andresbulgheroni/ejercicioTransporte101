public class FedEx extends StrategyEnvio{
    int pesoMaximo;
    int precioNormal;
    double porcentajeAumento; //entre 0 y 1.

    int calcularPrecio(boolean esLargaDistancia,int pesoPaquete){
        if(pesoPaquete >pesoMaximo){
            return (int) (precioNormal*pesoPaquete+precioNormal*pesoPaquete*porcentajeAumento);
        }else{
            return precioNormal*pesoPaquete;
        }
    }

    public FedEx(int pesoMaximo, int precioNormal, double porcentajeAumento) {
        this.pesoMaximo = pesoMaximo;
        this.precioNormal = precioNormal;
        this.porcentajeAumento = porcentajeAumento;
    }
}
