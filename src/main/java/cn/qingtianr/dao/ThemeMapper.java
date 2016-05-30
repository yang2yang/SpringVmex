package cn.qingtianr.dao;

import cn.qingtianr.pojo.Theme;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-30.
 */
public interface ThemeMapper {
    @Select("select * from theme")
    public ArrayList<Theme> showAllTheme();
}
