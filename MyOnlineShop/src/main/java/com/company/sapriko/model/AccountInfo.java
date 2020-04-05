package com.company.sapriko.model;

public class AccountInfo {

    private String userName;
    private String password;
    private boolean active;
    private String userRole;

    private boolean newAccount = false;

    public AccountInfo() {
    }

    public AccountInfo(String userName, String password, boolean active, String userRole) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.userRole = userRole;
    }

    public boolean isNewAccount() {
        return newAccount;
    }

    public void setNewAccount(boolean newAccount) {
        this.newAccount = newAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUserRole() {
        return "USER";
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}