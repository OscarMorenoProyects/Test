package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class sistemaConcesionarioTest {
    private static final Logger LOG = Logger.getLogger(sistemaConcesionarioTest.class.getName());
/*
 * test para obtener administrador por credenciales
 */
@Test
public void obtenerAdministradorPorCredencialesdatosCompletos(){
    LOG.info("inicializando test obtenerAdministrador datosCompletos");

    RegistroTransacciones registro =new RegistroTransacciones("18/11/2025");
    Administrador adm=new Administrador("andres", "108858", "uAndres", "1876pass", "kio", "andre@gmail.co", "31563667");
    SistemaConcesionario sistema=new SistemaConcesionario("concesionary", adm, registro);
    LinkedList<Administrador>administradoresAutorizados=new LinkedList<>();
    Administrador admi=sistema.obtenerAdministradorPorCredenciales(adm.getNombreDeUsuario(), adm.getContraseña());
    administradoresAutorizados.add(admi);
    imprimir("el administrativo por credenciales autorizado es"+administradoresAutorizados.toString());

    LOG.info("finalizando test obtenerAdministradorDatosCompletos");
}

/*test para agregar vehiculos datosCompletos */
@Test
public void AgregarVehiculoDatosCompletos(){
    Administrador adm=new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");
    RegistroTransacciones registro=new RegistroTransacciones("18/11/2023");
    SistemaConcesionario sistem=new SistemaConcesionario("Twing", adm, registro);
    Vehiculo vehiculo1=new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
    Vehiculo vehiculo2=new Camion("Renol", "2008", "il 23", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100.000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
    Vehiculo vehiculo3=new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13.0, 45.8, 34.8, EnumCombustible.GASOLINA);
    LinkedList <Vehiculo>vehiculos=sistem.getVehiculos();

    vehiculos.add(vehiculo1);
    vehiculos.add(vehiculo2);
    vehiculos.add(vehiculo3);
    imprimir("vehiculo agregado correctamente");

}

/*
 * vehiculo con la placa duplicada 
 * se implemento en agregarVehiculo una modificacion para arobarPrueba
 */

@Test
public void verificarVehiculoYaExiste() {
    Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inicio", "admi@", "3145");
    RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
    SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);

    Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
    Vehiculo vehiculo2 = new Camion("Renol", "2008", "fgh 23", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100.000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
    Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13.0, 45.8, 34.8, EnumCombustible.GASOLINA);

    
    sistem.agregarVehiculo(vehiculo1);
    sistem.agregarVehiculo(vehiculo3);
    sistem.agregarVehiculo(vehiculo2); 
}

/**
 * metodo agregar vehiculo que lanza una
 * exepcion cuando trata de ingresar otro vehiculo con 
 * placa repetida 
 */
@Test
public void agregarVehiculos() {

    Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inicio", "admi@", "3145");
    RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
    SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);

    try {
        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = new Camion("Renol", "2008", "ntv 30", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13000, 45.8, 34.8, EnumCombustible.GASOLINA);
        Vehiculo vehiculo4 = new Camion("mazda", "1999", "fgh 23", 4, 67.7, 400.5, EnumTransmision.AUTOMATICA, true, 100000, true, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);

        sistem.agregarVehiculo(vehiculo1);
        sistem.agregarVehiculo(vehiculo2);
        sistem.agregarVehiculo(vehiculo3);
        sistem.agregarVehiculo(vehiculo4); 

    } catch (VehiculoYaExisteException existe) {
        System.out.println(existe.getMessage());
    }
}

/**
 * metodo para agrgegarCliente con exeption
 */
@Test
public void agragarCliente(){

    Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inicio", "admi@", "3145");
    RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
    SistemaConcesionario sistem = new SistemaConcesionario("Twing", adm, registro);

    try {
        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = new Camion("Renol", "2008", "ntv 30", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13000, 45.8, 34.8, EnumCombustible.GASOLINA);
        Vehiculo vehiculo4 = new Camion("mazda", "1999", "fgh 23", 4, 67.7, 400.5, EnumTransmision.AUTOMATICA, true, 100000, true, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);

        sistem.agregarVehiculo(vehiculo1);
        sistem.agregarVehiculo(vehiculo2);
        sistem.agregarVehiculo(vehiculo3);
        sistem.agregarVehiculo(vehiculo4); 

    } catch (VehiculoYaExisteException existe) {
        System.out.println(existe.getMessage());
    }


}

/*
 * metodo para agregarEmpleado con exeption
 */

@Test
public void agregarEmpleado(){

    Administrador adm = new Administrador("jose", "34678", "jose@", "567gh", "inicio", "admi@", "3145");
    RegistroTransacciones registro = new RegistroTransacciones("18/11/2023");
    SistemaConcesionario sistem = new SistemaConcesionario("LPS", adm, registro);

    try {
        Vehiculo vehiculo1 = new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2 = new Camion("Renol", "2008", "ntv 30", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3 = new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13000, 45.8, 34.8, EnumCombustible.GASOLINA);
        Vehiculo vehiculo4 = new Camion("mazda", "1999", "fgh 23", 4, 67.7, 400.5, EnumTransmision.AUTOMATICA, true, 100000, true, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);

        sistem.agregarVehiculo(vehiculo1);
        sistem.agregarVehiculo(vehiculo2);
        sistem.agregarVehiculo(vehiculo3);
        sistem.agregarVehiculo(vehiculo4); 

    } catch (VehiculoYaExisteException existe) {
        System.out.println(existe.getMessage());
    }
}






















public void imprimir(String mensaje) {
    System.out.println(mensaje);
}
}
