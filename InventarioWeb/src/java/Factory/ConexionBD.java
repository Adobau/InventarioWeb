package Factory;

import java.sql.Connection;

public abstract class ConexionBD {
  protected String[] parametros; //Array que recibe los parametros de conexión
  protected Connection conexion;
  //El siguiente método abstracto no se implementa solamente se declara , se 
  //implementa en la subclase
  abstract Connection open(); // Método abstracto que devulve un objeto connection
}
