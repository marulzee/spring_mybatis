package com.mrz.service;

import com.mrz.dto.MenuDto;
import com.mrz.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoService {
    List<MenuDto> getAllMenu(int roleid);

    List<MenuInfoDto> getAllMenuAll();
}
