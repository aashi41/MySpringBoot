package com.example.demo1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.entity.Employee;

@RestController
public class BaseController {
	
	@Autowired
	Employee emp;
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "tikkkkkk";
	}
	
	@RequestMapping("/empInfo")
	public Employee employeeInfo() {
		emp.setEid(1);
		emp.setEname("aish");
		return emp;
	}
	
	@RequestMapping("/home")
	public ModelAndView HomeJsp() {
		//return "home.jsp";//not working
		emp.setEid(1);
		emp.setEname("aishu");
		emp.setTown("puneee");
		return new ModelAndView("home","placeholder",emp);
	}
	
	
	  @RequestMapping("/emp")//http://localhost:8081/emp?ename=aish&id=3 public
	  ModelAndView empJsp(String ename, int id, HttpSession session) {
	  emp.setEname(ename); emp.setEid(id); //session.setAttribute("ename", ename);
	  return new ModelAndView("emp","placeholder",emp); //return new
	 // return new ModelAndView("emp","placeholder",ename);
	  }
	 
	
//	@RequestMapping("/emp")//http://localhost:8081/emp?eid=2&ename=shre&town=puna
//	public ModelAndView empObjJsp(Employee emp1) {
//		return new ModelAndView("emp","placeholder",emp1);//emp is jsp file
//	}
	
	
	
	

}

