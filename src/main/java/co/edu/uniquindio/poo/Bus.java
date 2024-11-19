package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Bus extends VehiculoElectrico {

    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire, numeroSalidasDeEmergencia,
            numeroDeEjes;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneABS;

    public Bus(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double autonomiaCarga,
            double tiempoPromedioCarga, int numeroPasajeros, int numeroPuertas, int capacidadMaletero,
            int numeroBolsasDeAire, int numeroSalidasDeEmergencia, int numeroDeEjes, boolean tieneAireAcondicionado,
            boolean tieneCamaraReversa, boolean tieneABS) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio,
                autonomiaCarga,
                tiempoPromedioCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroSalidasDeEmergencia = numeroSalidasDeEmergencia;
        this.numeroDeEjes = numeroDeEjes;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public int getNumeroSalidasDeEmergencia() {
        return numeroSalidasDeEmergencia;
    }

    public void setNumeroSalidasDeEmergencia(int numeroSalidasDeEmergencia) {
        this.numeroSalidasDeEmergencia = numeroSalidasDeEmergencia;
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

    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

}
