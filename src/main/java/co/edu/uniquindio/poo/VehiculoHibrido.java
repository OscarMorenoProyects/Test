package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public abstract class VehiculoHibrido extends Vehiculo {
    private boolean esEnchufable;
    private boolean esLigero;
    
    /*
     * Constructor
     */
    public VehiculoHibrido(String marca, String modelo, String matricula, int cambios, double velocidadMaxima,
            double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, boolean esEnchufable, boolean esLigero) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio);
        this.esEnchufable = esEnchufable;
        this.esLigero = esLigero;
    }
    
    /*
     * Metodos Get y Set
     */
    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    public boolean isEsLigero() {
        return esLigero;
    }

    public void setEsLigero(boolean esLigero) {
        this.esLigero = esLigero;
    }

}
