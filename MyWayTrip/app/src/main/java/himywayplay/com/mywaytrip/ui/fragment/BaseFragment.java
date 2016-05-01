package himywayplay.com.mywaytrip.ui.fragment;

import android.app.Application;
import android.os.Bundle;
import android.view.KeyEvent;

import org.kymjs.kjframe.ui.KJFragment;

import java.util.ArrayList;
import java.util.List;

import himywayplay.com.mywaytrip.commons.Data;
import himywayplay.com.mywaytrip.main.widget.BackHandledInterface;
import himywayplay.com.mywaytrip.ui.BaseActivity;

/**
 * Created by f.x on 2016/4/13.
 * Email:xiasiqiu@gmail.com
 */
public abstract class BaseFragment extends KJFragment {
    protected Application app;
    protected BaseActivity outsideAty;
    protected BackHandledInterface mBackHandledInterface;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (getActivity() instanceof BaseActivity) {
            outsideAty = (BaseActivity) getActivity();
            this.mBackHandledInterface = (BackHandledInterface) getActivity();
        }
        app = (Application) getActivity().getApplication();
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        // 告诉FragmentActivity，当前Fragment在栈顶
        mBackHandledInterface.setSelectedFragment(this);
    }
}
