package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Sedan extends VehiculoElectrico{
    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneVelocidadCrucero, tieneABS, tieneSensoresColision, tieneSensorTrafico, tieneAsistentePermaneciaCarril;
    
   

    public Sedan(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double autonomiaCarga,
            double tiempoPromedioCarga, int numeroPasajeros, int numeroPuertas, int capacidadMaletero,
            int numeroBolsasDeAire, boolean tieneAireAcondicionado, boolean tieneCamaraReversa,
            boolean tieneVelocidadCrucero, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensorTrafico,
            boolean tieneAsistentePermaneciaCarril) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio, autonomiaCarga,
                tiempoPromedioCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneABS = tieneABS;
        this.tieneSensoresColision = tieneSensoresColision;
        this.tieneSensorTrafico = tieneSensorTrafico;
        this.tieneAsistentePermaneciaCarril = tieneAsistentePermaneciaCarril;
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

    public boolean isTieneSensoresColision() {
        return tieneSensoresColision;
    }

    public void setTieneSensoresColision(boolean tieneSensoresColision) {
        this.tieneSensoresColision = tieneSensoresColision;
    }

    public boolean isTieneSensorTrafico() {
        return tieneSensorTrafico;
    }

    public void setTieneSensorTrafico(boolean tieneSensorTrafico) {
        this.tieneSensorTrafico = tieneSensorTrafico;
    }

    public boolean isTieneAsistentePermaneciaCarril() {
        return tieneAsistentePermaneciaCarril;
    }

    public void setTieneAsistentePermaneciaCarril(boolean tieneAsistentePermaneciaCarril) {
        this.tieneAsistentePermaneciaCarril = tieneAsistentePermaneciaCarril;
    } 

    
    
}
