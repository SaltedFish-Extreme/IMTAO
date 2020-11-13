package com.imooc.tao.imtao.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imooc.tao.imtao.R;
import com.imooc.tao.imtao.adapter.MainHeaderAdAdapter;
import com.imooc.tao.imtao.adapter.MainMenuAdapter;
import com.imooc.tao.imtao.adapter.SubMenuAdapter;
import com.imooc.tao.imtao.util.DataUtil;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

//主界面视图
public class MainFragment extends Fragment {

    protected ViewPager mVPagerHeaderAd;//广告头
    protected int[] icons = {R.mipmap.header_pic_ad1, R.mipmap.header_pic_ad2, R.mipmap.header_pic_ad1, R.mipmap.header_pic_ad2};//广告轮播图
    protected int[] menuIcons = {R.mipmap.menu_airport, R.mipmap.menu_car, R.mipmap.menu_train, R.mipmap.menu_ticket, R.mipmap.menu_nearby, R.mipmap.menu_trav, R.mipmap.menu_hatol, R.mipmap.menu_course};//菜单图标
    protected int[] menuSubIcons = {R.mipmap.menu_second_airport, R.mipmap.menu_second_ticket, R.mipmap.menu_second_quan, R.mipmap.menu_second_play, R.mipmap.menu_second_service, R.mipmap.menu_second_wifi};//副菜单图标
    String[] menus;
    String[] submenus;
    protected RecyclerView mRecyclerViewMenu;//主菜单
    protected RecyclerView mRecyclerViewSubMenu;//副菜单

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mVPagerHeaderAd = Objects.requireNonNull(getView()).findViewById(R.id.vpager_main_header_ad);
        menus = this.getActivity().getResources().getStringArray(R.array.main_menu);
        submenus = this.getActivity().getResources().getStringArray(R.array.sub_menu);
        mRecyclerViewMenu = getView().findViewById(R.id.recycleview_main_menu);
        mRecyclerViewSubMenu = getView().findViewById(R.id.recycleview_sub_menu);
        MainHeaderAdAdapter adAdapter = new MainHeaderAdAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(), icons));
        mVPagerHeaderAd.setAdapter(adAdapter);
        //菜单
        //布局样式
        mRecyclerViewMenu.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        mRecyclerViewSubMenu.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter(getActivity(), DataUtil.getMainMenus(menuIcons, menus));
        SubMenuAdapter subMenuAdapter = new SubMenuAdapter(getActivity(), DataUtil.getSubMenus(menuSubIcons, submenus));
        mRecyclerViewMenu.setAdapter(mainMenuAdapter);
        mRecyclerViewSubMenu.setAdapter(subMenuAdapter);
    }
}