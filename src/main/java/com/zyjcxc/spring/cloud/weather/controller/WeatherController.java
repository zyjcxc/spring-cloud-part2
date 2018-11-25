package com.zyjcxc.spring.cloud.weather.controller;

import com.zyjcxc.spring.cloud.weather.service.WeatherDataService;
import com.zyjcxc.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengqa
 * @create 2018-11-25 19:39
 **/
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getWeatherById(@PathVariable("cityId")  String cityId) {
        WeatherResponse weatherResponse = weatherDataService.getDataByCityId(cityId);
        return weatherResponse;
    }
}

