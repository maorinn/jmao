package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class mp3 implements FilenameFilter {

	public boolean accept(File dir, String name) {
		if(name.endsWith(".mp3")){
			return true;
		}else{
			return false;
		}
	}
	
}
      