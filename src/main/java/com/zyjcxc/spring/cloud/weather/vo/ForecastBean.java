package com.zyjcxc.spring.cloud.weather.vo;

/**
 * @author mengqa
 * @create 2018-11-25 22:08
 **/
public class ForecastBean {
    /**
     * date : 25日星期日
     * sunrise : 07:03
     * high : 高温 12.0℃
     * low : 低温 2.0℃
     * sunset : 16:52
     * aqi : 225
     * fx : 南风
     * fl : <3级
     * type : 晴
     * notice : 愿你拥有比阳光明媚的心情
     */

    private String date;
    private String sunrise;
    private String high;
    private String low;
    private String sunset;
    private int aqi;
    private String fx;
    private String fl;
    private String type;
    private String notice;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}