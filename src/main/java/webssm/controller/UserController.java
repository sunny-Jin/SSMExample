package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import webssm.iService.IUserService;
import webssm.model.User;
import webssm.serviceImpl.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by jzy on 2017/5/19.
 */
@Controller
@RequestMapping("/user")
public class UserController {
 //   private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private IUserService userService;
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
    //    log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Map<String,Object> getAll(HttpServletRequest request)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        List<User> userList =userService.getAllUser();
        map.put("users",userList);
        return map;
    }


}
