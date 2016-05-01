package himywayplay.com.mywaytrip.news.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.main.widget.MainActivity;
import himywayplay.com.mywaytrip.ui.fragment.BaseFragment;

/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public class NewsFragment extends BaseFragment {
    MainActivity aty;

    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

        aty = (MainActivity) getActivity();
        return View.inflate(aty, R.layout.fragment_news, null);
    }


}
