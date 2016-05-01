package himywayplay.com.mywaytrip.main.widget;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;

import org.kymjs.kjframe.ui.BindView;

import java.util.List;

import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.commons.Data;
import himywayplay.com.mywaytrip.mine.widget.MineFragment;
import himywayplay.com.mywaytrip.news.widget.NewsFragment;
import himywayplay.com.mywaytrip.trip.widget.LongFragment;
import himywayplay.com.mywaytrip.trip.widget.MainFragment;
import himywayplay.com.mywaytrip.trip.widget.OutFragment;
import himywayplay.com.mywaytrip.trip.widget.TripLineFragment;
import himywayplay.com.mywaytrip.ui.BaseActivity;
import himywayplay.com.mywaytrip.ui.fragment.BaseFragment;
import himywayplay.com.mywaytrip.util.LogUtils;

public class MainActivity extends BaseActivity implements BackHandledInterface {

    @BindView(id = R.id.bottombar_main, click = true)
    private RadioButton rb_main;
    @BindView(id = R.id.bottombar_long, click = true)
    private RadioButton rb_long;
    @BindView(id = R.id.bottombar_out, click = true)
    private RadioButton rb_out;
    @BindView(id = R.id.bottombar_news, click = true)
    private RadioButton rb_news;
    @BindView(id = R.id.bottombar_mine, click = true)
    private RadioButton rb_mine;
    private BaseFragment currentFragment;
    private BaseFragment mainFragment;
    private BaseFragment longFragment;
    private BaseFragment outFragment;
    private BaseFragment newsFragment;
    private BaseFragment mineFragment;
    private BaseFragment tripFragment;
    public static List<Data> list;
    private static final String TAG = "MainActivity";

    private static MainActivity mInstance;

    @SuppressLint("InlinedApi")

    public static MainActivity getInstance() {
        if (mInstance == null) {
            mInstance = new MainActivity();
        }
        return mInstance;
    }

    @Override
    public void setRootView() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
//        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//        //    window.setNavigationBarColor(Color.TRANSPARENT);
//        }
        setContentView(R.layout.activity_main);
        Log.i(TAG, "创建Activity");
    }

    @Override
    public void initWidget() {
        super.initWidget();
        changeFragment(mainFragment);

    }

    public void initData() {
        super.initData();
        mainFragment = new MainFragment();
        longFragment = new LongFragment();
        outFragment = new OutFragment();
        newsFragment = new NewsFragment();
        mineFragment = new MineFragment();
        tripFragment = new TripLineFragment();
    }

    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);

        switch (v.getId()) {
            case R.id.bottombar_main:
                Log.i("------------", "菜单到了1");
                changeFragment(mainFragment);
                break;
            case R.id.bottombar_long:
                Log.i("------------", "菜单点到了2");
                changeFragment(longFragment);
                break;
            case R.id.bottombar_out:
                Log.i("------------", "菜店点到了3");
                changeFragment(outFragment);
                break;
            case R.id.bottombar_news:
                changeFragment(newsFragment);
                break;
            case R.id.bottombar_mine:
                changeFragment(mineFragment);
                break;
            default:
                break;
        }
    }


    public void changeFragment(BaseFragment targetFragment) {
        currentFragment = targetFragment;

        super.changeFragment(R.id.main_content, targetFragment);
    }

    @Override
    public void setSelectedFragment(BaseFragment selectedFragment) {
        this.currentFragment = selectedFragment;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        LogUtils.i(TAG,currentFragment.toString());
    }

}
