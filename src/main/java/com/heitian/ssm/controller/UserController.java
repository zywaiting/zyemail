package com.heitian.ssm.controller;

import com.heitian.ssm.model.SearchItem;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.SearchIteamService;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Timer;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @Resource
    private SearchIteamService searchIteamService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @RequestMapping("/showIteam")
    public String showIteam(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<SearchItem> itemList = searchIteamService.getAllIteam();
        model.addAttribute("itemList",itemList);
        return "showUser";
    }
}
