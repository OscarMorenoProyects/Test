import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class administradorTest {
 private SistemaConcesionario sistemaConcesionario;
    private Administrador adm;
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private Vehiculo vehiculo1;
    private Vehiculo vehiculo2;
    private Cliente cliente1;
    private Cliente cliente2;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    void setUp() {
        // Crear la instancia real de SistemaConcesionario
        Administrador adm=new Administrador("andres", "108858944", "uAdm", "1088589", "1Mate", "oscar@","311" ,sistemaConcesionario);
        Registro registro=new RegistroTransacciones("14/07/2014");
        sistemaConcesionario = new SistemaConcesionario("autos", adm, registro);

        // Crear listas de vehículos y clientes
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();

        // Crear objetos de clientes y vehículos
        Cliente cliente1 = new Cliente("Juan", "1", "juan123", "contraseña", "palabraSecreta", "juan@correo.com", "Calle 1", "123456789");
        Cliente cliente2 = new Cliente("Ana", "2", "ana123", "contraseña", "palabraSecreta", "ana@correo.com", "Calle 2", "987654321");
        Vehiculo vehiculo1 = new Vehiculo("Vehículo 1", "Marca1", "Modelo1");
        Vehiculo vehiculo2 = new Vehiculo("Vehículo 2", "Marca2", "Modelo2");

        // Agregar los clientes y vehículos a sus respectivas listas
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        clientes.add(cliente1);
        clientes.add(cliente2);

        // Establecer los valores en el objeto real, sin usar mocks
        sistemaConcesionario.setVehiculos(vehiculos);
        sistemaConcesionario.setClientes(clientes);

        // Ahora puedes usar los métodos directamente sin mocks
    }


    @Test
    void testEliminarVehiculoExistente() {
        adm.eliminarVehiculo("123ABC");

        assertEquals(1, sistemaConcesionario.getVehiculos().size());
        assertFalse(sistemaConcesionario.getVehiculos().contains(vehiculo1));

        assertTrue(outputStreamCaptor.toString().contains("Vehículo Eliminado exitosamente"));
    }

    @Test
    void testEliminarVehiculoNoExistente() {
        adm.eliminarVehiculo("999XYZ");

        assertEquals(2, sistemaConcesionario.getVehiculos().size());

        assertTrue(outputStreamCaptor.toString().contains("Vehículo no encontrado."));
    }

    @Test
    void testEliminarClienteExistente() {
        adm.eliminarCliente("1");

        assertEquals(1, sistemaConcesionario.getClientes().size());
        assertFalse(sistemaConcesionario.getClientes().contains(cliente1));

        assertTrue(outputStreamCaptor.toString().contains("Cliente eliminado exitosamente."));
    }

    @Test
    void testEliminarClienteNoExistente() {
        adm.eliminarCliente("999");

        assertEquals(2, sistemaConcesionario.getClientes().size());

        assertTrue(outputStreamCaptor.toString().contains("Cliente no encontrado."));
    }




    
}
