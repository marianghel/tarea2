

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionBD {
    
    Connection con = null;
    String[] arreglo=new String[2];
    public ConexionBD()
    {
     realizarConexion(); 
     
    }
    public void realizarConexion()
    {
        try {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/ejercicio01";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexión Realizada");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } 
    }
   //_______________Estudiantes___________________
    public boolean consultarEstudiantes(String carnet)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto=false;
        try {
                cmd = con.createStatement();
                rs = cmd.executeQuery("SELECT nombre FROM estudiantes where carnet='"+carnet+"'");//envia y espera un resultado
                
                while (rs.next()) 
                {
                    String nombre = rs.getString("nombre");
                     arreglo[0]=carnet;
                     arreglo[1]=nombre;
       
                    System.out.println("Información de la BD: "+nombre); 
                }
                rs.close();
               ejecuto=true;
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());   
        }   
        return ejecuto;
    }
    public boolean agregarEstudiante(String carnet, String nombre){
       ResultSet rs = null;
       Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("INSET INTO estudiantes (carnet,nombre) VALUES (carnet='"+carnet+"',nombre='"+nombre+"')");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }   
    }
    
     public boolean actualizarEstudiante(String carnet, String nombre)
         {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("UPDATE estudiantes SET carnet='"+carnet+"',nombre='"+nombre+"' WHERE carnet='"+carnet+"'");
                
              return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
    }
     
       public boolean eliminarEstudiante(String carnet)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("Delete from estudiantes WHERE carnet='"+carnet+"'");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
        
    }
       
//__________________Curso________________________
  public boolean consultarCurso(String sigla)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto=false;
        try {
                cmd = con.createStatement();
                rs = cmd.executeQuery("SELECT * FROM curso where Sigla='"+sigla+"'");//envia y espera un resultado
                while (rs.next()) 
                {
                    String nombre = rs.getString("nombreCurso");
                    String creditos= rs.getString("creditos");
                    String horario= rs.getString("horario");
                    //int edad = rs.getInt(2);
                 
                    System.out.println("Información de la BD: "+nombre); 
                }
                rs.close();
               ejecuto=true;
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());   
        }   
        return ejecuto;
    }
    public boolean agregarCurso(String sigla, String nombre, int creditos, String horario){
       ResultSet rs = null;
       Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("INSET INTO curso (Sigla,nombreCurso,creditos,horario) VALUES ('"+sigla+"','"+nombre+"','"+creditos+"','"+horario+"')");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }   
    }
    
     public boolean actualizarCurso(String sigla, String nombre, int creditos, String horario )
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("UPDATE curso SET Sigla='"+sigla+"',nombreCurso='"+nombre+"',creditos='"+creditos+"',horario='"+horario+"' WHERE Sigla='"+sigla+"'");
                
              return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
        
    }
     
       public boolean eliminarCurso(String sigla)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("Delete from curso WHERE Sigla='"+sigla+"'");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
    }
       //______________________________matricula_________________
       
    public boolean agregarMatricula(String codigo, String carnet, String sigla){
       ResultSet rs = null;
       Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("INSET INTO matricula (codigo,carnet,sigla) VALUES ('"+codigo+"','"+carnet+"','"+sigla+"')");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }   
    }
    
     public boolean actualizarCurso(String codigo, String nombre, String sigla )
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("UPDATE curso SET codigo'"+codigo+"',nombre='"+nombre+"',sigla='"+sigla+"'");
                
              return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
        
    }
     
       public boolean eliminarMatricula(String codigo)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("Delete from curso WHERE codigo='"+codigo+"'");
                
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
}
}
