package cn.qingtianr.pojo;

/**
 * Created by jack on 16-5-27.
 */
public class Person {
    private int id;
    private String username;
    private String password;
    private int money;
    private int person_atten;
    private int person_theme;
    private int person_node;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
