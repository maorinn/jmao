package com.emp;

import dao.empdao;

public class testup {
	public static void main(String[] args) {
		emp emp = new emp(18, 8888.00, "��11ΰ");
		empdao empdao = new empdao();
		int update = empdao.update(emp);
		if (update!=0) {
			System.out.println("���³ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
	}
}
