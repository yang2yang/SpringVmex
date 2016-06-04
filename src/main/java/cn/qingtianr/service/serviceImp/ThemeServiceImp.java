package cn.qingtianr.service.serviceImp;

import cn.qingtianr.dao.ThemeMapper;
import cn.qingtianr.pojo.Reply;
import cn.qingtianr.pojo.Theme;
import cn.qingtianr.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-30.
 */

@Service
public class ThemeServiceImp implements ThemeService {

    @Autowired
    ThemeMapper thememapper;

    @Override
    public ArrayList<Theme> showAllTheme(){
        ArrayList<Theme> themes = thememapper.showAllTheme();
        return themes;
    }

    @Override
    public Theme findThemeById(int id) {
        return thememapper.findThemeById(id);
    }

    @Override
    public ArrayList<Reply> findThemeReplys(int id) {
        return thememapper.findThemeReplys(id);
    }
}
