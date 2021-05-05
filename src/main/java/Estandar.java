public class Estandar extends StrategyEnvio{
    int tarifaLargaDistancia;
    int tarifaLocal;

    int calcularPrecio(boolean esLargaDistancia,int kiloPaquete){
        if(esLargaDistancia){
           return kiloPaquete* tarifaLargaDistancia;
        } else{
            return kiloPaquete*tarifaLocal;
        }
    }

    public Estandar(int tarifaLargaDistancia, int tarifaLocal) {
        this.tarifaLargaDistancia = tarifaLargaDistancia;
        this.tarifaLocal = tarifaLocal;
    }
}
