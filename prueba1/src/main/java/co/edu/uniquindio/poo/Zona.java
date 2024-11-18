package co.edu.uniquindio.poo;

public class Zona {
    private String nombre;
    public Material material;
    private Figura figura;

    public Zona(String nombre, Material material,Figura figura) {
        this.nombre = nombre;
        this.material = material;
        this.figura=figura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

  
    /**
     * Metodo que permite calcular el costo de una figura por area
     * @return
     */
    public double calcularCosto(){
        return figura.calcularArea()*material.getValorMetroCuadrado();
    }



    
}
