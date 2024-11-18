package co.edu.uniquindio.poo;

import java.util.LinkedList;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RegistroTransacciones {
    private String fecha;
    private LinkedList<Transaccion> transacciones;
    private Set<String> codigosTransacciones; // Para optimizar la búsqueda de códigos duplicados

    /*
     * Metodo constructor
     */
    public RegistroTransacciones(String fecha) {
        this.fecha = fecha;
        transacciones = new LinkedList<>();
        codigosTransacciones = new HashSet<>();
    }

    /*
     * Metodos principales
     */

    public void registrarTransaccion(Transaccion transaccion){
        if(codigosTransacciones.contains(transaccion.getCodigo())){
            System.out.println("No se puede registrar la transaccion: Código duplicado");
        } else {
            transacciones.add(transaccion);
            codigosTransacciones.add(transaccion.getCodigo()); // Agregar el código al Set
            System.out.println("La transacción fue registrada de forma exitosa");
        }
    }

    public boolean verificarTransaccion(Transaccion transaccion){
        return codigosTransacciones.contains(transaccion.getCodigo()); // Verificación rápida usando el Set
    }

    /*
     * Métodos Get y Set
     */

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
