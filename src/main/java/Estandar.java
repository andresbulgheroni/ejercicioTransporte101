public class Estandar extends StrategyEnvio{
    private double tarifaLargaDistancia;
    private double tarifaLocal;

    public Estandar(double tarifaLargaDistancia, double tarifaLocal) {
        this.tarifaLargaDistancia = tarifaLargaDistancia;
        this.tarifaLocal = tarifaLocal;
    }

    @Override
    public double calcularPrecio(boolean esLargaDistancia,double kiloPaquete){
        double tarifaPorDistancia = esLargaDistancia? tarifaLargaDistancia: tarifaLocal;
        return tarifaPorDistancia*kiloPaquete;
    }

}
