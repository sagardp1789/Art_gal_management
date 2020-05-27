
package com.pkg.art;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DOKEPATIL
 */
public class DB_CON {


public static Connection getConnection()
{
    Connection con = null;
    
    

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery_db","root","admin");
    } catch (SQLException ex) {
        Logger.getLogger("get connection->"+DB_CON.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return con;
}
}
