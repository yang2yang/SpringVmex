package cn.qingtianr.service;


import cn.qingtianr.pojo.Person;

public interface PersonService{

    /**
     * 通过用户名查找是否含有该用户
     * @param pserson Person的模型
     * @return 真或者假
     */
    public boolean findPersonByName(Person pserson);

    /**
     * 增加一个Person
     * @param person
     * @return
     */
    public boolean addPerson(Person person);
}