package dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.emp.emp;

import jdbctool.jdbctool;

public class empdao {
	public List show() {
		Connection conn = jdbctool.conn();
		Statement st = null;
		ResultSet rs = null;
		List<emp> list = new ArrayList<>();
		try {
			st = conn.createStatement();
			String sql = "select * from emp";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				emp emp = new emp(rs.getInt("id"), rs.getDouble("salary"), rs.getString("name"));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbctool.close(conn, st,rs);
		}
		return list;
	}
	
	
	
public int add(emp emp) {
	Connection conn = jdbctool.conn();
	Statement st = null;
	int c = 0;
	List<emp> list = new ArrayList<>();
	try {
		st = conn.createStatement();
		String sql = "insert into emp values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+")";
		c = st.executeUpdate(sql);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		jdbctool.close(conn, st);
	}
	return c;
}


public int delete(int id) {
	Connection conn = jdbctool.conn();
	Statement st = null;
	int c = 0;
	List<emp> list = new ArrayList<>();
	try {
		st = conn.createStatement();
		String sql = "delete from emp where id ="+id;
		c = st.executeUpdate(sql);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		jdbctool.close(conn, st);
	}
	return c;
}


public int update(emp emp) {
	Connection conn = jdbctool.conn();
	Statement st = null;
	int c = 0;
	int id = emp.getId();
	List<emp> list = new ArrayList<>();
	try {
		st = conn.createStatement();
		String sql = "update emp set name ='"+emp.getName()+"',salary = "+emp.getSalary()+" where id ="+id;
		c = st.executeUpdate(sql);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		jdbctool.close(conn, st);
	}
	return c;
}


public boolean isUserRepeat(String user) {
	boolean cc = true;
	Connection conn = jdbctool.conn();
	PreparedStatement prepareStatement = null;
	ResultSet executeQuery = null;
	String sqlcx = "select user from user where user = ?";
	try {
		prepareStatement = conn.prepareStatement(sqlcx);
		prepareStatement.setString(1, user);
		executeQuery = prepareStatement.executeQuery();
		if (executeQuery.next()) {
			cc = false;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		//jdbctool.close(conn, prepareStatement, executeQuery);
	}
	return cc;
}

public int registereUser(String user,String psw) {
	Connection conn = jdbctool.conn();
	String sql = "insert into user(user,psw) values(?,?)";
	PreparedStatement prepareStatement = null;
	int cc = 0;
	try {
		if (isUserRepeat(user)) {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user);
			prepareStatement.setString(2, psw);
			int c = prepareStatement.executeUpdate();
			if (c>0) {
				cc = 1;
			}
		}else {
			cc = -1;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		//jdbctool.close(conn, prepareStatement);
	}
	return cc;
}
}
