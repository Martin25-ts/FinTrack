package com.example.fintrackandroid.Model;

import java.util.Date;

public class Card {

    /*
    *  1. id untuk menentukan id dari masing masing card
    *  2. name untuk menentukan nama platform kartu
    *  3. password untuk mengamannkan bila ada transaksi yang dilakukan
    *  4. number untuk mengidentifikasi kartu dengan number
    *  5. type untuk menentukan model background kartu yang dipakai    *
    * */

    private String id, name, pasword, number, ammount,type;
    private Date created_at, Updated_at;

    public Card(String id,
                String name,
                String pasword,
                String number,
                String ammount,
                String type,
                Date created_at,
                Date updated_at) {

        this.ammount = ammount;
        this.id = id;
        this.name = name;
        this.pasword = pasword;
        this.number = number;
        this.type = type;
        this.created_at = created_at;
        this.Updated_at = updated_at;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(Date updated_at) {
        Updated_at = updated_at;
    }


    public String getAmmount() {
        return ammount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasword() {
        return pasword;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return Updated_at;
    }
}
