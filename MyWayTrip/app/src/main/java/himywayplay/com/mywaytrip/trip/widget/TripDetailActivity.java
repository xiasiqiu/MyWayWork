package himywayplay.com.mywaytrip.trip.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import himywayplay.com.mywaytrip.R;

/**
 * Created by f.x on 2016/4/27.
 * Email:xiasiqiu@gmail.com
 */
public class TripDetailActivity extends Activity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripdetail);
        webView= (WebView) findViewById(R.id.webview);
        WebSettings settings = webView.getSettings();
        // 设置WebView属性，能够执行Javascript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);//不加上，会显示白边
        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();
        // 加载需要显示的网页
        webView.loadUrl(bundle.getString("url"));
    }


}
