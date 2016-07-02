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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPerson_atten() {
        return person_atten;
    }

    public void setPerson_atten(int person_atten) {
        this.person_atten = person_atten;
    }

    public int getPerson_theme() {
        return person_theme;
    }

    public void setPerson_theme(int person_theme) {
        this.person_theme = person_theme;
    }

    public int getPerson_node() {
        return person_node;
    }

    public void setPerson_node(int person_node) {
        this.person_node = person_node;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
