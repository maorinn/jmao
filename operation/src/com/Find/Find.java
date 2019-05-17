package com.Find;

public class Find {
	public int Half(int[] arr,int val) {
		int star = 0;
		int end = arr.length-1;
		int min;
		int re = -1;
		while (star<=end) {
			min = (star+end)/2;
			if (val!=arr[min]) {
				if (val>arr[min]) {
					star = min+1;
				}else if (val<arr[min]) {
					end = min-1;
				}
			}else {
				re = min;
				break;
			}
		}
			return re;
		}
	public int[] paixv(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		return arr;
	}
}
