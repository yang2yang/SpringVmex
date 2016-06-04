package cn.qingtianr.dao;

import cn.qingtianr.pojo.Reply;
import cn.qingtianr.pojo.Theme;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-30.
 */

@Repository
public interface ThemeMapper {
    /**
     * 返回所有的主题
     * @return
     */
    @Select("select * from theme")
    public ArrayList<Theme> showAllTheme();

    /**
     * 通过id找到theme(为什么mybatis这里可以直接引用对象里面的东西呀？？)
     * @return
     */
    @Select("select * from theme where theme_id=#{id}")
    public Theme findThemeById(int id);

    /**
     * 通过theme的id找到相应的回复
     * @param id
     * @return
     */
    @Select("select reply_person_username,reply_date,reply_content from (select * from reply,theme where reply.reply_theme_id=theme.theme_id) as sb where sb.theme_id=#{id}")
    public ArrayList<Reply> findThemeReplys(int id);
}
