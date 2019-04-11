package com.mrz.mapper;


import com.mrz.dto.RoleInfoDto;
import com.mrz.pojo.RoleInfo;
import com.mrz.vo.RoleInfoVo;
import com.mrz.vo.UserIdVo;

import java.util.List;

public interface RoleInfoMapper{
    int delAllById(RoleInfoVo roleInfoVo);
    int addRoleInfo(RoleInfoVo roleInfoVo);
    List<RoleInfo> getRoleInfo(RoleInfoVo roleInfoVo);
    int updateRoleInfo(RoleInfoVo roleInfoVo);
    int delRoleInfo(RoleInfoVo roleInfoVo);
    List<RoleInfoDto> getRoleByUserId(UserIdVo userIdVo);
    int deleteRoleInfo(UserIdVo userIdVo);
    int insertRole(UserIdVo userIdVo);
}
