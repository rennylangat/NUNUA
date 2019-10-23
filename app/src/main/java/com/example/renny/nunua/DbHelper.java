package com.example.renny.nunua;


/**
 * Created by renny on 1/30/2017.
 */

public class DbHelper {
    private int _id;
    private String _name;
    private String _email;
    private String _phone;

    public DbHelper(String s){
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public DbHelper(String name, String email, String phone) {
        this._name = name;
       this._email = email;
        this._phone = phone;

    }
}

