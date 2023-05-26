/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pdm_project.donor.DatabaseDonor;
import pdm_project.model.Donor_admin;


public class Donor {
    public boolean insert(Donor_admin don) throws Exception{
        String sql = "insert into Donor(dname, phone, email, password, address, blood_type, med_cond, gender, age, dob) values(?,?,?,?,?,?,?,?,?,?)";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, don.getName()); 
            pstmt.setString(2, don.getPhone());
            pstmt.setString(3, don.getEmail());
            pstmt.setString(4, don.getPassword());
            pstmt.setString(5, don.getAddress());
            pstmt.setString(6, don.getblood_type());
            pstmt.setString(7, don.getmed_cond());
            pstmt.setInt(8, don.getGender());
            pstmt.setInt(9, don.getAge());
            pstmt.setDate(10, (java.sql.Date) don.getdob());
            
            
            return pstmt.executeUpdate() > 0;
        }
    }
    public Donor_admin findByPhone(String phone) throws Exception{
            String sql = "select * from Donor where phone = ?";
        try(
                Connection con = DatabaseDonor.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, phone); 
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                Donor_admin dn = new Donor_admin();
                dn.setPhone(rs.getString("phone"));
                dn.setName(rs.getString("dname"));
                dn.setEmail(rs.getString("email"));
                dn.setPassword(rs.getString("password"));
                dn.setAddress(rs.getString("address"));
                dn.setblood_type(rs.getString("blood_type"));
                dn.setmed_cond(rs.getString("med_cond"));
                dn.setGender(rs.getInt("gender"));
                dn.setAge(rs.getInt("age"));
                dn.setdob(rs.getDate("dob"));
                dn.setDid(rs.getString("did"));
                
                return dn;
            }
            
            return null;
        }
    }
    public boolean update(Donor_admin don) throws Exception{
        String sql = "update Donor set dname = ?, email = ?, password = ?, address = ?, blood_type = ?, med_cond = ?, gender = ?, age = ?, dob = ?"
                        + " where phone = ?";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, don.getName()); 
            pstmt.setString(10, don.getPhone());
            pstmt.setString(2, don.getEmail());
            pstmt.setString(3, don.getPassword());
            pstmt.setString(4, don.getAddress());
            pstmt.setString(5, don.getblood_type());
            pstmt.setString(6, don.getmed_cond());
            pstmt.setInt(7, don.getGender());
            pstmt.setInt(8, don.getAge());
            pstmt.setDate(9, (java.sql.Date) don.getdob());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateinfo(Donor_admin don) throws Exception{
        String sql = "update Donor set dname = ?, email = ?, password = ?, address = ?, gender = ?, age = ?, dob = ?" + " where did = ?";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, don.getName()); 
            pstmt.setString(8, don.getDid()); 
            pstmt.setString(2, don.getEmail());
            pstmt.setString(3, don.getPassword());
            pstmt.setString(4, don.getAddress());
            pstmt.setInt(5, don.getGender());
            pstmt.setInt(6, don.getAge());
            pstmt.setDate(7, (java.sql.Date) don.getdob());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String phone) throws Exception{
        String sql = "delete from Donor where phone = ?";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, phone); 
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
}
