package com.emp;

import dao.empdao;

public class testd {

	public static void main(String[] args) {
		empdao empdao = new empdao();
		int delete = empdao.delete(1);
		if (delete!=0) {
			System.out.println("É¾³ý³É¹¦");
		}else {
			System.out.println("É¾³ýÊ§°Ü");
		}

	}

}
