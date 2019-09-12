package io.github.abnerltf.springcrud.services;

import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

@Service
public class AuthService
{
	private MysqlDataSource dataSource;

	public AuthService()
	{
		dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setPortNumber(3306);
		dataSource.setDatabaseName("sakila");
		dataSource.setUser("root");
		dataSource.setPassword("root");
	}

	public boolean authenticate(HttpServletRequest request) throws SQLException
	{
		Connection conn = this.dataSource.getConnection();
		PreparedStatement statement = conn.prepareStatement("SELECT * "+
														"FROM admin "+
														"WHERE login = ? "+
														"AND pass = ?");
		statement.setString(1, request.getParameter("login"));
		statement.setString(2, request.getParameter("pass"));
		statement.execute();

		ResultSet result = statement.getResultSet();
		result.last();

		if(result.getRow() >= 1)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("authenticated", true);
			return true;
		} else {
			return false;
		}
	}
}