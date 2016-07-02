package cn.qingtianr.service.serviceImp;

import cn.qingtianr.dao.NodeMapper;
import cn.qingtianr.pojo.Node;
import cn.qingtianr.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by jack on 16-7-2.
 */
@Service
public class NodeServiceImp implements NodeService{

    @Autowired
    NodeMapper nodemapper;

    public ArrayList<Node> showAllNodes() {
        return nodemapper.showAllNodes();
    }
}
