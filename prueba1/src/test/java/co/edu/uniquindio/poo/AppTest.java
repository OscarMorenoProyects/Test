/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
    @Test
    public void comparar(){
        App app =new App();
        assertThrows(Throwable.class, ()->app.dividir(1,0));
    }

    @Test
    public void ingresarOperacion(){
        App app =new App();
        assertThrows(Throwable.class, ()->app.ingresarOperacion('8'));

        
    }

    @Test
    public void determinarCosto(){
        App app=new App();
        assertEquals(20.000, app.calcularCosto(5, 4.000));
    }

   
@Test
public void testAssertTrue(){
    LOG.info("inicio");
     int number=9+10;
     assertTrue(number==19);
}






}
