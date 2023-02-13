package org.meteor.autoclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 判断是否有悬浮窗权限
        boolean canDrawOverlays = Settings.canDrawOverlays(this);
        if(!canDrawOverlays){

        }
    }
}