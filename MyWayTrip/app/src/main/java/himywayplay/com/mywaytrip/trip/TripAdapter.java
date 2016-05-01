package himywayplay.com.mywaytrip.trip;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import org.kymjs.kjframe.KJBitmap;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import himywayplay.com.mywaytrip.R;
import himywayplay.com.mywaytrip.commons.Data;
import himywayplay.com.mywaytrip.main.widget.MainActivity;
import himywayplay.com.mywaytrip.trip.widget.TripDetailActivity;

/**
 * Created by f.x on 2016/4/27.
 * Email:xiasiqiu@gmail.com
 */
public class TripAdapter extends RecyclerView.Adapter<TripAdapter.MyViewHolder> {

    private Context context;
    private final KJBitmap kjb = new KJBitmap();
    private List<Data> list;
    private static final String TAG = "TripAdapter";

    public TripAdapter(Context context) {
        this.context = context;
        init();
        Log.i(TAG, "创建Adapter" + list.toString());
    }


    @Override
    public TripAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_line, parent,
                false));

        return holder;
    }

    @Override
    public void onBindViewHolder(TripAdapter.MyViewHolder holder, final int position) {
        holder.tv_title.setText(list.get(position).getLine_title());
        holder.tv_content.setText(list.get(position).getLine_content().toString());
        kjb.display(holder.iv_bg, list.get(position).getLine_bg());
        Uri url = Uri.parse(list.get(position).getLine_bg());
        holder.iv_bg.setImageURI(url);
        holder.iv_bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TripDetailActivity.class);
                intent.putExtra("url", list.get(position).getDetail_url());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                context.startActivity(intent);
            }
        });
        Log.i(TAG, "content" + list.get(position).getLine_content().toString());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView iv_bg;
        TextView tv_title;
        TextView tv_content;


        public MyViewHolder(View itemView) {
            super(itemView);
            iv_bg = (SimpleDraweeView) itemView.findViewById(R.id.iv_line_img);
            tv_title = (TextView) itemView.findViewById(R.id.tv_line_title);
            tv_content = (TextView) itemView.findViewById(R.id.tv_line_content);
        }
    }

    private void init() {
        list = new ArrayList<Data>();
        Log.i(TAG, "开始获取数据");
        Data data1 = new Data();
        data1.setLine_bg("http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccda836990.png");
        data1.setLine_content("     观旧院镇十里画廊、品大巴山农家菜肴、漂龙潭河飞瀑流泉、享归真劳动体验。");
        data1.setLine_title("巴山第一漂、田园采桃李");
        data1.setDetail_url("http://www.himywayplay.com/index.php?s=/Home/goods/goods/goods_id/9.html");
        Data data2 = new Data();
        data2.setLine_bg("http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccdf64284c.png");
        data2.setLine_content("     阳春时节，正是品茗的好时候。游走在青山绿水间，徜徉于馨香氤氲的茶乡，和茶农们一起背着竹篓，在田园里体验一把摘茶乐。");
        data2.setLine_title("蒙顶山采茶制茶亲子自驾之旅");
        data2.setDetail_url("http://www.himywayplay.com/index.php?s=/Home/goods/goods/goods_id/10/category/4.html");
        Data data3 = new Data();
        data3.setLine_bg("http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccf177bbd3.png");
        data3.setLine_content("     全国第一家生态型的野生动物园，与野生动物零距离接触。");
        data3.setLine_title("白马泉•碧峰峡休闲亲子两日游");
        data3.setDetail_url("http://www.himywayplay.com/index.php?s=/Home/goods/goods/goods_id/16/category/4.html");
        Data data4 = new Data();
        data4.setLine_bg("http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fccf6714be0.png");
        data4.setLine_content("     观赏万亩梨花，感受激情阳光，体验汉源丰富多彩的农家风情。和风送暖，草木萌动，3月的汉源阳光灿烂，春意渐浓！");
        data4.setLine_title("砂器故里 贡椒之乡亲子自驾两日游");
        data4.setDetail_url("http://www.himywayplay.com/index.php?s=/Home/goods/goods/goods_id/17/category/4.html");
        Data data5 = new Data();
        data5.setLine_bg("http://www.himywayplay.com/Uploads/Picture/2016-03-31/56fce124b8c63.png");
        data5.setLine_content("     泸定铁索桥、新都桥、毛垭大草原、稻城、亚丁景区、冲古寺、卓玛拉错神湖、夏诺多吉神山、仙乃日神山、央迈勇神山");
        data5.setLine_title("金秋彩林稻城亚丁6日自驾游");
        data5.setDetail_url("http://www.himywayplay.com/index.php?s=/Home/goods/goods/goods_id/30.html");
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        list.add(data5);
    }

}
