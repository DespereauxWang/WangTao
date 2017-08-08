package com.rk1635.dw;

import java.util.List;

import javax.annotation.Resource;

import org.niit.com.bean.Info;
import org.niit.com.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	private DbService ds03;	
	
	@Resource
	public void setDbService(DbService ds03) {
		this.ds03 = ds03;
	}
	
	@RequestMapping()
	public String hello(ModelMap model){
		List<Info> infoList = ds03.getInfo(1);
			
		model.addAttribute("info",infoList.get(0));
		return "hello";
	}
	
	@RequestMapping("/form")
	public String showForm(@RequestAttribute("name")String name,ModelMap model){
		model.addAttribute("name",name);		
		return "showForm";
	}
}
