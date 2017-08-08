package com.rk1635.dw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping()
	public String hello(ModelMap model){
		model.addAttribute("msg","这是一个信息！");
		return "hello";
	}
	
	@RequestMapping("/form")
	public String showForm(@RequestAttribute("name")String name,ModelMap model){
		model.addAttribute("name",name);		
		return "showForm";
	}
}
