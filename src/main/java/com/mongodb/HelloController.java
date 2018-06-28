package com.mongodb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	 @RequestMapping("/hello")
	public  ModelAndView hellomongo(){
	     
		String message="I im trying to connect mongodb batabase";
		return new ModelAndView("hellomongodb"+"message"+message);
	}

}
