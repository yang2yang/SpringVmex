package cn.qingtianr.pojo;

import java.sql.Date;
import java.time.DateTimeException;

/**
 * Created by jack on 16-5-27.
 */
public class Theme {
    private int theme_id;
    private int theme_f_id;
    private String node;
    private String theme_title;
    private String theme_content;
    private int theme_click_count;
    private Date theme_date;
    private int theme_reply_count;

    public String getTheme_title() {
        return theme_title;
    }

    public void setTheme_title(String theme_title) {
        this.theme_title = theme_title;
    }

    public String getTheme_content() {
        return theme_content;
    }

    public void setTheme_content(String theme_content) {
        this.theme_content = theme_content;
    }
}
