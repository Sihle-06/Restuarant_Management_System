/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant_management_systems;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author S993540
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restuarant","root","");
            return connect;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
