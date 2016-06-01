package cn.qingtianr.pojo;

import java.sql.Date;

/**
 * Created by jack on 16-5-27.
 */
public class Reply {
    private int reply_id;
    private int reply_theme_id;
    private int reply_person_id;
    private String reply_person_username;
    private Date reply_date;
    private String reply_content;

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getReply_theme_id() {
        return reply_theme_id;
    }

    public void setReply_theme_id(int reply_theme_id) {
        this.reply_theme_id = reply_theme_id;
    }

    public int getReply_person_id() {
        return reply_person_id;
    }

    public void setReply_person_id(int reply_person_id) {
        this.reply_person_id = reply_person_id;
    }

    public String getReply_person_username() {
        return reply_person_username;
    }

    public void setReply_person_username(String reply_person_username) {
        this.reply_person_username = reply_person_username;
    }

    public Date getReply_date() {
        return reply_date;
    }

    public void setReply_date(Date reply_date) {
        this.reply_date = reply_date;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }
}
