package himywayplay.com.mywaytrip.trip.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;

import org.kymjs.kjframe.ui.BindView;

import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.main.widget.MainActivity;
import himywayplay.com.mywaytrip.trip.TripAdapter;
import himywayplay.com.mywaytrip.ui.fragment.BaseFragment;

/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public class OutFragment extends BaseFragment {
    Activity aty;
    @BindView(id = R.id.rl_out_line)
    private RecyclerView rl_out_line;
    private TripAdapter tripAdapter;
    private LinearLayoutManager mLayoutManager;



    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = (MainActivity) getActivity();
        return View.inflate(aty, R.layout.fragment_out, null);
    }

    @Override
    protected void initWidget(View parentView) {
        super.initWidget(parentView);

        rl_out_line.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        rl_out_line.setLayoutManager(mLayoutManager);
        RecyclerViewHeader header = (RecyclerViewHeader) parentView.findViewById(R.id.long_header);
        header.attachTo(rl_out_line, true);
        rl_out_line.setItemAnimator(new DefaultItemAnimator());
        tripAdapter = new TripAdapter(getActivity().getApplicationContext());
        rl_out_line.setAdapter(tripAdapter);

    }
}
