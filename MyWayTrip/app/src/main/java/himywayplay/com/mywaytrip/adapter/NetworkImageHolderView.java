package himywayplay.com.mywaytrip.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.bigkoo.convenientbanner.CBPageAdapter;
import com.facebook.drawee.view.SimpleDraweeView;

import himywayplay.com.mywaytrip.R;


/**
 * Created by Sai on 15/8/4.
 * 网络图片加载例子
 */
public class NetworkImageHolderView implements CBPageAdapter.Holder<String> {

    private SimpleDraweeView simpleDraweeView;

    @Override
    public View createView(Context context) {
        //你可以通过layout文件来创建，也可以像我一样用代码创建，不一定是Image，任何控件都可以进行翻页
        simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setScaleType(SimpleDraweeView.ScaleType.FIT_XY);
        return simpleDraweeView;
    }

    @Override
    public void UpdateUI(Context context, final int position, String data) {

        simpleDraweeView.setImageResource(R.mipmap.ic_default_adimage);
        Uri uri = Uri.parse(data);
        simpleDraweeView.setImageURI(uri);
        simpleDraweeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "点击了第" + position + "个", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
