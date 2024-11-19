package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class SistemaConcesionario {
    private String nombre;
    private Administrador administrador;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Cliente> clientes;
    private LinkedList<Empleado> empleados;
    private RegistroTransacciones registro;
    private LinkedList<Reporte> reportes;

    /*
     * Metodo Constructor
     */
    public SistemaConcesionario(String nombre, Administrador administrador, RegistroTransacciones registro) {
        this.nombre = nombre;
        this.administrador = administrador;
        vehiculos = new LinkedList<>();
        clientes = new LinkedList<>();
        empleados = new LinkedList<>();
        reportes = new LinkedList<>();
        this.registro = registro;

        this.administrador.setSistemaConcesionario(this);

    }

/**
 * constrructor
 * @param usuario
 * @param password
 * @return
*/

    public Administrador obtenerAdministradorPorCredenciales(String usuario, String password) {
        if (administrador != null && administrador.getNombreDeUsuario().equals(usuario)
                && administrador.getContraseña().equals(password)) {
            return administrador;
        }
        return null;
    }

    public boolean verificarAdministradorCuenta(String usuario, String password) {
        return administrador != null && administrador.getNombreDeUsuario().equals(usuario)
                && administrador.getContraseña().equals(password);
    }

    public Empleado obtenerEmpleadoPorCredenciales(String usuario, String password) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombreDeUsuario().equals(usuario) && empleado.getContraseña().equals(password)) {
                return empleado;
            }
        }
        return null;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (verificarVehiculo(vehiculo)) {
            throw new VehiculoYaExisteException("Error: El vehículo con matrícula '" + vehiculo.getMatricula() + "' ya existe en el sistema.");
        }
        vehiculos.add(vehiculo); 
        System.out.println("Vehículo con matrícula '" + vehiculo.getMatricula() + "' agregado correctamente.");
    }
   

    
    public boolean verificarVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(vehiculo.getMatricula())) {
                return true; 
            }
        }
        return false; 
    }
    

    public void agregarCliente(Cliente cliente) {
        if (verificarCliente(cliente)) {
            System.out.println("El cliente no se puede agregar porque ya existe");

        } else {
            clientes.add(cliente);
        }
    }

    public boolean verificarCliente(Cliente clienteParam) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(clienteParam.getId())) {
                centinela = true;
                break;

            }

        }
        return centinela;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (verificarEmpleado(empleado)) {
            System.out.println("El cliente no se puede agregar porque ya existe");

        } else {
            empleado.setSistemaConcesionario(this);
            empleados.add(empleado);
            System.out.println("Empleado Agregado");
        }
    }

    public boolean verificarEmpleado(Empleado empleadoParam) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(empleadoParam.getId())) {
                centinela = true;
                break;

            }

        }
        return centinela;
    }

    public boolean verificarEmpleadoCuenta(String nombreUsuario, String contraseña) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombreDeUsuario().equals(nombreUsuario) &&
                    empleado.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public void agregarReporte(Reporte reporte) {
        if (verificarReporte(reporte)) {
            System.out.println("El reporte ya existe en el sistema");

        } else {
            reportes.add(reporte);
            System.out.println("El reporte fue registrado de forma exitosa");
        }

    }

    public boolean verificarReporte(Reporte reporteParam) {
        boolean sentinela = false;
        for (Reporte reporte : reportes) {
            if (reporte.getCodigo().equals(reporteParam.getCodigo())) {
                sentinela = true;
                break;

            }

        }
        return sentinela;

    }

    public LinkedList<Transaccion> obtenerTransaccionesPorEmpleado(Empleado empleado) {
        LinkedList<Transaccion> transaccions = new LinkedList<>();

        for (int i = 0; i < empleado.getTransacciones().size(); i++) {
            transaccions.add(empleado.getTransacciones().get(i));
        }
        return transaccions;
    }

    public LinkedList<Vehiculo> getVehiculosCliente(Cliente clinte){
        LinkedList<Vehiculo> lista = new LinkedList<>();
        for(int i = 0;  i < clinte.getVehiculosPertenecientes().size(); i++){
          lista.add(clinte.getVehiculosPertenecientes().get(i));
        } return lista;
            
     }


     public boolean verificarEm(Empleado empleado) {
        return empleados.stream().anyMatch(e -> e.getId().equals(empleado.getId()));
    }


    /*
     * Metodos Get y Set
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(LinkedList<Reporte> reportes) {
        this.reportes = reportes;
    }

    public RegistroTransacciones getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroTransacciones registro) {
        this.registro = registro;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

}
