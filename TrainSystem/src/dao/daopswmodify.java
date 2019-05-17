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
public class daopswmodify {
	public boolean pswmodify(String user,String newpsw) {
		boolean cc = false;
		Connection conn = jdbctool.conn();
		String sql = "update sys_user set Password =? where UserName =?";
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, newpsw);
			prepareStatement.setString(2, user);
			int c = prepareStatement.executeUpdate();
			if (c>0) {
				cc = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cc;
		
	}
}
