package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public abstract class VehiculoElectrico extends Vehiculo  {
    private double autonomiaCarga;
    private double tiempoPromedioCarga;

    /*
     * Metodo Constructor
     */
    public VehiculoElectrico(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double autonomiaCarga,
            double tiempoPromedioCarga) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio);
        this.autonomiaCarga = autonomiaCarga;
        this.tiempoPromedioCarga = tiempoPromedioCarga;
    }

    /*
     * Metodos Get y Set
     */

    public double getAutonomiaCarga() {
        return autonomiaCarga;
    }

    public void setAutonomiaCarga(double autonomiaCarga) {
        this.autonomiaCarga = autonomiaCarga;
    }

    public double getTiempoPromedioCarga() {
        return tiempoPromedioCarga;
    }

    public void setTiempoPromedioCarga(double tiempoPromedioCarga) {
        this.tiempoPromedioCarga = tiempoPromedioCarga;
    }

}
