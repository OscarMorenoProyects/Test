package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 * 
 * 
 * 
 * 
 * 
 */
public class PickUp extends VehiculoHibrido {

    private int numeroPasajeros, numeroPuertas, numeroBolsasDeAire, capacidadCajaDeCarga;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneVelocidadCrucero, tieneABS, es4X4;
    
   

    public PickUp(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, boolean esEnchufable, boolean esLigero,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasDeAire, int capacidadCajaDeCarga,
            boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneVelocidadCrucero, boolean tieneABS,
            boolean es4x4) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio, esEnchufable,
                esLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneABS = tieneABS;
        es4X4 = es4x4;
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

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public int getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(int capacidadCajaDeCarga) {
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
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

    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public boolean isEs4X4() {
        return es4X4;
    }

    public void setEs4X4(boolean es4x4) {
        es4X4 = es4x4;
    }

    
    
}
