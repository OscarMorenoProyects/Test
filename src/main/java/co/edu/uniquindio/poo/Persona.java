package co.edu.uniquindio.poo;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public abstract class Persona {
    private String nombre;
    private String id;
    private String nombreDeUsuario;
    private String contraseña;
    private String palabraSecreta;
    private String email;
    
    public Persona(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email) {
        this.nombre = nombre;
        this.id = id;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.palabraSecreta = palabraSecreta;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getPalabraSecreta() {
        return palabraSecreta;
    }
    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    

    
    
}
