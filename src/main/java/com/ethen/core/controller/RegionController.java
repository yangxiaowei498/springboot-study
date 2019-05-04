package com.ethen.core.controller;

import com.ethen.core.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @RequestMapping("/listProvince")
    public Object listProvince() {
        return regionService.listProvince();
    }
}
