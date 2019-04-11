package com.mrz.service.impl;

import com.mrz.dto.RoleInfoDto;
import com.mrz.mapper.RoleInfoMapper;
import com.mrz.pojo.RoleInfo;
import com.mrz.service.RoleInfoService;
import com.mrz.vo.RoleInfoVo;
import com.mrz.vo.UserIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Override
    public int delAllById(RoleInfoVo roleInfoVo) {
        return this.roleInfoMapper.delAllById(roleInfoVo);
    }

    @Override
    public int addRoleInfo(RoleInfoVo roleInfoVo) {
        return this.roleInfoMapper.addRoleInfo(roleInfoVo);
    }

    @Override
    public List<RoleInfo> getRoleInfo(RoleInfoVo roleInfoVo) {
        return this.roleInfoMapper.getRoleInfo(roleInfoVo);
    }

    @Override
    public int updateRoleInfo(RoleInfoVo roleInfoVo) {
        return this.roleInfoMapper.updateRoleInfo(roleInfoVo);
    }

    @Override
    public int delRoleInfo(RoleInfoVo roleInfoVo) {
        return this.roleInfoMapper.delRoleInfo(roleInfoVo);
    }

    @Override
    public List<RoleInfoDto> getRoleByUserId(UserIdVo userIdVo) {
        return this.roleInfoMapper.getRoleByUserId(userIdVo);
    }

    @Override
    public int deleteRoleInfo(UserIdVo userIdVo) {
        return this.roleInfoMapper.deleteRoleInfo(userIdVo);
    }
    public int insertRole(UserIdVo userIdVo){
        return this.roleInfoMapper.insertRole(userIdVo);
    }
}
