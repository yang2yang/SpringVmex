package cn.qingtianr.service;

import cn.qingtianr.pojo.Reply;
import cn.qingtianr.pojo.Theme;

import java.lang.reflect.Array;
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

    /**
     * 根据theme的id返回一个theme
     * @param id theme的id
     * @return
     */
    public Theme findThemeById(int id);

    public ArrayList<Reply> findThemeReplys(int id);
}
