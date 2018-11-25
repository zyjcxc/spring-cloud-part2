package com.zyjcxc.spring.cloud.weather.vo;

import java.util.List;

/**
 * @author mengqa
 * @create 2018-11-25 22:05
 **/
public class WeatherBean {
    /**
     * shidu : 62%
     * pm25 : 160
     * pm10 : 180
     * quality : 重度污染
     * wendu : 5
     * ganmao : 老年人及心脏、呼吸系统疾病患者人群应停留在室内，停止户外运动，一般人群减少户外运动
     * yesterday : {"date":"24日星期六","sunrise":"07:02","high":"高温 10.0℃","low":"低温 2.0℃","sunset":"16:52",
     * "aqi":138,"fx":"西南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}
     * forecast : [{"date":"25日星期日","sunrise":"07:03","high":"高温 12.0℃","low":"低温 2.0℃","sunset":"16:52",
     * "aqi":225,"fx":"南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"26日星期一","sunrise":"07:04",
     * "high":"高温 12.0℃","low":"低温 2.0℃","sunset":"16:51","aqi":227,"fx":"西风","fl":"<3级","type":"霾",
     * "notice":"雾霾来袭，戴好口罩再出门"},{"date":"27日星期二","sunrise":"07:06","high":"高温 10.0℃","low":"低温 0.0℃",
     * "sunset":"16:51","aqi":98,"fx":"北风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"28日星期三",
     * "sunrise":"07:07","high":"高温 11.0℃","low":"低温 1.0℃","sunset":"16:50","aqi":100,"fx":"北风","fl":"<3级",
     * "type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"29日星期四","sunrise":"07:08","high":"高温 10.0℃","low":"低温 1.0℃",
     * "sunset":"16:50","aqi":59,"fx":"东南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}]
     */

    private String shidu;
    private int pm25;
    private int pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private YesterdayBean yesterday;
    private List<ForecastBean> forecast;

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public int getPm25() {
        return pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getPm10() {
        return pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public YesterdayBean getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayBean yesterday) {
        this.yesterday = yesterday;
    }

    public List<ForecastBean> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastBean> forecast) {
        this.forecast = forecast;
    }

}
