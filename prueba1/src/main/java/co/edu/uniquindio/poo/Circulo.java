package co.edu.uniquindio.poo;

public class Circulo extends Figura {
    public double radio;

    /**
     * Este es el metodo constructor de la clase circulo
     * @param radio
     */
    public Circulo(double radio){
        assert radio > 0;
        this.radio=radio;
    }

    /**
     * Metodo para calcular el area de un circulo
     * @return area
     */
    @Override
    public double calcularArea() {
        double area=Math.PI*(radio*radio);
        return area;
    }

    
    /**
     * Método para obtener el valor del radio del círculo
     * @return valor del radio del círculo
     */
    public double getRadio() {
        return radio;
    }

}
