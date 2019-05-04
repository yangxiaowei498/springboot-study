package com.ethen.core.mapper;

import com.ethen.core.domain.Area;
import com.ethen.core.domain.City;
import com.ethen.core.domain.Province;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface RegionMapper {

    //查询所有省信息
    @Cacheable(cacheNames = "provinces")
    List<Province> listProvince();

    //查询省下辖所有市
    @Cacheable(cacheNames = "cities",key = "#provinceId")
    List<City> listCityByProvinceId(String provinceId);

    //查询市下辖的地区列表
    @Cacheable(cacheNames = "areas",key = "#cityId")
    List<Area> listAreaByCityId(String cityId);

}
