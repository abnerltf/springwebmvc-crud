package io.github.abnerltf.springcrud.controllers;

import io.github.abnerltf.springcrud.services.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;

@Controller
public class LoginController
{
	@Autowired
	AuthService authService;

	@GetMapping("/login")
	public String getLogin()
	{
		return "login";
	}

	@PostMapping("/login")
	public String getHome(HttpServletRequest request)
	{
		try
		{
			if(this.authService.authenticate(request))
			{
				return "redirect:/home";
			} else {
				return "login";
			}
		} catch(SQLException exception) {
			return "redirect:/error";
		}
	}

	@GetMapping("/")
	public String getIndex()
	{
		return "redirect:/login";
	}
}