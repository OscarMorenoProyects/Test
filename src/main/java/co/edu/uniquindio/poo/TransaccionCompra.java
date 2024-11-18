package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TransaccionCompra extends Transaccion {

    private LocalDate fechaCompra;
    private double monto;

    public TransaccionCompra(String codigo) {
        super(codigo);
        this.monto = calcularMontoCompra();
    }

    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.pasaRevisionTecnica()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaCompra(LocalDate.now());
            vehiculo.setDisponible(false);
            this.monto = calcularMontoCompra();

            cliente.vehiculoAdquirido(vehiculo);
            sistema.getRegistro().registrarTransaccion(this);
            empleado.getTransacciones().add(this);

            System.out.println("Transacción de compra procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no pasó la revisión técnica y no se puede comprar.");
        }
    }



    public String getTipo() {
        return getClass().getSimpleName();
    }

    private double calcularMontoCompra() {

        return 20000.0;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


}
