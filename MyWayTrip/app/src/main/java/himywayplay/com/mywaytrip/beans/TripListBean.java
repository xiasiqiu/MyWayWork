package himywayplay.com.mywaytrip.beans;

import java.util.List;

/**
 * Description ：线路列表实体类
 * Created by f.x on 2016/4/20.
 * Email:xiasiqiu@gmail.com
 */
public class TripListBean {
    /**
     * 路线类别
     */
    private String line_tag;


    /**
     * 路线列表
     */
    private List<TripDetailBean> line_list;

    public String getLine_tag() {
        return line_tag;
    }

    public void setLine_tag(String line_tag) {
        this.line_tag = line_tag;
    }

    public List<TripDetailBean> getLine_list() {
        return line_list;
    }

    public void setLine_list(List<TripDetailBean> line_list) {
        this.line_list = line_list;
    }
}
