package com.star.agile.assignment.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {


//@RequestMapping("/hello")
//@ResponseBody
//// Method
//public String helloWorld()
//{
//    // Print statement
//    return "Hello World!";
//}	


@RequestMapping("/")

	public String index() {
	    return "index.html";
	}


}
