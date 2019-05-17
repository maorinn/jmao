package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctool.jdbctool;

public class loginDao {
	public boolean isLogon(String user,String psw) {
		boolean d = false;
		Connection conn = null;
		ResultSet executeQuery = null;
		Statement createStatement = null;
		try {
			conn = jdbctool.conn();
			createStatement = conn.createStatement();
			String sql = "select email,password from user where email=? and password=?";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user);
			prepareStatement.setString(2, psw);
			executeQuery = prepareStatement.executeQuery();
			if (executeQuery.next()) {
				d = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
}
