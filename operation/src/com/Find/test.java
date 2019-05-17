package com.Find;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] arr = {8,4,7,1,5};
		Find find = new Find();
		int[] paixv = find.paixv(arr);//排序
		int val = 5;
		int half = find.Half(paixv, val);//查找5
		System.out.println(half);//二分查找结果
	}
}
