package org.netbeans.login.system.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import org.netbeans.login.system.resources.DBConnection;

/**
 *
 * @author Neeraj
 */
public class SaveNewUser {
    
    
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        new DBConnection().getCon();
        System.out.println("connection successfull");
        
    }
}
