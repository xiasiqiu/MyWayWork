package himywayplay.com.mywaytrip.trip.model;

import org.kymjs.kjframe.KJHttp;

import java.util.List;

import himywayplay.com.mywaytrip.beans.TripDetailBean;
import himywayplay.com.mywaytrip.beans.TripListBean;

/**
 * Description : 线路业务处理
 * Created by f.x on 2016/4/25.
 * Email:xiasiqiu@gmail.com
 */
public class TripModelImpl implements TripModel {

    @Override
    public void loadTrips(String url, final int type, OnLoadTripListListener listener) {


    }

    @Override
    public void loadTripDetail(String docid, OnLoadTripDetailListener listener) {


    }


    public interface OnLoadTripListListener {
        void onSuccess(List<TripListBean> list);

        void onFailure(String Msg, Exception e);
    }

    public interface OnLoadTripDetailListener {
        void onSuccess(TripDetailBean tripDetailBean);

        void onFailure(String Msg, Exception e);
    }


}
