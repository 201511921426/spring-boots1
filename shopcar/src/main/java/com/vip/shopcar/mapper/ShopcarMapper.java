package com.vip.shopcar.mapper;

import com.vip.shopcar.domain.entity.Shopcar;

public interface ShopcarMapper {
    int deleteByPrimaryKey(Integer shopcarId);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    Shopcar selectByPrimaryKey(Integer shopcarId);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}