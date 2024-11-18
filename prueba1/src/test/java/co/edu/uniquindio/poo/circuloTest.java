package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class circuloTest {
     private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

@Test
public  void  calcularAreaCirculo(){
    LOG.info("inicializando test area");
    Circulo circulo=new Circulo(10);
    assertEquals(314.1592653589793, circulo.calcularArea(),App.PRECISION);
}

@Test
public void areaCirculoNegativo(){
    assertThrows(Throwable.class, ()->new Circulo(-10));

}





}
