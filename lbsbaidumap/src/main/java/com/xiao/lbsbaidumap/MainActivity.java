package com.xiao.lbsbaidumap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;
import com.unity3d.player.UnityPlayerActivity;

/**
 * Created by Gang on 2016/9/20.
 */
public class MainActivity extends UnityPlayerActivity
{

    private Context mContext = null;

    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);

        mContext = this;
        SDKInitializer.initialize(getApplicationContext());
    }

    public void OpenLBSMap()
    {
        Intent i = new Intent(MainActivity.this, LBSActivity.class);
        startActivity(i);
    }
}
