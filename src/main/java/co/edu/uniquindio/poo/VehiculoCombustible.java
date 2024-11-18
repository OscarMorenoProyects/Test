package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public abstract class VehiculoCombustible extends Vehiculo {
    private double capacidadCombustible;
    private double consumoPorKm;
    private Enum<EnumCombustible> tipoCombustible;

    
    /*
     * Metodo Constructor
     */
    public VehiculoCombustible(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double capacidadCombustible,
            double consumoPorKm, Enum<EnumCombustible> tipoCombustible) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio);
        this.capacidadCombustible = capacidadCombustible;
        this.consumoPorKm = consumoPorKm;
        this.tipoCombustible = tipoCombustible;
    }

    /*
     * Metodo Get y Set
     */
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }


    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }


    public double getConsumoPorKm() {
        return consumoPorKm;
    }


    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }


    public Enum<EnumCombustible> getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(Enum<EnumCombustible> tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    } 

    

    
}
