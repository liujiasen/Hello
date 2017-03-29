package ssm.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.bean.User;
import ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String home(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@Valid User user){
		User user1=userService.queryUserByUnameAndPwd(user.getUserName(), user.getPassword());
		if (user1!=null) {
			return "index";
		}
		return "login";
	}
	

	
}
