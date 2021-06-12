
package com.suraj.spring.mvcboot.hibernet;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	AlienRepo repo;	
	
	@RequestMapping("/")   // this maps to localhost:8080/
	public String home() {
		System.out.println("Home Page Requested");
		// return "index.jsp"; it will make page download the index.jsp
		//Tomcat Jasper needs to download to avoid from maven Repo paste in pom.xml
		return "index"; //as we are using suffix and spring.mvc.view.prefix in App Properties we don't write index.jsp 
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
	public String getAliens(ModelMap m) {
		//List<Alien> aliens = Arrays.asList(new Alien(101,"sairaj"),new Alien(102,"deepraj"),new Alien(103,"Patil"));
		m.addAttribute("aliens",repo.findAll());
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) { //to fetch Alien from aid
		List<Alien> alien = Arrays.asList(new Alien(101,"sairaj"),new Alien(102,"deepraj"),new Alien(103,"Patil"));
		m.addAttribute("alien", new Alien(aid,"Navin"));
		
		return "showAliens";
	}
	
	
}
