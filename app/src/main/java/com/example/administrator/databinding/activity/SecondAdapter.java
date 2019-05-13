package com.example.administrator.databinding.activity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.databinding.R;
import com.example.administrator.databinding.databinding.ItemSecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter {

    private List<User> users;
    private Context context;

    public SecondAdapter(List<User> users, Context context) {
        if(this.users == null){
            this.users = new ArrayList<>();
        }
        this.users = users;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ItemSecondBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_second, parent, false);
        return new MyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemSecondBinding binding = DataBindingUtil.getBinding(holder.itemView);
        binding.setUser(users.get(position));
        binding.executePendingBindings();
    }


    @Override
    public int getItemCount() {
        return users.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

}

