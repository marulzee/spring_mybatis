package com.mrz.vo;

import com.mrz.pojo.UserInfo;
import com.mrz.utils.Page;

import java.util.Arrays;


public class UserInfoVo {
    private UserInfo userInfo;
    private Page page;
    int[] ids;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "userInfo=" + userInfo +
                ", page=" + page +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }
}
