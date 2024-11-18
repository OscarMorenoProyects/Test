package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueTest {
    private static final Logger LOG=Logger.getLogger(ParqueTest.class.getName());

    @Test
    public void parqueNombreNulo(){
        LOG.info("iniciando test parque nombre nulo");
        assertThrows(Throwable.class,() ->new Parque(null, "parque principal", Municipio.CALARCA));
        LOG.info("finalizando test parque nombre nulo");
    }

    @Test
    public void ParqueInfantilNombreVacio() {
        LOG.info("Iniciado test ParqueInfantilNombreVacio");

        assertThrows(Throwable.class, () -> new Parque("", "Descripción", Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilNombreVacio");
    }

    @Test
    public void ParqueInfantilDescripcionNula() {
        LOG.info("Iniciado test ParqueInfantilDescripcionNula");

        assertThrows(Throwable.class, () -> new Parque("Nombre", null, Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilDescripcionNula");
    }

    @Test
    public void ParqueInfantilDescripcionVacia() {
        LOG.info("Iniciado test ParqueInfantilDescripcionVacia");

        assertThrows(Throwable.class, () -> new Parque("Nombre", "", Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilDescripcionVacia");
    }

    @Test
    public void valorParqueSinZonas(){
        Parque parque =new Parque("bonanza", "centro", Municipio.CALARCA);
        assertEquals(10000.0, parque.calcularCosto(),App.PRECISION);
    }

    @Test
    public void valorParqueZonaCircular(){
        Parque parque=new Parque("parque cafetero", "parque tematico", Municipio.CALARCA);
        assertEquals(10000.0, parque.calcularCosto(),App.PRECISION);
    }
    @Test
    public void ParqueZonasIgualNombre() {
        LOG.info("Iniciado test ParqueZonasIgualNombre");
            Parque parque =new Parque("p/Bolivar", "centro ciudad",Municipio.CALARCA );
            parque.agregarZona(new Zona("lleras", Material.ARENA,new Circulo(10)));
            assertThrows(Throwable.class,()->parque.agregarZona(new Zona("lleras", Material.ARENA,new Circulo(10))));
        LOG.info("Finalizando test ParqueZonasIgualNombre");
    }

    @Test
    public void parquesMunicipio(){
        Proyecto proyecto=new Proyecto();
        
        var pijao1 = new Parque("P1", "D1", Municipio.PIJAO);
        var cordoba1 = new Parque("P2", "D2", Municipio.CORDOBA);
        var buenavista1 = new Parque("P3", "D3", Municipio.BUENAVISTA);
        var pijao2 = new Parque("P4", "D4", Municipio.PIJAO);
        var cordoba2 = new Parque("P5", "D5", Municipio.CORDOBA);
        var buenavista2 = new Parque("P6", "D6", Municipio.BUENAVISTA);

        
    }
    

    


}
