/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pdm_project.donor.DatabaseDonor;
import pdm_project.model.Pati_admin;
import java.sql.Date;


public class Patient {
     public boolean insert(Pati_admin pat) throws Exception{
        String sql = "insert into patient(hid, pname, phone, email, address, med_cond, blood_type, health_ins, gender, age, dob) values(?,?,?,?,?,?,?,?,?,?,?)";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, pat.getHid()); 
            pstmt.setString(2, pat.getPname());
            pstmt.setString(3, pat.getPhone());
            pstmt.setString(4, pat.getEmail());
            pstmt.setString(5, pat.getAddress());
            pstmt.setString(6, pat.getMed_cond());
            pstmt.setString(7, pat.getBlood_type());
            pstmt.setString(8, pat.getHealth_ins());
            pstmt.setInt(9, pat.getGender());
            pstmt.setInt(10, pat.getAge());
            pstmt.setDate(11, (java.sql.Date) pat.getDob());
            
            return pstmt.executeUpdate() > 0;
        }
    }
     
     public Pati_admin findByPhone(String phone) throws Exception{
            String sql = "select * from patient where phone = ?";
        try(
                Connection con = DatabaseDonor.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, phone); 
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                Pati_admin pa = new Pati_admin();
                pa.setPhone(rs.getString("phone"));
                pa.setHid(rs.getString("hid"));
                pa.setPname(rs.getString("dname"));
                pa.setEmail(rs.getString("email"));
                pa.setAddress(rs.getString("address"));
                pa.setBlood_type(rs.getString("blood_type"));
                pa.setHealth_ins(rs.getString("health_ins"));
                pa.setMed_cond(rs.getString("med_cond"));
                pa.setGender(rs.getInt("gender"));
                pa.setAge(rs.getInt("age"));
                pa.setDob(rs.getDate("dob"));
                
                return pa;
            }
            
            return null;
        }
    }
    public boolean update(Pati_admin pat) throws Exception{
        String sql = "update Patient set hid=?, dname = ?, email = ?, address = ?, blood_type = ?, med_cond = ?,health_ins = ? gender = ?, age = ?, dob = ?"
                        + " where phone = ?";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, pat.getPname()); 
            pstmt.setString(11, pat.getPhone());
            pstmt.setString(3, pat.getEmail());
            pstmt.setString(1, pat.getHid());
            pstmt.setString(4, pat.getAddress());
            pstmt.setString(5, pat.getBlood_type());
            pstmt.setString(6, pat.getMed_cond());
            pstmt.setString(6, pat.getHealth_ins());
            pstmt.setInt(7, pat.getGender());
            pstmt.setInt(8, pat.getAge());
            pstmt.setDate(9, (java.sql.Date) pat.getDob());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    
     
     public boolean delete(String phone) throws Exception{
        String sql = "delete from patient where phone = ?";
        try(
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, phone); 
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
}
