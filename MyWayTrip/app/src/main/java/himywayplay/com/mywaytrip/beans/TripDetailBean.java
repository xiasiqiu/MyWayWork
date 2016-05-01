package himywayplay.com.mywaytrip.beans;

/**
 * Description : 线路详情实体类
 * Created by f.x on 2016/4/20.
 * Email:xiasiqiu@gmail.com
 */
public class TripDetailBean {
    /**
     * 视频地址
     */
    private String video_url;

    /**
     * 路线标题
     */
    private String trip_title;
    /**
     * 成人价格
     */
    private String man_pric;
    /**
     * 儿童价格
     */
    private String chi_pric;
    /**
     * 出发城市
     */
    private String city_go;
    /**
     * 出发时间
     */
    private String time_go;
    /**
     * 活动介绍url
     */
    private String content_url;
    /**
     * 路线安排url
     */
    private String line_url;
    /**
     * 注意事项 url
     */
    private String attention_url;
    /**
     * 线路背景图
     */
    private String line_img;
    /**
     * 线路简述
     */
    private String line_content;


    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getTrip_title() {
        return trip_title;
    }

    public void setTrip_title(String trip_title) {
        this.trip_title = trip_title;
    }

    public String getMan_pric() {
        return man_pric;
    }

    public void setMan_pric(String man_pric) {
        this.man_pric = man_pric;
    }

    public String getCity_go() {
        return city_go;
    }

    public void setCity_go(String city_go) {
        this.city_go = city_go;
    }

    public String getChi_pric() {
        return chi_pric;
    }

    public void setChi_pric(String chi_pric) {
        this.chi_pric = chi_pric;
    }

    public String getTime_go() {
        return time_go;
    }

    public void setTime_go(String time_go) {
        this.time_go = time_go;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public String getLine_url() {
        return line_url;
    }

    public void setLine_url(String line_url) {
        this.line_url = line_url;
    }

    public String getAttention_url() {
        return attention_url;
    }

    public void setAttention_url(String attention_url) {
        this.attention_url = attention_url;
    }

    public String getLine_img() {
        return line_img;
    }

    public void setLine_img(String line_img) {
        this.line_img = line_img;
    }

    public String getLine_content() {
        return line_content;
    }

    public void setLine_content(String line_content) {
        this.line_content = line_content;
    }
}
