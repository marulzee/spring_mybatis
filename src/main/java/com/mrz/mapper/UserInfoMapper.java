package com.mrz.mapper;

import com.mrz.pojo.UserInfo;
import com.mrz.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper extends BaseDao<UserInfo>{
    UserInfo loginCheck(UserInfo userInfo);

    List<UserInfo> getUserInfoVoBy(UserInfoVo userInfoVo);
}
