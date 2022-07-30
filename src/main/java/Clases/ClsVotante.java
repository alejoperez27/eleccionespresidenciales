
package Clases;

import java.util.LinkedList;

/**
 *
 * @author sergio.urbina
 */
public class ClsVotante extends ClsPersona{
    
    private String TipoDocumento;
    private String CiudadResidencia;

    public ClsVotante(String TipoDocumento, String CiudadResidencia, String numeroDocumeto, String nombre, String telefono, String correo) {
        super(numeroDocumeto, nombre, telefono, correo);
        this.TipoDocumento = TipoDocumento;
        this.CiudadResidencia = CiudadResidencia;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getCiudadResidencia() {
        return CiudadResidencia;
    }

    public void setCiudadResidencia(String CiudadResidencia) {
        this.CiudadResidencia = CiudadResidencia;
    }

 
   
    }
