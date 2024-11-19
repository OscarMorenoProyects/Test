package co.edu.uniquindio.poo;
import java.util.LinkedList;

/**
 * 
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */

public class Administrador extends Persona implements IGestionar {
    private String telefono;
    private SistemaConcesionario sistemaConcesionario;


    

    public Administrador(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.telefono = telefono;
    }

    @Override
    public void eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : sistemaConcesionario.getVehiculos()) {
            if (vehiculo.getMatricula().equals(matricula)) {
                sistemaConcesionario.getVehiculos().remove(vehiculo);
                System.out.println("Vehículo Eliminado exitosamente");
                return;
            }else{
                System.out.println("vehiculo no encontrado---");
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    /**
     * Elimina un cliente del sistema del concesionario basado en su identificador
     * único.
     *
     * @param id El identificador único del cliente a eliminar.
     */
    @Override
    public void eliminarCliente(String id) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId().equals(id)) {
                sistemaConcesionario.getClientes().remove(cliente);
                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    /**
     * Crea un nuevo cliente y lo añade al sistema del concesionario.
     *
     * @param nombre          El nombre del cliente.
     * @param id              El identificador único del cliente.
     * @param nombreDeUsuario El nombre de usuario del cliente.
     * @param contraseña      La contraseña del cliente.
     * @param palabraSecreta  La palabra secreta del cliente para recuperación de
     *                        cuenta.
     * @param email           El correo electrónico del cliente.
     * @param direccion       La dirección del cliente.
     * @param telefono        El número de teléfono del cliente.
     */
    @Override
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String direccion, String telefono) {
        Cliente nuevoCliente = new Cliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion,
                telefono);
        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }

    /**
     * Crea y añade un vehículo al sistema del concesionario.
     *
     * @param tipoVehiculo El tipo de vehículo a crear.
     * @param vehiculo     El objeto Vehiculo que se va a añadir.
     */
    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }

    public void crearReporte(Empleado empleado) {
        // Generar un código único para el reporte
        String codigo = "REP-" + (sistemaConcesionario.getReportes().size() + 1);

        Reporte nuevoReporte = new Reporte(codigo, empleado);

        sistemaConcesionario.getReportes().add(nuevoReporte);

        System.out.println("Reporte creado exitosamente:" + nuevoReporte.generarResumen());
    }


    
    public void eliminarTransaccion(String code) {
        Administrador adm=new Administrador("jose", "34678", "jose@", "567gh", "inico", "admi@", "3145");
        
        RegistroTransacciones registro=new RegistroTransacciones("18/11/2023");
        SistemaConcesionario sistem=new SistemaConcesionario("Twing", adm, registro);
        LinkedList<Transaccion>transferencias=registro.getTransacciones();
        for (Transaccion pago :registro.getTransacciones() ) {
            if (code.equals(pago.getCodigo())) {
                transferencias.remove(pago);
                imprimir("la transaccion fue eliminada con exito");
            }
        }
       
    }

    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }


    public void eliminarEmpleado(Empleado empleado) {
        for (Empleado iEmpleado : sistemaConcesionario.getEmpleados()) {
            if (iEmpleado.getId().equals(empleado.getId())) {
                sistemaConcesionario.getEmpleados().remove(empleado);
                System.out.println("Empleado eliminado");
                return;
            }

        }  System.out.println("El empleado no pudo ser eliminado");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }



    @Override
    public boolean actualizarCliente(String contraseña,String direccion, String email,String id,String nombre,String nUsuario,String palabraSecreta,String telefono) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId() == id) {
               cliente.setContraseña(contraseña);
               cliente.setDireccion(direccion);
               cliente.setEmail(email);
               cliente.setId(id);
               cliente.setNombre(nombre);
               cliente.setNombreDeUsuario(nUsuario);
               cliente.setPalabraSecreta(palabraSecreta);
               cliente.setTelefono(telefono);
               System.out.println("usuario actualizado correctamente");
                return true;
           
        }
        System.out.println(" usuario no encontrado");
    }
    return false;

    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {
       System.out.println("actualizando cambios");
    }

    @Override
    public String toString() {
        return "Administrador [telefono=" + telefono + ", sistemaConcesionario=" + sistemaConcesionario
                + ", getNombre()=" + getNombre() + ", getId()=" + getId() + ", getNombreDeUsuario()="
                + getNombreDeUsuario() + ", getEmail()=" + getEmail() + ", getTelefono()=" + getTelefono() + "]";
    }
}
