package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LabExam_Problem2 {
public static void main (String[] args) {
	//System.out.println(reduction("abcdfeg"));

	System.out.println(reduction("aabbccddf"));
	System.out.println(reduction("sstrrinngg"));
	
}

public static String reduction(String str) {
	if(str.length() ==1) {
		return "" + str;
	}
if(str.length() == 2) {
	if(str.charAt(0) != str.charAt(1)) {
		return str;
	}else if(str.charAt(0) == 'q') {
		return str;
	}else {
		return str.substring(1);
	}
}
	
	if(str.charAt(0) == str.charAt(1) && str.charAt(1) != 'q') {
		str = str.substring(1);
	}
	return "" + str.charAt(0) + reduction(str.substring(1));
	

	
}




public ArrayList<Spaceship> makeShips(){	
	ArrayList<Spaceship> arr = new ArrayList<Spaceship>();
	Random r = new Random();
	for (int i = 0; i < 1000; i ++) {
		arr.add(new Spaceship("ship:" + i, r.nextInt(256), r.nextInt(1001)));
	}
	Collections.sort(arr);
	return arr;
	
}
}
