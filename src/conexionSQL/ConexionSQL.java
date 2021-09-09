
package conexionSQL;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionSQL {
    
    Connection conectar = null;
    
    
    public Connection conexion(){
    
        try {
            //Ruta de nuestro conector
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
            
            //Si se conecta mostar mensjae
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexión: "+e.getMessage());
        }
        return conectar;
    }
    
}
