package com.emp;

import dao.empdao;

public class testd {

	public static void main(String[] args) {
		empdao empdao = new empdao();
		int delete = empdao.delete(1);
		if (delete!=0) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}

	}

}
