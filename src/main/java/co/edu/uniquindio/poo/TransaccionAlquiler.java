package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TransaccionAlquiler extends Transaccion {

    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double monto;
    private int dias;

    public TransaccionAlquiler(String codigo, int dias) {
        super(codigo);
        this.monto = calcularMontoAlquiler();
        this.dias = dias;
    }

    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.isDisponible()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaAlquiler(LocalDate.now());
            setFechaAlquiler(LocalDate.now().plusDays(dias));
            vehiculo.setDisponible(false);
            this.monto = calcularMontoAlquiler();

            getSistema().getRegistro().registrarTransaccion(this);
            getEmpleado().getTransacciones().add(this);

            System.out.println("Transacción de alquiler procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
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
