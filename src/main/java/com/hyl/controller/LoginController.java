package com.hyl.controller;

import com.hyl.pojo.User;
import com.hyl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/login")
public class LoginController {
   @Autowired
   private LoginService loginService;
    /**
     * 返回json
     * @param login
     * @return
     */
    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    public ModelAndView toLogin(@RequestBody User login){

        System.out.println("login : "+login.getUsername() + " " + login.getPassword());

        ModelAndView mv = new ModelAndView();

        if("admin".equals(login.getUsername()) && "admin".equals(login.getPassword())){
            String url = "/manager/student";
            mv.addObject("url",url);
        }else{
            String failure = "登录失败";
            mv.addObject("login",failure);
        }

        mv.setView(new MappingJackson2JsonView());
        return mv;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){
	    User user = loginService.selectUser(username,password);
	    if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
		    return "/manager/student";
	    }else {
	    	return "用户名或者密码不匹配，请重新检查登录";
	    }
    }
}
