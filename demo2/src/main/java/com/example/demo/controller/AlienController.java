package com.example.demo.controller;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;

import com.example.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home1.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String home(Alien alien2) {
		
		repo.save(alien2);
		
		return "home1.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView home(@RequestParam int aId) {
		
		ModelAndView mv1 = new ModelAndView("showAlien.jsp");
		Alien alien1 = repo.findById(aId).orElse(new Alien());
		mv1.addObject(alien1);
		return mv1;
	}
}
*/