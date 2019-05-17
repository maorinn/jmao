package com;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class newn {
public static void main(String[] args) {
	String dd = "d:/IO/";
	File r = new File(dd);
	File r1 = new File(dd+"11.txt");
	File r2 = new File(dd+"22.doc");
	File r3 = new File(dd+"33.mp3");
	FileWriter w;
	String text = "java≥Ã–Ú…Ëº∆";
	try {
		r.mkdirs();
		r1.createNewFile();
		r2.createNewFile();
		r3.createNewFile();
		String str [] = r.list(new mp3());
		System.out.println(dd+str[0]);
		File r4 = new File(dd+str[0]);
		r4.renameTo(new File(dd+"44.mp3"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
