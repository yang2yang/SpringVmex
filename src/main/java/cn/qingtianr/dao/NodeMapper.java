package cn.qingtianr.dao;

import cn.qingtianr.pojo.Node;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by jack on 16-7-2.
 */
@Repository
public interface NodeMapper {

    @Select("select * from node")
    public ArrayList<Node> showAllNodes();

}
