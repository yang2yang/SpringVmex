package cn.qingtianr.dao;

import cn.qingtianr.pojo.Person;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by jack on 16-5-28.
 */
public interface PersonMapper {

    @Insert("insert into person(username,password,money,person_atten,person_theme,person_node) values(#{username},#{password},#{money},#{person_atten},#{person_theme},#{person_node})")
    int addPerson(Person person);
}
