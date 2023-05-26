/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pdm_project.donor.DatabaseDonor;
import pdm_project.model.BloodStock_admin;


public class BloodStock {
    public boolean insert(BloodStock_admin bs) throws Exception{
        String sql = "insert into BloodStock(did, bid, blood_type, volume, input_date) values(?,?,?,?,?)";
        try(
                Connection con = DatabaseDonor.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
                pstmt .setString(1, bs.getDid());
                pstmt.setString(2, bs.getBid());
                pstmt.setString(3, bs.getBlood_type());
                pstmt.setInt(4, bs.getVolume());
                pstmt.setDate(5, bs.getInput_date());
            
            return pstmt.executeUpdate() > 0;
        }
    }
}
