/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.model;

import java.sql.Date;


public class BloodStock_admin {
    private String did, bid, blood_type;
    private int volume;
    Date    input_date;

    public BloodStock_admin() {
    }

    public BloodStock_admin(String did, String bid, String blood_type, int volume, Date input_date) {
        this.did = did;
        this.bid = bid;
        this.blood_type = blood_type;
        this.volume = volume;
        this.input_date = input_date;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Date getInput_date() {
        return input_date;
    }

    public void setInput_date(Date input_date) {
        this.input_date = input_date;
    }

}
