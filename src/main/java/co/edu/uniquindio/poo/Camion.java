package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Camion extends VehiculoHibrido{

    private int capacidadDeCarga, numeroDeEjes;
    private boolean tieneAireAcondicionado, tieneFrenosDeAire, tieneABS;
    private Enum<EnumTipoCamion> tipoCamion;
    
  

    public Camion(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, boolean esEnchufable, boolean esLigero,
            int capacidadDeCarga, int numeroDeEjes, boolean tieneAireAcondicionado, boolean tieneFrenosDeAire,
            boolean tieneABS, Enum<EnumTipoCamion> tipoCamion) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio, esEnchufable,
                esLigero);
        this.capacidadDeCarga = capacidadDeCarga;
        this.numeroDeEjes = numeroDeEjes;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosDeAire = tieneFrenosDeAire;
        this.tieneABS = tieneABS;
        this.tipoCamion = tipoCamion;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneFrenosDeAire() {
        return tieneFrenosDeAire;
    }

    public void setTieneFrenosDeAire(boolean tieneFrenosDeAire) {
        this.tieneFrenosDeAire = tieneFrenosDeAire;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public Enum<EnumTipoCamion> getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(Enum<EnumTipoCamion> tipoCamion) {
        this.tipoCamion = tipoCamion;
    }


    
}
