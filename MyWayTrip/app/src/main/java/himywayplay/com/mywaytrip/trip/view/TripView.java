package himywayplay.com.mywaytrip.trip.view;

import java.util.List;

import himywayplay.com.mywaytrip.beans.TripListBean;

/**
 * Created by f.x on 2016/4/22.
 * Email:xiasiqiu@gmail.com
 */
public interface TripView {
    void showProgress();

    void addNews(List<TripListBean> tripList);

    void hideProgress();

    void showLoadFailMsg();
}
