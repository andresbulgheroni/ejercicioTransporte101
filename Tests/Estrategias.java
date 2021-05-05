import org.junit.Test;
import static org.junit.Assert.*;

public class Estrategias {
    Estandar estandar = new Estandar(50,25);
    FedEx fedEx = new FedEx(100,5,0.5);
    Ups ups = new Ups(100,10,0.5,100);
    Envio envio= new Envio(true, 1000, estandar);
    Envio envio2= new Envio(false, 1000, estandar);
    Envio envio3= new Envio(true, 1000, fedEx);
    Envio envio4= new Envio(false, 50, fedEx);
    Envio envio5= new Envio(true, 50, ups);
    Envio envio6= new Envio(false, 150, ups);

    @Test
    public void multiplicaPor50SiEsEstandarYLargaDist(){
        assertEquals(envio.calcularPrecio(),50000);
    }

    @Test
    public void multiplicaPor25SiEsEstandarYDistLocal(){
        assertEquals(envio2.calcularPrecio(),25000);
    }

    @Test
    public void siEsMayorAPesoMaxYEsFedEx(){
        assertEquals(envio3.calcularPrecio(),7500);
    }

    @Test
    public void siEsMenorAPesoMaxYEsFedEx(){
        assertEquals(envio4.calcularPrecio(),250);
    }

    @Test
    public void siEsMenorAPesoMinYEsUps(){
        assertEquals(envio5.calcularPrecio(),600);
    }

    @Test
    public void siEsMayorAPesoMinYEsUps(){
        assertEquals(envio6.calcularPrecio(),2350);
    }

}
