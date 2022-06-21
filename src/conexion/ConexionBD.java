/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    //MySQL
    private final String usuario = "root";
    private final String password = "";
    private final String host = "127.0.0.1";
    private Connection con=null;
    
    public Connection getConexion()
    {
        getConexionMsql();
        return con;
    }

    private Connection getConexionMsql() {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
           String servidor="jdbc:mysql://127.0.0.1/taller2?useUnicode=true&"
                   + "useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
           con=DriverManager.getConnection(servidor,usuario,password);
       }catch(ClassNotFoundException|
               IllegalAccessException|
               InstantiationException|
               SQLException e){
           e.printStackTrace();
       }
       return con;
    }
    public void closeDB()throws SQLException{
        this.con.close();
    }

    public static void main(String[] args) {
        ConexionBD conectbd =new ConexionBD();
        String consult="SELECT * FROM `usuarios`";
        try {
            ResultSet  result=conectbd.getConexion()
                    .prepareStatement(consult).
                    executeQuery();
        if(result.next()){
                System.out.println("DNI: "+result.getString(1));
                System.out.println("NAME: "+result.getString(2));
                System.out.println("NICKNAME: "+result.getString(3));
                System.out.println("PASSWORD: "+result.getString(4));                
                System.out.println("CELLPHONE: "+result.getString(5));
                System.out.println("ADDRESS: "+result.getString(6));
                
                while(result.next()){
                System.out.println("DNI: "+result.getString(1));
                System.out.println("NAME: "+result.getString(2));
                System.out.println("NICKNAME: "+result.getString(3));
                System.out.println("PASSWORD: "+result.getString(4));                
                System.out.println("CELLPHONE: "+result.getString(5));
                System.out.println("ADDRESS: "+result.getString(6));
                }//fin while
            }else{
                System.out.println("Date no Found in Data Base");
            }//fin if/else
        } catch (SQLException e) {
            System.out.println("Exception: "+e.getMessage());
        }finally
        {
            try {
                conectbd.closeDB();
            } catch (SQLException e) {
                 System.out.println("Exception: "+e.getMessage());
            }
        }
    }


}
