package com.revert.freemarkers.model.user;

import com.revert.common.base.model.BaseModel;

public class UserModel extends BaseModel {

    private String account;
    private String password;
    private String gender;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
