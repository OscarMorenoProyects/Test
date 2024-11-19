package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Empleado extends Persona implements IGestionar {
    private SistemaConcesionario sistemaConcesionario;
    private String puesto;
    private String telefono;
    private LinkedList<Transaccion> transacciones;

    public Empleado(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String puesto, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.puesto = puesto;
        this.telefono = telefono;
        transacciones = new LinkedList<>();
    }



    
    @Override
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String direccion, String telefono) {

        Cliente nuevoCliente = new Cliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion,
                telefono);

        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }

    public void actualizarCliente(Cliente cliente) {
        for (Cliente c : sistemaConcesionario.getClientes()) {
            if (c.getId().equals(cliente.getId())) {
                c.setNombre(cliente.getNombre());
                c.setDireccion(cliente.getDireccion());
                c.setEmail(cliente.getEmail());
                c.setTelefono(cliente.getTelefono());
                System.out.println("Cliente actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    @Override
    public void crearVehiculo(Vehiculo vehiculo) {

        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }

    @Override
    public void eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : sistemaConcesionario.getVehiculos()) {
            if (vehiculo.getMatricula().equals(matricula)) {
                sistemaConcesionario.getVehiculos().remove(vehiculo);
                System.out.println("Vehículo Eliminado exitosamente");
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    @Override
    public void eliminarCliente(String id) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId().equals(id)) {
                sistemaConcesionario.getClientes().remove(cliente);
                System.out.println("Cliente Eliminado exitosamente");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    @Override
    public boolean actualizarCliente(String contraseña, String direccion, String email, String id, String nombre,
            String nUsuario, String palabraSecreta, String telefono) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarCliente'");
    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarVehiculo'");
    }

    public void eliminarTransaccion(Transaccion transaccion){
        
    }

}
