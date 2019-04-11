package com.mrz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mrz.dto.UserInfoDto;
import com.mrz.pojo.UserInfo;
import com.mrz.service.UserInfoService;
import com.mrz.utils.Page;
import com.mrz.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController  {
    @Autowired
    UserInfoService userInfoService;

    /**
     * 检查登录
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String test(@RequestBody UserInfo userInfo){
        Logger logger= LoggerFactory.getLogger(MyController.class);
        logger.info("===============start==============");
        long startTime=System.currentTimeMillis();
        Boolean flag= this.userInfoService.loginCheck(userInfo);
        long endTime=System.currentTimeMillis();
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("==============end==============");
        return flag.toString();
    }

    /**
     * 信息展示
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "userInfoList")
    public Object getUserInfoList(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userInfos = this.userInfoService.selectObjectBy(userInfo);
        System.out.println(userInfos);
        return userInfos;
    }

    /**
     * 修改前回显
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateInfo")
    public Object updateInfo(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userInfos = this.userInfoService.selectObjectBy(userInfo);
        for (UserInfo userInfo1:userInfos){
            if (userInfo1!=null){
                System.out.println(userInfo1);
                return userInfo1;
            }
        }
        return null;
    }

    /**
     * 修改信息
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateUserInfo")
    public String updateUserInfo(@RequestBody(required = false) UserInfo userInfo){
        Boolean flag = this.userInfoService.updateObject(userInfo);
        System.out.println(flag);
        return flag.toString();
    }

    /**
     * 伪删除
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteObject")
    public String deleteObject(@RequestBody(required = false) UserInfo userInfo) {
        Boolean flag = this.userInfoService.deleteObject(userInfo);
        return flag.toString();
    }

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addObject")
    public String addObject(@RequestBody(required = false) UserInfo userInfo) {
        Boolean flag=this.userInfoService.addObject(userInfo);
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getUserInfoVoBy")
    public Object getUserInfoVoBy(@RequestBody(required = false) UserInfoVo userInfoVo) {
        System.out.println(userInfoVo);
        PageHelper.startPage(userInfoVo.getPage().getCurrentPage(),userInfoVo.getPage().getPageSize());
        List<UserInfo> userInfoVoBy = this.userInfoService.getUserInfoVoBy(userInfoVo);
        return new PageInfo(userInfoVoBy);
    }
    @ResponseBody
    @RequestMapping(value = "delBatch")
    public int delBatch(@RequestBody(required = false) UserInfoVo userInfoVo){
        int i = this.userInfoService.delBatch(userInfoVo);
        return i;
    }
}
