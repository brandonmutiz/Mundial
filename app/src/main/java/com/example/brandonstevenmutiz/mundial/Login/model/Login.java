package com.example.brandonstevenmutiz.mundial.Login.model;

public class Login {
    private int id;
    private String user;
    private boolean searchUser;
    private String password;

    public Login(int id, String user, boolean searchUser, String password) {
        this.id = id;
        this.user = user;
        this.searchUser = searchUser;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isSearchUser() {
        return searchUser;
    }

    public void setSearchUser(boolean searchUser) {
        searchUser = searchUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
