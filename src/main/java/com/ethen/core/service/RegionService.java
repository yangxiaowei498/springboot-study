package com.ethen.core.service;

import com.ethen.core.domain.Area;
import com.ethen.core.domain.City;
import com.ethen.core.domain.Province;

import java.util.List;

public interface RegionService {

    //查询所有省信息
    List<Province> listProvince();

    //查询省下辖所有市
    List<City> listCityByProvinceId(String provinceId);

    //查询市下辖的地区列表
    List<Area> listAreaByCityId(String cityId);
}
