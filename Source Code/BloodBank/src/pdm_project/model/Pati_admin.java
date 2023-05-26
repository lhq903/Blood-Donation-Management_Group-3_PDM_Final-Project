/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.model;

import java.sql.Date;


public class Pati_admin {
    private String hid, pname, phone, email, address, blood_type, med_cond, health_ins;

    private int gender, age;
    Date dob;
    
    public Pati_admin() {
    }

    public Pati_admin(String hid, String pname, String phone, String email, String address, String blood_type, String med_cond, String health_ins, int gender, int age, Date dob) {
        this.hid = hid;
        this.pname = pname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.blood_type = blood_type;
        this.med_cond = med_cond;
        this.health_ins = health_ins;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getMed_cond() {
        return med_cond;
    }

    public void setMed_cond(String med_cond) {
        this.med_cond = med_cond;
    }

    public String getHealth_ins() {
        return health_ins;
    }

    public void setHealth_ins(String health_ins) {
        this.health_ins = health_ins;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
}
