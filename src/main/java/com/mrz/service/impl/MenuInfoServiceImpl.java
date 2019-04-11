package com.mrz.service.impl;

import com.mrz.dto.MenuDto;
import com.mrz.dto.MenuInfoDto;
import com.mrz.mapper.MenuInfoMapper;
import com.mrz.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    @Override
    public List<MenuDto> getAllMenu(int roleid) {
        return this.menuInfoMapper.getAllMenu(roleid);
    }

    @Override
    public List<MenuInfoDto> getAllMenuAll() {
        return this.menuInfoMapper.getAllMenuAll();
    }
}
