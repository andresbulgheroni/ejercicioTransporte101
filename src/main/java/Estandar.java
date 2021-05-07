public class Estandar extends StrategyEnvio{
    double tarifaLargaDistancia;
    double tarifaLocal;

    public Estandar(double tarifaLargaDistancia, double tarifaLocal) {
        this.tarifaLargaDistancia = tarifaLargaDistancia;
        this.tarifaLocal = tarifaLocal;
    }

    double calcularPrecio(boolean esLargaDistancia,double kiloPaquete){
        if(esLargaDistancia){
           return kiloPaquete* tarifaLargaDistancia;
        } else{
            return kiloPaquete*tarifaLocal;
        }
    }

}
