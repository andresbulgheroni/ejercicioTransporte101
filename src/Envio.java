public class Envio {
    boolean esLargaDistancia;
    int pesoPaquete;
    StrategyEnvio estrategiaEnvio;

    int calcularPrecio(){
       return estrategiaEnvio.calcularPrecio(esLargaDistancia,pesoPaquete);
    }


}
