package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TransaccionVenta extends Transaccion {

    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaVenta;
    private double monto;
    private SistemaConcesionario sistema;

    

    public TransaccionVenta(String codigo) {
        super(codigo);
        this.monto = calcularMontoVenta();

    }

    /**
     * Processes a vehicle sale transaction by updating the sale date, client,
     * employee, and vehicle details.
     * Marks the vehicle as unavailable and calculates the sale amount. Registers
     * the transaction in the system
     * and adds it to the employee's transaction list. Outputs a success message if
     * the vehicle is available,
     * otherwise indicates the vehicle is not available for sale.
     *
     * @param cliente  the client involved in the transaction
     * @param vehiculo the vehicle being sold
     * @param empleado the employee handling the transaction
     */
    @Override
    public void procesar(SistemaConcesionario sitema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sitema);
        if (vehiculo.isDisponible()) {
            setFechaVenta(LocalDate.now());
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            vehiculo.setDisponible(true);
            this.monto = calcularMontoVenta();

            this.sistema.agregarVehiculo(vehiculo);
            this.sistema.getRegistro().registrarTransaccion(this);
            this.empleado.getTransacciones().add(this);

            System.out.println("Transacción de venta procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para la venta.");
        }
    }

    @Override
    public String toString() {
        return "TransaccionVenta [codigo=" + codigo + ", cliente=" + cliente + ", empleado=" + empleado + ", vehiculo="
                + vehiculo + ", fechaVenta=" + fechaVenta + ", monto=" + monto + ", sistema=" + sistema + "]";
    }

    private double calcularMontoVenta() {

        return 25000.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public SistemaConcesionario getSistema() {
        return sistema;
    }

    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Transaccion geTransaccion(){
        return this;
    }

    @Override
    protected String getTipo() {
        return getClass().getSimpleName();
    }


    

}
