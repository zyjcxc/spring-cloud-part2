package com.zyjcxc.spring.cloud.weather.vo;

/**
 * @author mengqa
 * @create 2018-11-25 22:02
 **/
public class WeatherResponse {


    /**
     * time : 2018-11-25 19:13:00
     * cityInfo : {"city":"天津市","cityId":"101030100","parent":"天津","updateTime":"19:00"}
     * date : 20181125
     * message : Success !
     * status : 200
     * data : {"shidu":"62%","pm25":160,"pm10":180,"quality":"重度污染","wendu":"5",
     * "ganmao":"老年人及心脏、呼吸系统疾病患者人群应停留在室内，停止户外运动，一般人群减少户外运动","yesterday":{"date":"24日星期六","sunrise":"07:02","high":"高温
     * 10.0℃","low":"低温 2.0℃","sunset":"16:52","aqi":138,"fx":"西南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},
     * "forecast":[{"date":"25日星期日","sunrise":"07:03","high":"高温 12.0℃","low":"低温 2.0℃","sunset":"16:52","aqi":225,
     * "fx":"南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"26日星期一","sunrise":"07:04","high":"高温 12.0℃",
     * "low":"低温 2.0℃","sunset":"16:51","aqi":227,"fx":"西风","fl":"<3级","type":"霾","notice":"雾霾来袭，戴好口罩再出门"},
     * {"date":"27日星期二","sunrise":"07:06","high":"高温 10.0℃","low":"低温 0.0℃","sunset":"16:51","aqi":98,"fx":"北风",
     * "fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"28日星期三","sunrise":"07:07","high":"高温 11.0℃","low":"低温
     * 1.0℃","sunset":"16:50","aqi":100,"fx":"北风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"29日星期四",
     * "sunrise":"07:08","high":"高温 10.0℃","low":"低温 1.0℃","sunset":"16:50","aqi":59,"fx":"东南风","fl":"<3级",
     * "type":"晴","notice":"愿你拥有比阳光明媚的心情"}]}
     */

    private String time;
    private CityInfoBean cityInfo;
    private String date;
    private String message;
    private int status;
    private WeatherBean data;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CityInfoBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public WeatherBean getData() {
        return data;
    }

    public void setData(WeatherBean data) {
        this.data = data;
    }

}
