package dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Blob;

import jdbctool.jdbctool;

public class IsUser {

	public boolean IsUsers(String user,String oldpsw) {
		boolean cc = false;
		Connection conn = jdbctool.conn();
		String sql = "select UserName,Password from sys_user where UserName = ? and Password =?";
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user);
			prepareStatement.setString(2, oldpsw);
			ResultSet executeQuery = prepareStatement.executeQuery();
			if (executeQuery.next()) {
				cc = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cc;
	}
	
	
	public boolean IsNewpsw(String newpsw,String newpsws) {
		boolean cc = false;
		if (newpsw.equals(newpsws)) {
			cc = true;
		}
		
		return cc;
	}
}
