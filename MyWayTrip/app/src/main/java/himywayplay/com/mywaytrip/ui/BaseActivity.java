package himywayplay.com.mywaytrip.ui;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import org.kymjs.kjframe.KJActivity;


/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public abstract class BaseActivity extends KJActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
    }


}
