package com.emp;

import dao.empdao;

public class testup {
	public static void main(String[] args) {
		emp emp = new emp(18, 8888.00, "张11伟");
		empdao empdao = new empdao();
		int update = empdao.update(emp);
		if (update!=0) {
			System.out.println("更新成功");
		}else {
			System.out.println("更新失败");
		}
	}
}
