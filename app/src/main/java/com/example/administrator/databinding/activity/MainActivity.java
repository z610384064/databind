package com.example.administrator.databinding.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.databinding.R;

import com.example.administrator.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        com.example.administrator.databinding.bean.User user=new com.example.administrator.databinding.bean.User("周文财","26","4250");
        com.example.administrator.databinding.test.User user1=new com.example.administrator.databinding.test.User("林爱林","25");
        activityMainBinding.setUser(user);
        activityMainBinding.setUser2(user1);
    }
}
