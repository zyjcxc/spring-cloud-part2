package com.zyjcxc.spring.cloud.weather.model;

import java.util.List;

/**
 * @author mengqa
 * @create 2018-11-25 20:07
 **/
public class Student {

    private Long id;

    private String name;

    private List<Address> addressList;

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
