package com.yillint.admin.service.impl;

import com.yillint.admin.bean.City;
import com.yillint.admin.mapper.CityMapper;
import com.yillint.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceimpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city) {
        cityMapper.insert(city);
    }
}
