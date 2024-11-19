package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TAlquiler extends Transaccion {

    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double monto;
    private int dias;

    public TAlquiler(String codigo, int dias) {
        super(codigo);
        this.monto = calcularMontoAlquiler();
        this.dias = dias;
    }

    @Override
    public void procesar(SistemaConcesionario sistem, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        if (!sistem.verificarEmpleado(empleado)) {
            throw new EmpleadoNoRegistradoException(
                "Error: El empleado con ID '" + empleado.getId() + "' no está registrado en el sistema.");
        }
    
        // Lógica de procesamiento de la transacción
        System.out.println("Transacción procesada exitosamente.");
    }

    private double calcularMontoAlquiler() {
        return 100.0;
    }

    public String getTipo() {
        return getClass().getSimpleName();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Transaccion geTransaccion() {
        return this;
    }

}
