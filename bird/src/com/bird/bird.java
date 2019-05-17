package com.bird;

public class bird {
private String color;
private int size;


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}


public void shixin() {
	System.out.println("Â¬±¾Î°Å£±Æ");
}


public bird(String color, int size) {
	super();
	this.color = color;
	this.size = size;
}

}
