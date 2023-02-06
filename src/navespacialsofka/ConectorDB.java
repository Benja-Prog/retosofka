
package navespacialsofka;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectorDB {
    
    Connection conectar = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/navesofka", "root", "");
            
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
        }
        return conectar;
    }
  
}
