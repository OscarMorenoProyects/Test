package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

public class proyectoGobernacionTest {
    @Test
    public void ParquesMunicipio() {

        var proyecto = new Proyecto();

        var pijao1 = new Parque("P1", "D1", Municipio.PIJAO);
        var cordoba1 = new Parque("P2", "D2", Municipio.CORDOBA);
        var buenavista1 = new Parque("P3", "D3", Municipio.BUENAVISTA);
        var pijao2 = new Parque("P4", "D4", Municipio.PIJAO);
        var cordoba2 = new Parque("P5", "D5", Municipio.CORDOBA);
        var buenavista2 = new Parque("P6", "D6", Municipio.BUENAVISTA);
        proyecto.addParqueInfantil(buenavista1);
        proyecto.addParqueInfantil(cordoba1);
        proyecto.addParqueInfantil(buenavista1);

        proyecto.addParqueInfantil(pijao2);
        proyecto.addParqueInfantil(cordoba2);
        proyecto.addParqueInfantil(buenavista2);

        Collection<Parque> listaEsperada = List.of(cordoba1, cordoba2, buenavista1, buenavista2, pijao1, pijao2);

        assertIterableEquals(listaEsperada, proyecto.getParquesOrdenValorAscendete());


}
}