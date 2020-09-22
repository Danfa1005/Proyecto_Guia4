package Programa_Ahorro;

//Importaciones
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class Archivo_Ahorro {
    
   public static void main(String[] args) throws SQLException {
       
       //Crear archivo y tabla para la base de datos
       String archivo = "jdbc:h2:./ahorro";
       
       ConnectionSource conn = new JdbcConnectionSource(archivo); 
       
       TableUtils.createTableIfNotExists(conn, Ahorro.class);

   } //Fin de main 
   
} //Fin de Archivo_Ahorro
