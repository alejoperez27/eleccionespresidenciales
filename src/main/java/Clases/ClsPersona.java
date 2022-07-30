
package Clases;

/**
 *
 * @author sergio.urbina
 */
public class ClsPersona {
    
    private String numeroDocumeto;
    private String nombre;
    private String telefono;
    private String correo;

    public ClsPersona(String numeroDocumeto, String nombre, String telefono, String correo) {
        this.numeroDocumeto = numeroDocumeto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNumeroDocumeto() {
        return numeroDocumeto;
    }

    public void setNumeroDocumeto(String numeroDocumeto) {
        this.numeroDocumeto = numeroDocumeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
}
