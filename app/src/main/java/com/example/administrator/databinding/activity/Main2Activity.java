package com.example.administrator.databinding.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.databinding.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }
    private void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.name.set("wu");
            user.age.set(i);
            users.add(user);
        }
        SecondAdapter adapter = new SecondAdapter(users, this);
        recyclerView.setAdapter(adapter);
    }

}
