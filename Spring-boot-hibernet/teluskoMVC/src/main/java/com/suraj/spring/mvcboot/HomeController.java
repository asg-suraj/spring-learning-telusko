
package com.suraj.spring.mvcboot;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.suraj.springmvcboot.model.Alien;

@Controller    //specified by Spring Boot
public class HomeController {
	
	@ModelAttribute      // what it does is before calling any RequestMapping it create Model object
	public void modelData(Model m) {
		m.addAttribute("name","Pitashri"); // and we assign attribute to that object

	}
		
	
	@RequestMapping("/")   // this maps to localhost:8080/
	public String home() {
		System.out.println("Home Page Requested");
		// return "index.jsp"; it will make page download the index.jsp
		//Tomcat Jasper needs to download to avoid from maven Repo paste in pom.xml
		return "index"; //as we are using suffix and spring.mvc.view.prefix in App Properties we don't write index.jsp 
	}
	
	@RequestMapping("/add")
	public ModelAndView /* String */ addNum(/*HttpServletRequest req*/ @RequestParam("num1") int num1 , @RequestParam("num2") int num2 )
	{
	/*	
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1+num2;
		HttpSession session = req.getSession();
		
		This code can be used but by using @RequestParam we can simplify things in Spring-boot
		
		*/
		System.out.println("came to add page");
		int sum =num1+num2; //this became much Simpler due to this @Request paramters
		//session.setAttribute("sum", sum); //instead of session we will use model
		ModelAndView mv = new ModelAndView(); //this has power to store both view and Data and pass on
		mv.setViewName("result"); //as we are using suffix and spring.mvc.view.prefix in App Properties we don't write result.jsp
		mv.addObject("sum",sum); //same work as setAttribute
		//return "result.jsp"; //we do this using ModelAndView and due to this return object
		return mv;
		
		
	}
	
	
	
	//we can write in this fashion also and it still works
	@RequestMapping("sub")
	public String sub(@RequestParam("num1") int num1 ,@RequestParam("num2") int num2 , Model m ) { //model inside parameters
		int sub = num1-num2;
		m.addAttribute("sub",sub);
		return "sub";
		//We can also use ModelMap instead of Model
	}
	
	@RequestMapping("addAliens")  //here we may also use @PostMapping or @GetMapping also
	public String addAlien(/*@RequestParam("aId") int aid,@RequestParam("aName") String  aname*/ @ModelAttribute Alien alien /* , Model m */) {
		
//		Alien alien = new Alien();
//		alien.setaId(aid);
//		alien.setaName(aname);
//		m.addAttribute("alien",alien); //use @ModelAttirbute and it works like miracle
		//Even we don't have to use Model m  also @ModelAttirbute("") will also accept parameter and will do assign ref to it
		return "result";
	}
	
	@GetMapping("getAliens")
	public String getAlien(ModelMap m) {
		List<Alien> aliens = Arrays.asList(new Alien(101,"sairaj"),new Alien(102,"deepraj"),new Alien(103,"Patil"));
		m.addAttribute("aliens",aliens);
		return "showAliens";
	}
	
	
}
