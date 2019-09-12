package io.github.abnerltf.springcrud.interceptors;
import io.github.abnerltf.springcrud.services.AuthService;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter
{
	@Autowired
	private AuthService authService;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
							Object handler) throws Exception
	{
		try{
			if( !(this.authService.isAuthenticated(request)) )
			{
				response.sendRedirect("login");
			}
		} catch(IOException exception) {
			response.getWriter().write("Um erro inesperado ocorreu");
		}

		return true;
	}
}