package com.zyjcxc.spring.cloud.weather.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WeatherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getWeatherById() throws Exception {

//        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/weather/cityId/1").accept(MediaType.APPLICATION_JSON))
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/weather/cityId/101030100").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{\"time\":null,\"cityInfo\":null,\"date\":null," +
                        "\"message\":\"Request resource not found\",\"status\":404,\"data\":null}"))
                .andReturn();
    }
}