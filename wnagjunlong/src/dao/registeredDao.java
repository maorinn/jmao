package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctool.jdbctool;

public class registeredDao {
	public int registered(String user,String psw) {
		Connection conn = null;
		ResultSet executeQuery = null;
		Statement createStatement = null;
		PreparedStatement prepareStatement = null;
		int d = -1;
		try {
			conn = jdbctool.conn();
			
			String sqlcx = "select user from user where user = "+user;
			String sql = "insert into user(user,psw) values(?,?)";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user);
			prepareStatement.setString(2, psw);
			executeQuery = createStatement.executeQuery(sqlcx);
			if (!executeQuery.next()) {
					int executeUpdate = prepareStatement.executeUpdate();
					if (executeUpdate!=0) {
						d = 1; 
					}
			}else {
				d = 0;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbctool.close(conn, createStatement, executeQuery);
		}
		return d;
	}
}
