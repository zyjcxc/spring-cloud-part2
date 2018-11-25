package com.zyjcxc.spring.cloud.weather.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyjcxc.spring.cloud.weather.model.JsonTestResult;
import com.zyjcxc.spring.cloud.weather.model.Student;
import com.zyjcxc.spring.cloud.weather.utils.CommonUtils;
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
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello world"))
                .andReturn();
    }


    @Test
    public void testJsonResult() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/testJsonResult").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("{\"resultCode\":200,\"message\":\"查询成功\"," +
//                        "\"data\":\"Hello world\"}"))
                .andExpect(MockMvcResultMatchers.content().json("{\"resultCode\":200,\"message\":\"查询成功\"," +
                        "\"data\":\"Hello world\"}"))
                .andReturn();
    }

    @Test
    public void testJsonResultMore() throws Exception {
        // 期望返回结果
        Student student = CommonUtils.getTestStudentData();
        JsonTestResult<Student> result = new JsonTestResult<>();
        result.setResultCode(200);
        result.setData(student);
        result.setMessage("查询成功");

        // json to str
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(result);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/testJsonResultMore").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(jsonStr))
                .andReturn();
    }


}