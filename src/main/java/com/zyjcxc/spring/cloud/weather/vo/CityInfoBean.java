package com.zyjcxc.spring.cloud.weather.vo;

/**
 * @author mengqa
 * @create 2018-11-25 22:04
 **/
public class CityInfoBean {

    /**
     * city : 天津市
     * cityId : 101030100
     * parent : 天津
     * updateTime : 19:00
     */

    private String city;
    private String cityId;
    private String parent;
    private String updateTime;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
