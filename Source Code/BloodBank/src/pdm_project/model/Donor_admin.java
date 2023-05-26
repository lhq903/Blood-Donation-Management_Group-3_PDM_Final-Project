/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.model;

import java.sql.Date;



public class Donor_admin {
    private String dname, phone, email, password, address, blood_type, med_cond, did;
    private int gender, age;
    Date dob;

    public Donor_admin() {
    }

    public Donor_admin(String did, String name, String phone, String email, String password, String address, String blood_type, String med_cond, int gender, int age, Date dob) {
        this.did = did;
        this.dname = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.blood_type = blood_type;
        this.med_cond = med_cond;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getName() {
        return dname;
    }

    public void setName(String name) {
        this.dname = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getblood_type() {
        return blood_type;
    }

    public void setblood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getmed_cond() {
        return med_cond;
    }

    public void setmed_cond(String med_cond) {
        this.med_cond = med_cond;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getdob() {
        return dob;
    }

    public void setdob(Date dob) {
        this.dob = dob;
    } 
    
    
   
    
}
