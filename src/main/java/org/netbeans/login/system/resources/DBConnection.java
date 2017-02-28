package org.netbeans.login.system.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Neeraj
 */
public class DBConnection {
   static String URL=null;
   static String UserName=null;
   static String password=null;
   Connection con =null;

    public DBConnection() {
        
    }

    public static Connection getCon() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        
            Properties prop=new Properties();
            FileInputStream fis=new FileInputStream(System.getProperty("/dbinfo.properties"));
            prop.load(fis);
            
            String drivers=prop.getProperty("Postgres_driver");
            URL=prop.getProperty("URL");
            UserName=prop.getProperty("UserName");
            password=prop.getProperty("password");
            Class.forName(drivers);
            
            Connection con=DriverManager.getConnection(URL, UserName, password);
            System.out.println("Connected to DB");
            
            
                    
            fis.close();
       
        return con;
        
    }
   
   
   /* 
    public static void Connection(){
    
        try{
        
             DriverManager.getConnection(URL, UserName, UserName)
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        finally(){
        
        }
    }*/

}
