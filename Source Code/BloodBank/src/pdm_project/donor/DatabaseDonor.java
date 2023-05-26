/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.donor;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseDonor {
    public static Connection openConnection() throws Exception{
        //Class.forName("com.microsoft.sqlsever.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=PDMProject;user=sa;password=sa;encrypt=true;trustServerCertificate=true";
        Connection con = DriverManager.getConnection(connectionUrl);
        
        return con; 
    }
}
