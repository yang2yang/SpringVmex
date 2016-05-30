package cn.qingtianr.controller;

import cn.qingtianr.pojo.Person;
import cn.qingtianr.pojo.Theme;
import cn.qingtianr.service.PersonService;
import cn.qingtianr.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-27.
 */

@Controller
public class HomeController {

    @Autowired
    PersonService personservice;

    @Autowired
    ThemeService themeservice;

    /**
     * 能够显示出来主页的信息
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        ArrayList<Theme> themes = themeservice.showAllTheme();
        model.addAttribute("themes",themes);
        return "home";
    }

    /**
     * 显示注册界面
     * @return
     */
    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String signup(){
        return "signup";
    }

    /**
     * 点击注册进行后台的逻辑代码
     * @param person
     * @param model
     * @return
     */
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public String checkSignup(@ModelAttribute Person person, Model model){
        System.out.println(person.getUsername() + person.getPassword());
        //todo 调用数据库后对Person表中添加一条记录，一个人
        personservice.addPerson(person);
        return "home";
    }

    /**
     * 点击一个主题后，返回一个主题
     * @param number 主题的主键
     * @param model 模型包含主题这个模型？
     * @return
     */
    @RequestMapping(value = "/t/{number}",method = RequestMethod.GET)
    public String showTheme(@PathVariable int number,Model model){
        return "theTheme";
    }

}
