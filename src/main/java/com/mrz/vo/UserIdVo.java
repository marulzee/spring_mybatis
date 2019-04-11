package com.mrz.vo;

import lombok.ToString;

@ToString
public class UserIdVo {
    int userid;
    int[] roles;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int[] getRoles() {
        return roles;
    }

    public void setRoles(int[] roles) {
        this.roles = roles;
    }
}
