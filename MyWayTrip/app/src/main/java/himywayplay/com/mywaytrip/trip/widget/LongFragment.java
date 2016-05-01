package himywayplay.com.mywaytrip.trip.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.bigkoo.convenientbanner.CBViewHolderCreator;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import org.kymjs.kjframe.ui.BindView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import himywayplay.com.mywaytrip.MyApplication;
import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.adapter.NetworkImageHolderView;
import himywayplay.com.mywaytrip.main.widget.MainActivity;
import himywayplay.com.mywaytrip.trip.TripAdapter;
import himywayplay.com.mywaytrip.ui.fragment.BaseFragment;

/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public class LongFragment extends BaseFragment {
    MainActivity aty;
    @BindView(id = R.id.banner)
    private ConvenientBanner convenientBanner;//顶部广告栏控件
    @BindView(id = R.id.find_plugin_1, click = true)
    private TextView tv_parent_child;
    @BindView(id = R.id.find_plugin_2, click = true)
    private TextView tv_camera;
    @BindView(id = R.id.find_plugin_3, click = true)
    private TextView tv_pray;
    @BindView(id = R.id.find_plugin_4, click = true)
    private TextView tv_friend;
    @BindView(id = R.id.find_plugin_5, click = true)
    private TextView tv_heath;

    @BindView(id = R.id.rl_long_line)
    private RecyclerView rl_long_line;

    private TripAdapter tripAdapter;
    private static final String TAG = "----LongFragment---";
    private MyApplication myApplication;
    private List<String> netWorkImages = new ArrayList<String>();
    private String[] images = {"http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccda836990.png",
            "http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccdf64284c.png",
            "http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fce124b8c63.png",
            "http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fceea868aa6.png",
    };
    private LinearLayoutManager mLayoutManager;

    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = (MainActivity) getActivity();
        Log.i("------------", "到了");
        return View.inflate(aty, R.layout.fragment_long, null);
    }

    @Override
    protected void initWidget(View parentView) {
        super.initWidget(parentView);
        netWorkImages = Arrays.asList(images);
        convenientBanner.setPages(
                new CBViewHolderCreator<NetworkImageHolderView>() {
                    @Override
                    public NetworkImageHolderView createHolder() {
                        return new NetworkImageHolderView();
                    }
                }, netWorkImages)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused})
                //设置翻页的效果，不需要翻页效果可用不设
                .setPageTransformer(ConvenientBanner.Transformer.RotateUpTransformer);

        rl_long_line.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        rl_long_line.setLayoutManager(mLayoutManager);
        RecyclerViewHeader header = (RecyclerViewHeader) parentView.findViewById(R.id.long_header);
        header.attachTo(rl_long_line, true);
        rl_long_line.setItemAnimator(new DefaultItemAnimator());
        tripAdapter = new TripAdapter(getActivity().getApplicationContext());
        rl_long_line.setAdapter(tripAdapter);
    }

    @Override
    protected void initData() {
        super.initData();
    }


    @Override
    protected void widgetClick(View v) {

        super.widgetClick(v);
        switch (v.getId()) {
            case R.id.find_plugin_1:
                Log.i(TAG, "点击了!!!!!!!!!!!");
                myApplication.TRIP_TAG = 7;
                aty.changeFragment(new TripLineFragment());
                break;
            case R.id.find_plugin_2:
                myApplication.TRIP_TAG = 8;
                aty.changeFragment(new TripLineFragment());
                break;
            case R.id.find_plugin_3:
                myApplication.TRIP_TAG = 9;
                aty.changeFragment(new TripLineFragment());
                break;
            case R.id.find_plugin_4:
                myApplication.TRIP_TAG = 10;
                aty.changeFragment(new TripLineFragment());
                break;
            case R.id.find_plugin_5:
                myApplication.TRIP_TAG = 11;
                aty.changeFragment(new TripLineFragment());
                break;
            case R.id.find_plugin_6:
                myApplication.TRIP_TAG = 12;
                aty.changeFragment(new TripLineFragment());
                break;
        }

    }


    // 开始自动翻页
    @Override
    public void onResume() {
        super.onResume();
        //开始自动翻页
        convenientBanner.startTurning(5000);
    }

    // 停止自动翻页
    @Override
    public void onPause() {
        super.onPause();
        //停止翻页
        convenientBanner.stopTurning();
    }
}
