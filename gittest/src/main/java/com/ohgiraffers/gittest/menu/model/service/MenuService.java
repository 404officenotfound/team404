package com.ohgiraffers.gittest.menu.model.service;

import com.ohgiraffers.gittest.menu.model.dao.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    @Autowired
    public MenuService(MenuMapper menuMapper) {

        this.menuMapper = menuMapper;
    }


}
