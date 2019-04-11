package com.mrz.service.impl;

import com.mrz.mapper.UserInfoMapper;
import com.mrz.pojo.UserInfo;
import com.mrz.service.UserInfoService;
import com.mrz.utils.DBUtils;
import com.mrz.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public boolean addObject(UserInfo userInfo) {
        int i = this.userInfoMapper.addObject(userInfo);
        return DBUtils.getFlag(i);
    }

    @Override
    public boolean deleteObject(UserInfo userInfo) {
        int i = this.userInfoMapper.deleteObject(userInfo);
        return DBUtils.getFlag(i);
    }

    @Override
    public boolean updateObject(UserInfo userInfo) {
        int i = this.userInfoMapper.updateObject(userInfo);
        return DBUtils.getFlag(i);
    }

    @Override
    public List<UserInfo> selectObjectBy(UserInfo userInfo) {
        return this.userInfoMapper.selectObjectBy(userInfo);
    }

    @Override
    public int delBatch(UserInfoVo userInfoVo) {
        return this.userInfoMapper.delBatch(userInfoVo);
    }

    @Override
    public boolean loginCheck(UserInfo userInfo) {
        UserInfo userInfo1 = this.userInfoMapper.loginCheck(userInfo);
        if (userInfo1!=null){
            return true;
        }
        return false;
    }

    @Override
    public List<UserInfo> getUserInfoVoBy(UserInfoVo userInfoVo) {
        return this.userInfoMapper.getUserInfoVoBy(userInfoVo);
    }
}
