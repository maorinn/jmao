package dao;

import java.util.*;

import com.emp.emp;

public class test {
	public static void main(String[] args) {
		empdao empdao = new empdao();
		List list = empdao.show();
		for (Object c : list) {
			System.out.println(c);
		}
		
		
		emp emp = new emp(18, 8888.00, "张11伟");
		int c = empdao.add(emp);
		if (c!=0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
	}
}
