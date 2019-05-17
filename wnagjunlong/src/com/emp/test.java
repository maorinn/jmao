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
		//jdbc����mysql���ݿⲽ��
		//1.����mysql����jar��
		try {
			//2.ע��һ��driver����
			Class.forName("com.mysql.jdbc.Driver");
			//3.�������ݿ����Ӷ���
			//��һ������url����������Ҫ�����ĸ�ip��ַ�ϵ�mysql���ݿ⣬3306/���ݿ���
			//�ڶ�������user:�������������ݿ���û�
			//����������password���������������ݿ������
			//�õ�Connection�������������ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123456");
			//4.ͨ��Connection���������createStatement����Statement����
			//Statement������Ҫ���ã������ݿⷢ��sqlָ�������ɾ�Ĳ����
			//5.��дsql��䣬ͨ��Statement������sqlָ��
			st = conn.createStatement();
			String sql = "select * from emp";
			//ͨ��Statement���������executeQuery��������sqlָ��ִ�в�ѯ����
			//�õ�һ��ResultSet����  ResultSet�����������
			rs = st.executeQuery(sql);
			//����һ��������������ÿһ��Ա������
			List<emp> list = new ArrayList<>();
			//6.���������
			//rs.next() ��ѯ��û����һ�����ݣ������Ϊtrue������Ϊfalse
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