package com.imooc.tao.imtao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.imooc.tao.imtao.R;
import com.imooc.tao.imtao.entity.MenuSub;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubMenuAdapter extends RecyclerView.Adapter<SubMenuViewholder> {
    protected Context context;
    protected List<MenuSub> menusubs;

    public SubMenuAdapter(Context context, List<MenuSub> menus) {
        this.context = context;
        this.menusubs = menus;
    }

    @NonNull
    @Override
    public SubMenuViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SubMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_sub_menu, null));
    }

    @Override
    public void onBindViewHolder(@NonNull SubMenuViewholder holder, int position) {
        MenuSub menusub = menusubs.get(position);
        holder.mImgMenuIconView.setImageResource(menusub.icon);
        holder.mTextMenuName.setText(menusub.menuName);
    }

    @Override
    public int getItemCount() {
        return null != menusubs ? menusubs.size() : 0;
    }
}

class SubMenuViewholder extends RecyclerView.ViewHolder {
    public ImageView mImgMenuIconView;
    public TextView mTextMenuName;

    public SubMenuViewholder(@NonNull View itemView) {
        super(itemView);
        mImgMenuIconView = itemView.findViewById(R.id.img_menu_icon);
        mTextMenuName = itemView.findViewById(R.id.txt_menu_name);
    }
}
