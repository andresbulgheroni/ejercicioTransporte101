public class Ups extends StrategyEnvio{
    int pesoMinimo;
    int precioNormal;
    int porcentajeAumento;
    int costoEnvio;

    int calcularPrecio(boolean esLargaDistancia,int pesoPaquete){
        if(pesoMinimo >pesoPaquete){
            return precioNormal*pesoPaquete+precioNormal*pesoPaquete*porcentajeAumento+costoEnvio;
        }else{
            return precioNormal*pesoPaquete+costoEnvio;
        }
    }

}
