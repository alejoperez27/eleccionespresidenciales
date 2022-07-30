
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sergio.urbina
 */
public class ClsJdbc {
    
    String driver ="com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String password = "";
    String bd = "bd_elecciones";
    String puerto = "3306";
    String url = "jdbc:mysql://localhost:" + puerto + "/" + bd;
    Connection enlace;

public void CrearConexion(){
    
    try {
     
        Class.forName(driver);
        this.enlace = DriverManager.getConnection(url, usuario, password);
        if (enlace != null){
            System.out.println("conexion exitosa");
        }
        
    } catch (Exception e) {
        System.out.println(":X proceso de conexio fallido" + e.getMessage() );
    }
 
 
 
 }
}
