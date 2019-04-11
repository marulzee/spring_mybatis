package com.mrz.mapper;

import com.mrz.dto.MenuDto;
import com.mrz.dto.MenuInfoDto;
import com.mrz.pojo.MenuInfo;

import java.util.List;

public interface MenuInfoMapper extends BaseDao<MenuInfo> {
    List<MenuDto> getAllMenu(int roleid);
    List<MenuInfoDto> getAllMenuAll();
}
