package com;

import java.util.ArrayList;

public class zzzzz {
	ArrayList<Integer> arrayList = new ArrayList<>();
	ArrayList<Integer> arrayList1 = new ArrayList<>();
	//��ջ
    public void push(Integer c) {
        arrayList.add(c);
    }
    //��ջ��ջ
    public void pop() {
        if (arrayList != null && arrayList.size() > 0) {
        	arrayList1.add(arrayList.get(arrayList.size() - 1));
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
