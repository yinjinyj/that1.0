package com.yj.that_plugin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BasePluginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_plugin);
    }
}