
package Controladores;

import Clases.ClsVotante;
import Modelos.MdlVotante;

/**
 *
 * @author sergio.urbina
 */
public class CtlVotante {
    MdlVotante modelo; 

    public CtlVotante() {
        this.modelo = new MdlVotante();
        
    }
    
    public boolean agregarCandidato(ClsVotante votante){
    
    return this.modelo.agregarVotante(votante);
    }

    public void agregarVotante(ClsVotante votante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
