package com.ethen.core.service.impl;

import com.ethen.core.domain.Area;
import com.ethen.core.domain.City;
import com.ethen.core.domain.Province;
import com.ethen.core.mapper.RegionMapper;
import com.ethen.core.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;
    @Override
    public List<Province> listProvince() {

        return regionMapper.listProvince();
    }

    @Override
    public List<City> listCityByProvinceId(String provinceId) {
        if (StringUtils.isEmpty(provinceId)) return new ArrayList<>();
        return regionMapper.listCityByProvinceId(provinceId);
    }

    @Override
    public List<Area> listAreaByCityId(String cityId) {
        if (StringUtils.isEmpty(cityId)) return new ArrayList<>();
        return regionMapper.listAreaByCityId(cityId);
    }
}
