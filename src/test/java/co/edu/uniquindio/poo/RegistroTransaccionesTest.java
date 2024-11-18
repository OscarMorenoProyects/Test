package co.edu.uniquindio.poo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

  

public class RegistroTransaccionesTest {

    private RegistroTransacciones registro;
    private Transaccion transaccion1;
    private Transaccion transaccion2;

    @BeforeEach
    void setUp() {
        registro = new RegistroTransacciones("2024-11-18");
        transaccion1 = new Transaccion("123", "Compra", 1000);
        transaccion2 = new Transaccion("456", "Venta", 500);
    }

    @Test
    void testRegistrarTransaccionExitoso() {
        registro.registrarTransaccion(transaccion1);
        
        assertTrue(registro.verificarTransaccion(transaccion1), "La transacción debería estar registrada.");
    }

    @Test
    void testRegistrarTransaccionCodigoDuplicado() {
        registro.registrarTransaccion(transaccion1);
        
        registro.registrarTransaccion(transaccion1);
        
        assertTrue(registro.verificarTransaccion(transaccion1), "La transacción debería estar registrada.");
    }

    @Test
    void testRegistrarTransaccionCodigoUnico() {
        registro.registrarTransaccion(transaccion1);
        registro.registrarTransaccion(transaccion2);
        
        assertTrue(registro.verificarTransaccion(transaccion1), "La transacción 1 debería estar registrada.");
        assertTrue(registro.verificarTransaccion(transaccion2), "La transacción 2 debería estar registrada.");
    }
}


