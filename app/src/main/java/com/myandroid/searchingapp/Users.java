package com.myandroid.searchingapp;

import com.google.gson.annotations.SerializedName;

public class Users {

    @SerializedName("id") private int Id;
    @SerializedName("name") private String name;
    @SerializedName("email") private String email;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
