package himywayplay.com.mywaytrip.trip.model;

/**
 * Created by f.x on 2016/4/22.
 * Email:xiasiqiu@gmail.com
 */
public interface TripModel {
    void loadTrips(String url, int type, TripModelImpl.OnLoadTripListListener listener);

    void loadTripDetail(String docid, TripModelImpl.OnLoadTripDetailListener listener);

}
