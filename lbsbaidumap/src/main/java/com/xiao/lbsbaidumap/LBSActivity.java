package com.xiao.lbsbaidumap;

import android.app.Activity;
import android.os.Bundle;

import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapView;

public class LBSActivity extends Activity
{

    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mMapView = new MapView(this, new BaiduMapOptions());
        setContentView(R.layout.activity_lbs);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mMapView.onDestroy();
    }
}
