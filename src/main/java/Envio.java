public class Envio {
    boolean esLargaDistancia;
    int pesoPaquete;
    StrategyEnvio estrategiaEnvio;

    public Envio(boolean esLargaDistancia, int pesoPaquete, StrategyEnvio estrategiaEnvio) {
        this.esLargaDistancia = esLargaDistancia;
        this.pesoPaquete = pesoPaquete;
        this.estrategiaEnvio = estrategiaEnvio;
    }

    int calcularPrecio(){
       return estrategiaEnvio.calcularPrecio(esLargaDistancia,pesoPaquete);
    }


}
