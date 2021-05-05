public class Estandar extends StrategyEnvio{
    int largaDistancia;
    int local;
    int calcularPrecio(boolean esLargaDistancia,int kiloPaquete){
        if(esLargaDistancia){
           return kiloPaquete* largaDistancia;
        } else{
            return kiloPaquete*local;
        }
    }

}
