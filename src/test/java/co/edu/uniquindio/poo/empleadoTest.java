package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class empleadoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
/*
 * test para eliminarVehiculo
 */
    @Test
    public void eliminarVehiculo1() {
        Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");

        RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
        SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);
        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true,
                100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = new Camion("Renol", "2008", "il 23", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false,
                100.000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true,
                13.0, 45.8, 34.8, EnumCombustible.GASOLINA);

        LinkedList<Vehiculo> vehiculos = sistem.getVehiculos();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        adm.eliminarVehiculo(vehiculo1.getMatricula());
        adm.eliminarVehiculo(vehiculo2.getMatricula());
        adm.eliminarVehiculo(vehiculo3.getMatricula());
        imprimir("vehiculos eliminados correctamente");

    }
/*
 * test para eliminarVehiculo con un vehiculo nulo
 */
    @Test
    public void eliminarVehiculoPruebaNulos() {
        Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inicio", "admi@", "3145");
        RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
        SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);

        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true,
                100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = null;
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true,
                13.0, 45.8, 34.8, EnumCombustible.GASOLINA);

        LinkedList<Vehiculo> vehiculos = sistem.getVehiculos();
        vehiculos.add(vehiculo1);
        if (vehiculo2 != null)
            vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        if (vehiculo1 != null) {
            adm.eliminarVehiculo(vehiculo1.getMatricula());
        } else {
            imprimir("Vehículo 1 es nulo y no puede ser eliminado.");
        }

        if (vehiculo2 != null) {
            adm.eliminarVehiculo(vehiculo2.getMatricula());
        } else {
            System.out.println("Vehículo 2 es nulo y no puede ser eliminado.");
        }

        if (vehiculo3 != null) {
            adm.eliminarVehiculo(vehiculo3.getMatricula());
        } else {
            imprimir("Vehículo 3 es nulo y no puede ser eliminado.");
        }

        imprimir("El proceso de eliminación ha finalizado.");
    }

    /*
     * test para eliminar cliente
     */
    @Test
    public void eliminarCliente2() {

        Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");

        RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
        SistemaConcesionario sistem = new SistemaConcesionario("twing", adm, registro);
        Cliente cliente1 = new Cliente("andres", "10885898567", "andre", "andre.9", "unico", "andres@", "cra5",
                "3117765");
        Cliente cliente2 = new Cliente("jose", "1088532567", "jose", "jose", "un", "andres@", "cra5", "3117765");
        Cliente cliente3 = new Cliente("miguel", "10887898567", "migue", "re.9", "ico", "hs@", "cra5", "3117765");
        Cliente cliente4 = new Cliente("guillermo", "10657898567", "gille", "hui.9", "tero", "guilles@", "cra8",
                "314778956");

        LinkedList<Cliente> clientes = sistem.getClientes();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        adm.eliminarCliente(cliente1.getId());
        adm.eliminarCliente(cliente2.getId());
        imprimir("cliente eliminado correctamente");

    }
    /*
     * test para eliminarVehiculo
     */
    @Test
    public void eliminarVehiculo2() {
        Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");

        RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
        SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);
        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true,
                100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = new Camion("Renol", "2008", "il 23", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false,
                100.000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true,
                13.0, 45.8, 34.8, EnumCombustible.GASOLINA);

        LinkedList<Vehiculo> vehiculos = sistem.getVehiculos();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        adm.eliminarVehiculo(vehiculo1.getMatricula());
        adm.eliminarVehiculo(vehiculo2.getMatricula());
        adm.eliminarVehiculo(vehiculo3.getMatricula());
        imprimir("vehiculos eliminados correctamente");

    }
    /*
     * imprimir
     */
    public void imprimir(String mensaje) {
        System.out.println(mensaje);

    }

}
