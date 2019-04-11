package com.mrz.controller;

import com.mrz.dto.MenuDto;
import com.mrz.dto.MenuInfoDto;
import com.mrz.service.MenuInfoService;
import com.mrz.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("getAllMenu")
    public Object getAllMenu(@RequestParam(value = "roleid") int roleid){
        System.out.println(roleid);
        List<MenuDto> allMenu = this.menuInfoService.getAllMenu(roleid);
        System.out.println(allMenu);
        System.out.println(allMenu+"");
        return allMenu;
    }
    @RequestMapping("getAllMenuAll")
    public Object getAll(){
        List<MenuInfoDto> menuAl=this.menuInfoService.getAllMenuAll();
        return menuAl;
    }
}
