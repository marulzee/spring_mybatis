package com.mrz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mrz.dto.RoleInfoDto;
import com.mrz.pojo.RoleInfo;
import com.mrz.service.RoleInfoService;
import com.mrz.utils.DBUtils;
import com.mrz.vo.RoleInfoVo;
import com.mrz.vo.UserIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleInfoService roleInfoService;

    /**
     * 修改前回显
     * @param roleInfoVo
     * @return
     */
    @RequestMapping(value = "updateBefore")
    public Object getRoleBy(@RequestBody(required = false) RoleInfoVo roleInfoVo){
        System.out.println(roleInfoVo);
        List<RoleInfo> roleInfos = this.roleInfoService.getRoleInfo(roleInfoVo);
        for (RoleInfo roleInfo:roleInfos){
            if (roleInfo!=null){
                return roleInfo;
            }
        }
        return null;
    }

    @RequestMapping(value = "updateRoleInfo")
    public Object updateRoleInfo(@RequestBody(required = false) RoleInfoVo roleInfoVo) {
        int i = this.roleInfoService.updateRoleInfo(roleInfoVo);
        return DBUtils.getFlag(i);
    }

    /**
     * 批量删除
     * @param roleInfoVo
     * @return
     */
    @RequestMapping("delAllById")
    public boolean delAllById(@RequestBody(required = false) RoleInfoVo roleInfoVo){
        int i = this.roleInfoService.delAllById(roleInfoVo);
        return true;
    }

    @RequestMapping("delRoleInfo")
    public boolean delRoleInfo(@RequestBody(required = false) RoleInfoVo roleInfoVo){
        int i=this.roleInfoService.delRoleInfo(roleInfoVo);
        return DBUtils.getFlag(i);
    }

    /**
     * 添加
     * @param roleInfoVo
     * @return
     */
    @RequestMapping("addRoleInfo")
    public boolean addRoleInfo(@RequestBody(required = false) RoleInfoVo roleInfoVo){
        System.out.println(roleInfoVo.getRoleInfo().getRolename());
        int i = this.roleInfoService.addRoleInfo(roleInfoVo);
        if (i>0){
            return true;
        }
        return false;
    }

    /**
     * 展示
     * @param roleInfoVo
     * @return
     */
    @RequestMapping("getRoleInfo")
    public Object getRoleInfo(@RequestBody(required = false) RoleInfoVo roleInfoVo){
        PageHelper.startPage(roleInfoVo.getPage().getCurrentPage(),roleInfoVo.getPage().getPageSize());
        List<RoleInfo> roleInfo = this.roleInfoService.getRoleInfo(roleInfoVo);
        return new PageInfo(roleInfo);
    }

    @RequestMapping("getRoleByUserId")
    public Object getRoleByUserId(@RequestBody(required = false) UserIdVo userIdVo){
        System.out.println(userIdVo);
        List<RoleInfoDto> roleByUserId = this.roleInfoService.getRoleByUserId(userIdVo);
        System.out.println(roleByUserId);
        return roleByUserId;
    }

    @RequestMapping("deleteRoleInfo")
    public boolean deleteRoleInfo(@RequestBody (required = false) UserIdVo userIdVo){
        int i = this.roleInfoService.deleteRoleInfo(userIdVo);
        return true;
    }

    @RequestMapping("insertRole")
    public boolean insertRole(@RequestBody(required = false) UserIdVo userIdVo){
        int i = this.roleInfoService.insertRole(userIdVo);
        return DBUtils.getFlag(i);
    }
}
