package com.emp;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class test {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//jdbc连接mysql数据库步骤
		//1.导入mysql驱动jar包
		try {
			//2.注册一个driver驱动
			Class.forName("com.mysql.jdbc.Driver");
			//3.建立数据库连接对象
			//第一个参数url：代表你需要连接哪个ip地址上的mysql数据库，3306/数据库名
			//第二个参数user:代表你连接数据库的用户
			//第三个参数password：代表你连接数据库的密码
			//得到Connection对象（它代表数据库连接对象）
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123456");
			//4.通过Connection对象里面的createStatement方法Statement对象
			//Statement对象主要作用：给数据库发送sql指令，进行增删改查操作
			//5.编写sql语句，通过Statement对象发送sql指令
			st = conn.createStatement();
			String sql = "select * from emp";
			//通过Statement对象里面的executeQuery方法发送sql指令执行查询操作
			//得到一个ResultSet对象  ResultSet（结果集对象）
			rs = st.executeQuery(sql);
			//创建一个集合用来保存每一个员工对象
			List<emp> list = new ArrayList<>();
			//6.处理结果集
			//rs.next() 查询有没有下一行数据，如果有为true，无则为false
			while (rs.next()) {
				emp emp = new emp();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double sal = rs.getDouble("sal");
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(sal);
				
				for(emp emp2 : list){
					System.out.println(emp2);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
