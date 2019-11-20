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

//@RestController是@ResponseBody和@Controller的组合注解。
//SpringMVC认为包下用了@controller注解的类是控制器
@Controller
@RequestMapping("/login") //url地址映射 @RequestMapping此注解即可以作用在控制器的某个方法上，也可以作用在此控制器类上。
public class LoginController{
	@Autowired
	private LoginService loginService;

	/**
	 * 返回json
	 *
	 * @param login
	 * @return
	 * @RequestMapping作用在类级别和处理器方法上 url:url=localhost:8080/login/toLogin
	 */
	@RequestMapping(value = "/toLogin", method = RequestMethod.POST)
	public ModelAndView toLogin (@RequestBody User login){

		System.out.println("login : " + login.getUsername() + " " + login.getPassword());

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

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login (String username,String password){
		User user = loginService.selectUser(username,password);
		if(user == null){
			return "erro";
		}
		if(user.getUsername().equals(username) && user.getPassword().equals(password)){
			return "/manager/student";
		}else{
			return "用户名或者密码不匹配，请重新检查登录";
		}
	}

	/**
	 * 注册账号
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String insertUser (User user){
		int size = loginService.insertUser(user);
		if(size > 0){
			return "redirect:login";
		}
		return "注册失败";
	}

}
