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
public class ErrorController
{
	@Autowired
	AuthService authService;

	@GetMapping("/error")
	public ModelAndView getLogin()
	{
		return new ModelAndView("error", "message", "arriba");
	}
}