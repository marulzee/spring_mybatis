package com.mrz.vo;

import com.mrz.pojo.RoleInfo;
import com.mrz.utils.Page;

import java.io.Serializable;

public class RoleInfoVo implements Serializable {
    int roleid;
    Page page;
    RoleInfo roleInfo;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "roleid=" + roleid +
                ", page=" + page +
                ", roleInfo=" + roleInfo +
                '}';
    }
}
