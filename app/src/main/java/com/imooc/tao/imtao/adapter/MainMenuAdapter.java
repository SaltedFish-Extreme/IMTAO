package com.imooc.tao.imtao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.imooc.tao.imtao.R;
import com.imooc.tao.imtao.entity.Menu;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewholder> {
    protected Context context;
    protected List<Menu> menus;

    public MainMenuAdapter(Context context, List<Menu> menus) {
        this.context = context;
        this.menus = menus;
    }

    @NonNull
    @Override
    public MainMenuViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewholder holder, int position) {
        Menu menu = menus.get(position);
        holder.mImgMenuIconView.setImageResource(menu.icon);
        holder.mTextMenuName.setText(menu.menuName);
    }

    @Override
    public int getItemCount() {
        return null != menus ? menus.size() : 0;
    }
}

class MainMenuViewholder extends RecyclerView.ViewHolder {
    public ImageView mImgMenuIconView;
    public TextView mTextMenuName;

    public MainMenuViewholder(@NonNull View itemView) {
        super(itemView);
        mImgMenuIconView = itemView.findViewById(R.id.img_menu_icon);
        mTextMenuName = itemView.findViewById(R.id.txt_menu_name);
    }
}
