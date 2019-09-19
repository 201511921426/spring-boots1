package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class Car {
    /**
    * 主键
    */
    private Integer carId;

    private Integer autotypeId;

    private Integer brandId;

    private Integer colorId;

    private Integer standardId;

    private Integer priceId;

    private Integer num;

    private Byte isDelete;

    private String carname;

    private Double prices;
}