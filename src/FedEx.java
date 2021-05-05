public class FedEx extends StrategyEnvio{
    int pesoMaximo;
    int precioNormal;
    int porcentajeAumento; //entre 0 y 1.

    int calcularPrecio(boolean esLargaDistancia,int pesoPaquete){
        if(pesoPaquete >pesoMaximo){
            return precioNormal*pesoPaquete+precioNormal*pesoPaquete*porcentajeAumento;
        }else{
            return precioNormal*pesoPaquete;
        }
    }
}
