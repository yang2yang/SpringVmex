package cn.qingtianr.service;

import cn.qingtianr.pojo.Theme;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-30.
 */
public interface ThemeService {
    /**
     * 取出来所有的主题
     * @return
     */
    public ArrayList<Theme> showAllTheme();
}
