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

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public int getTheme_f_id() {
        return theme_f_id;
    }

    public void setTheme_f_id(int theme_f_id) {
        this.theme_f_id = theme_f_id;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public int getTheme_click_count() {
        return theme_click_count;
    }

    public void setTheme_click_count(int theme_click_count) {
        this.theme_click_count = theme_click_count;
    }

    public Date getTheme_date() {
        return theme_date;
    }

    public void setTheme_date(Date theme_date) {
        this.theme_date = theme_date;
    }

    public int getTheme_reply_count() {
        return theme_reply_count;
    }

    public void setTheme_reply_count(int theme_reply_count) {
        this.theme_reply_count = theme_reply_count;
    }
}
