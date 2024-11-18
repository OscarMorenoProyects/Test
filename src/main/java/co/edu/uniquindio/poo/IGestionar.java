package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public interface IGestionar {

    public void crearVehiculo(Vehiculo vehiculo);
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
    
    String email, String direccion, String telefono);
    public void eliminarVehiculo(String matricula);
    public void eliminarCliente(String id);
    public  abstract  boolean actualizarCliente(String contraseña,String direccion, String email,String id,String nombre,String nUsuario,String palabraSecreta,String telefono);
    public  abstract void actualizarVehiculo(Vehiculo vehiculo);

}
    

