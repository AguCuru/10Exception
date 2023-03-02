
package Principal.persistencia;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;







public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia  = null;
}
