package com.zyjcxc.spring.cloud.weather.controller;

import com.zyjcxc.spring.cloud.weather.model.JsonTestResult;
import com.zyjcxc.spring.cloud.weather.model.Student;
import com.zyjcxc.spring.cloud.weather.utils.CommonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengqa
 * @create 2018-11-25 19:39
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/testJsonResult")
    public JsonTestResult testJsonResult() {
        JsonTestResult result = new JsonTestResult();
        result.setResultCode(200);
        result.setMessage("查询成功");
        result.setData("Hello world");

        return result;
    }

    @RequestMapping("/testJsonResultMore")
    public JsonTestResult testJsonResultMore() {
        JsonTestResult result = new JsonTestResult();
        Student s = CommonUtils.getTestStudentData();
        result.setResultCode(200);
        result.setMessage("查询成功");
        result.setData(s);
        return result;
    }
}

