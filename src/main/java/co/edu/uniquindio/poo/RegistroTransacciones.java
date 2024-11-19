package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class RegistroTransacciones {
    private String fecha;
    private LinkedList<Transaccion> transacciones;
    
    /*
     * Metodo constructor
     */
    public RegistroTransacciones(String fecha) {
        this.fecha = fecha;
        transacciones = new LinkedList<>();

    }

    /*
     * Metodos principales
     */

    public void registrarTransaccion(Transaccion transaccion){
        if(verificarTransaccion(transaccion)){
            System.out.println("No se puede registrar la transaccion");

        } else{
            transacciones.add(transaccion);
            System.out.println("La transacción fue registrada de forma exitosa");
        }

    }

    public boolean verificarTransaccion(Transaccion transaccion ){
        boolean sentinela = false;
        for (Transaccion transaccionIterar : transacciones) {
            if(transaccionIterar.getCodigo().equals(transaccion.getCodigo())){
                sentinela = true;
                break;
            }
            
        } return sentinela;

    }

    public boolean eliminarTransaccion(String codigo){
        boolean sentinela = false;
        for (Transaccion transaccion : transacciones) {
            if(transaccion.getCodigo().equals(codigo)){
                transacciones.remove(transaccion);
                return sentinela = true;
            }
            
        } return sentinela; 
    }

    /*
     * Metodos Get  y Set
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
