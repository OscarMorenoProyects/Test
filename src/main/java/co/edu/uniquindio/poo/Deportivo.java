package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Deportivo extends VehiculoHibrido {
    private int numeroPasajeros, numeroPuertas, numeroBolsasDeAire;
    private double numeroCaballosDeFuerza, tiempoPara100kmh;
    private String datos;

 

    public Deportivo(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, boolean esEnchufable, boolean esLigero,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasDeAire, double numeroCaballosDeFuerza,
            double tiempoPara100kmh, String datos) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio, esEnchufable,
                esLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
        this.tiempoPara100kmh = tiempoPara100kmh;
        this.datos = datos;
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

    public double getNumeroCaballosDeFuerza() {
        return numeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(double numeroCaballosDeFuerza) {
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getTiempoPara100kmh() {
        return tiempoPara100kmh;
    }

    public void setTiempoPara100kmh(double tiempoPara100kmh) {
        this.tiempoPara100kmh = tiempoPara100kmh;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

}
