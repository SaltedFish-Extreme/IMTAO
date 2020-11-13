package com.imooc.tao.imtao.util;

import android.content.Context;
import android.widget.ImageView;

import com.imooc.tao.imtao.entity.Menu;
import com.imooc.tao.imtao.entity.MenuSub;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<ImageView> getHeaderAddInfo(Context context, int icons[]) {
        List<ImageView> datas = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }
        return datas;
    }

    //主菜单
    public static List<Menu> getMainMenus(int icons[], String names[]) {
        List<Menu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            Menu menu = new Menu(icons[i], names[i]);
            menus.add(menu);
        }
        return menus;
    }

    //副菜单
    public static List<MenuSub> getSubMenus(int icons[], String names[]) {
        List<MenuSub> menusubs = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            MenuSub menusub = new MenuSub(icons[i], names[i]);
            menusubs.add(menusub);
        }
        return menusubs;
    }
}
