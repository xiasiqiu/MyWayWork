package himywayplay.com.mywaytrip.trip.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;

import org.kymjs.kjframe.ui.BindView;

import himywayplay.com.mywaytrip.MyApplication;
import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.commons.Data;
import himywayplay.com.mywaytrip.main.widget.MainActivity;
import himywayplay.com.mywaytrip.trip.TripAdapter;
import himywayplay.com.mywaytrip.ui.fragment.BaseFragment;
import himywayplay.com.mywaytrip.util.LogUtils;

/**
 * Created by f.x on 2016/4/14.
 * Email:xiasiqiu@gmail.com
 */
public class TripLineFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {
    MainActivity aty;
    @BindView(id = R.id.tv_line_title)
    private TextView tv_line_title;
    @BindView(id = R.id.iv_back)
    private ImageView iv_back;
    @BindView(id = R.id.rl_trip_line)
    private RecyclerView recyclerView;
    private TripAdapter tripAdapter;
    private LinearLayoutManager mLayoutManager;
    private static final String TAG = "TripLineFragment";

    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = (MainActivity) getActivity();
        return View.inflate(aty, R.layout.fragment_trip_line, null);
    }

    @Override
    protected void initWidget(View parentView) {
        Log.i("TAG", "code" + MyApplication.TRIP_TAG_S);
        tv_line_title.setText(MyApplication.getTag());
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        tripAdapter = new TripAdapter(getActivity().getApplicationContext());
        recyclerView.setAdapter(tripAdapter);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aty.changeFragment(new MainFragment());
            }
        });
    }

    @Override
    public void onRefresh() {

    }


}
