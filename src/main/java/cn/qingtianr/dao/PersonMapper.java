package cn.qingtianr.dao;

import cn.qingtianr.pojo.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by jack on 16-5-28.
 */

@Repository
public interface PersonMapper {

    @Insert("insert into person(username,password,money,person_atten,person_theme,person_node) values(#{username},#{password},#{money},#{person_atten},#{person_theme},#{person_node})")
    int addPerson(Person person);

    @Select("select * from person where username=#{username}")
    Person findPersonByName(Person person);
}
