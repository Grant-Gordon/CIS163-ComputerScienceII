package main;

import java.util.Arrays;

public class StatTester {
	double a;
	double b;
	int c;
	int d;
	int e;
	
	public StatTester() {
		
	}
	
	public static void main(String[] args) {
		int[] ten = {1,2,3,4,5,6,7,8,9,10}; // median 5.5
		int[] nine = {1,2,3,4,5,6,7,8,9};
		StatTester obj = new StatTester();
		System.out.println(obj.getStats(ten).toString());
		System.out.println(obj.getStats(nine));
}	


	
	
	public Statistics getStats(int[] arr) {
	Arrays.sort(arr);
		//finds average
		int sum = 0;
	for (int i = 0; i < arr.length; i ++) {
		sum += arr[i];
	}
	a = (double)sum / arr.length;
	//finds median
	if(arr.length % 2 == 1) {
		b = arr[(arr.length /2)];
				
	}else {
		b = (arr[arr.length / 2 - 1] + arr[arr.length /2]) / 2.00;
	}
	
	
	//finds min
	
	int min = arr[0];
	for(int i = 0; i < arr.length; i ++) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	c = min;
	
	//finds max;
	int max = arr[0];
	for (int i = 0; i < arr.length; i ++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	d = max;
	
	//finds range
	e = d-c;
	return new Statistics(a,b,c,d,e);
	}
	
	
	
	
	private class Statistics{
	double average;
	double median;
	int min;
	int max;
	int range;
	public Statistics(double a, double b, int c, int d,int e) {
		average = a;
		median = b;
		min = c;
		max = d;
		range = e;

		
	}
	
	}
}

