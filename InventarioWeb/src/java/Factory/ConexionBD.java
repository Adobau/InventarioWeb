package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConexionBD {
  protected String[] parametros; //Array que recibe los parametros de conexión
  protected Connection conexion;
  //El siguiente método abstracto no se implementa solamente se declara , se 
  //implementa en la subclase
  abstract Connection open(); // Método abstracto que devulve un objeto connection


//Crear método para las consultas
public ResultSet cosultaSQL(String consulta){
Statement st; //Objeto Statement en el encargado de ejecutar las consultas
ResultSet rs = null; //Tabla temporal donde se almacenan los datos
try{
  st = conexion.createStatement();
  rs = st.executeQuery(consulta); // Se ejecuta la consulta
}catch(SQLException ex){
      ex.printStackTrace();
}
return rs;
}
}
