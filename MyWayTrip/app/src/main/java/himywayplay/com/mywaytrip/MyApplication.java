package himywayplay.com.mywaytrip;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public class MyApplication extends Application {
    public static int TRIP_TAG = 0;
    public static String TRIP_TAG_S = "亲子之旅";

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext());
    }

    public static String getTag() {
        switch (TRIP_TAG) {
            case 1:
                TRIP_TAG_S = "亲子之旅";
                break;
            case 2:
                TRIP_TAG_S = "摄影之旅";
                break;
            case 3:
                TRIP_TAG_S = "祈福之旅";
                break;
            case 4:
                TRIP_TAG_S = "交友之旅";
                break;
            case 5:
                TRIP_TAG_S = "养生之旅";
                break;
            case 7:
                TRIP_TAG_S = "川藏线";
                break;
            case 8:
                TRIP_TAG_S = "西北线";
                break;
            case 9:
                TRIP_TAG_S = "东北线";
                break;
            case 10:
                TRIP_TAG_S = "西南线";
                break;
            case 11:
                TRIP_TAG_S = "华中线";
                break;
            case 12:
                TRIP_TAG_S = "华南线";
                break;
        }
        return TRIP_TAG_S;
    }
}
