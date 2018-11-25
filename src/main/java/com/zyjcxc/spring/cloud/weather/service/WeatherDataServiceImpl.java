package com.zyjcxc.spring.cloud.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyjcxc.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author mengqa
 * @create 2018-11-25 22:13
 **/
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String API_URL = "http://t.weather.sojson.com/api/weather/city/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String apiUrl = API_URL + cityId;
        WeatherResponse response = new WeatherResponse();
        ResponseEntity<String> responseEntity;
        try {
            responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        } catch (HttpClientErrorException he) {
            response.setStatus(404);
            response.setMessage("Request resource not found");
            return response;
        }

        ObjectMapper objectMapper = new ObjectMapper();

        String strBody = null;
        if (responseEntity.getStatusCodeValue() == 200) {
            strBody = responseEntity.getBody();
        }
        try {
            response = objectMapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(506);
            return response;
        }

        return response;
    }
}
