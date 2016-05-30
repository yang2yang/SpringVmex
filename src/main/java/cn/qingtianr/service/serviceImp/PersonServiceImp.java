package cn.qingtianr.service.serviceImp;

import cn.qingtianr.dao.PersonMapper;
import cn.qingtianr.pojo.Person;
import cn.qingtianr.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jack on 16-5-27.
 */
public class PersonServiceImp implements PersonService{

    @Autowired
    private PersonMapper personmapper;

    @Override
    public boolean findPersonByName(Person pserson) {
        return false;
    }

    @Override
    public boolean addPerson(Person person) {
        //这层是不是捕获一个异常比较好
        personmapper.addPerson(person);
        return false;
    }
}
