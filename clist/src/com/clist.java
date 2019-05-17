package com;
public class clist {
	private clist pre = this;
	private String data;
	private clist next = this;
	//构造方法
	public clist(String data) {
		this.data = data;
	}
	//获取当前节点数据
	public String getdata() {
		return this.data;
	}
	//获取上一个节点
	public clist getpre() {
		return this.pre;
	}
	//获取下一个节点
	public clist getnext() {
		return this.next;
	}
	//追加节点
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
	//显示节点数据
	public void show() {
		clist d = this;
		clist next = d.next;
		System.out.print(d.data+"\t");
		while (d!=next) {
			System.out.print(next.data+"\t");
			next = next.next;
		}
	}
	//删除节点
	public void delete(clist clist) {
		clist pre = clist.pre;
		clist next = clist.next;
		pre.next = next;
		next.pre = pre;
		
	}
}
