package com;
public class clist {
	private clist pre = this;
	private String data;
	private clist next = this;
	//���췽��
	public clist(String data) {
		this.data = data;
	}
	//��ȡ��ǰ�ڵ�����
	public String getdata() {
		return this.data;
	}
	//��ȡ��һ���ڵ�
	public clist getpre() {
		return this.pre;
	}
	//��ȡ��һ���ڵ�
	public clist getnext() {
		return this.next;
	}
	//׷�ӽڵ�
	public void add(clist next) {
		clist c = this;
		clist th = this;
		while (true) {
			if (c.next==th) {
				c.next = next;
				next.pre = c;
				next.next = th.pre;
				th.pre = next.next;
				break;
			}
			c = c.next;
		}
	}
	//��ʾ�ڵ�����
	public void show() {
		clist d = this;
		clist next = d.next;
		System.out.print(d.data+"\t");
		while (d!=next) {
			System.out.print(next.data+"\t");
			next = next.next;
		}
	}
	//ɾ���ڵ�
	public void delete(clist clist) {
		clist pre = clist.pre;
		clist next = clist.next;
		pre.next = next;
		next.pre = pre;
		
	}
}