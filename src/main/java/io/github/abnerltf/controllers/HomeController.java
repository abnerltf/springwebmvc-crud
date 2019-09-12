package io.github.abnerltf.springcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
/* https://stackoverflow.com/questions/21591383/do-i-need-to-check-for-valid-sessions-in-every-controller-in-spring */
@Controller
public class HomeController
{
	@GetMapping("/home")
	public ModelAndView getHome(HttpServletRequest req)
	{
		ModelAndView home = new ModelAndView("home");
		home.addObject("teste", req.getAttribute("teste"));
		return home;
	}
}