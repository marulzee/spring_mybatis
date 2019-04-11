package com.mrz.service;

import com.mrz.pojo.UserInfo;
import com.mrz.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService extends BaseService<UserInfo> {
    boolean loginCheck(UserInfo userInfo);

    List<UserInfo> getUserInfoVoBy(UserInfoVo userInfoVo);

}
