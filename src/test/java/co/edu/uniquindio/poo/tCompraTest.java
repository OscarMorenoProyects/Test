package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;



public class tCompraTest {

    /**
     * test para procesar transacciom
     */
     @Test
    public void procesarTransaccion(){
        
        TCompra compra=new  TCompra("1089M");
        Administrador adm=new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");
        Cliente cliente=new Cliente("andres", "10885898567", "andre", "andre.9", "unico", "andres@", "cra5", "3117765");
        RegistroTransacciones registro=new RegistroTransacciones("18/11/2023");
        Vehiculo vehiculo1=new Camion("chevrolet", "2005", "fgh 23", 4, 45.7, 400.5, EnumTransmision.MANUAL, true, 100.000, false, true, 45, 8, true, true, true, EnumTipoCamion.CARGAPESADA);
        Vehiculo vehiculo2=new Camion("Renol", "2008", "il 23", 4, 45.7, 400.5, EnumTransmision.AUTOMATICA, false, 100.000, false, true, 50, 8, true, true, true, EnumTipoCamion.CARGALIGERA);
        Vehiculo vehiculo3=new Moto("Susuki", "2003", "tre 3004", 5, 45.5, 108.7, EnumTransmision.AUTOMATICA, true, 13.0, 45.8, 34.8, EnumCombustible.GASOLINA);
        Empleado emp=new Empleado("juan", "345678", "uJuan", "17899", "guion", "juan@", "6", "3117756359");

        SistemaConcesionario sistem=new SistemaConcesionario("Twing", adm, registro);
        compra.procesar(sistem, cliente, vehiculo3, emp);
        imprimir("transaccion en proceso");

    }


/*
 * metodo para imprimir
 */
    public void imprimir(String mensaje){
        System.out.println(mensaje);
   }
}
