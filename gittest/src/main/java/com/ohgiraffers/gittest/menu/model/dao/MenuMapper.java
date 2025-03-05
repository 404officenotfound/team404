package com.ohgiraffers.gittest.menu.model.dao;

import com.ohgiraffers.gittest.menu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    MenuDTO findMenuByCode(int code);

}
