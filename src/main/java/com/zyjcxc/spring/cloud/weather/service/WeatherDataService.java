package com.zyjcxc.spring.cloud.weather.service;

import com.zyjcxc.spring.cloud.weather.vo.WeatherResponse;

public interface WeatherDataService {

    /**
     * 根据城市id查询天气
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);


}
