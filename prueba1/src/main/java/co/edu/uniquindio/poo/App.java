package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static final double PRECISION = 0.05;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void dividir(int num1, int num2){
        if (num2==0) {
            throw new ArithmeticException("no se puede dividir entre 0");
        }
    
    }
    public void ingresarOperacion(char opc){ 
        if (opc != '+' && opc != '-' && opc != 'x' && opc != '/') {
            throw new ArithmeticException("No se puede realizar esta operación");
        }
    }

    public double calcularCosto(int contDias,double saldo){
        double mensual=contDias*saldo;
        return mensual;
     }


}




