package com.zyjcxc.spring.cloud.weather.utils;

import com.zyjcxc.spring.cloud.weather.model.Address;
import com.zyjcxc.spring.cloud.weather.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengqa
 * @create 2018-11-25 20:14
 **/
public class CommonUtils {

    public static Student getTestStudentData() {
        Student s = new Student();
        s.setId(1L);
        s.setName("测试学生");
        Address address1 = new Address();
        address1.setAddress("中兴街");
        address1.setCity("沈阳");
        Address address2 = new Address();
        address2.setAddress("老街");
        address2.setCity("北京");
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        s.setAddressList(addresses);
        return s;
    }
}
