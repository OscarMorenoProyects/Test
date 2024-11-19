package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Reporte {
    private LocalDate fechaDeReporte;
    private Empleado empleado;
    private LinkedList<Transaccion> transacciones;
    private String codigo;

    private int totalVentas;
    private int totalAlquileres;
    private int totalCompras;
    private double montoTotal;

    public Reporte(String codigo, Empleado empleado) {
        this.codigo = codigo;
        this.fechaDeReporte = LocalDate.now();
        this.empleado = empleado;
        transacciones = empleado.getTransacciones();
        calcularValores();


    }

    public void calcularValores() {
        for (Transaccion transaccion : transacciones) {
            actualizarTotales(transaccion);
            
        }
        System.out.println(generarResumen());
    }

    private void actualizarTotales(Transaccion transaccion) {
        switch (transaccion.getTipo()) {
            case "TransaccionVenta":
                totalVentas++;
                break;
            case "TransaccionAlquiler":
                totalAlquileres++;
                break;
            case "TransaccionCompra":
                totalCompras++;
                break;
        }
        montoTotal += transaccion.getMonto();
    }

    public String generarResumen() {
        return "Resumen del Reporte:\n" +
                "Total Ventas: " + totalVentas + "\n" +
                "Total Alquileres: " + totalAlquileres + "\n" +
                "Total Compras: " + totalCompras + "\n" +
                "Monto Total: $" + montoTotal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaDeReporte() {
        return fechaDeReporte;
    }

    public void setFechaDeReporte(LocalDate fechaDeReporte) {
        this.fechaDeReporte = fechaDeReporte;
    }

}
