package mainPackage;

public class compSci_II_practiceAssignment {

	public static void main(String[] args) {
	int[] fiveFives = {5,5,5,5,5};
	int[] sFives = {5,5,6,7,3,5,8,5,5};
	int[] twoTwos = {2,2};
	System.out.println(xByz(fiveFives, 5)); // true
	System.out.println(xByz(fiveFives, 4)); // false
	System.out.println(xByz(fiveFives, 7)); // false
	System.out.println(xByz(sFives, 5)); // true
	System.out.println(xByz(sFives, 4)); // false
	System.out.println(xByz(sFives, 7)); // false
	System.out.println(xByz(twoTwos, 2)); // true
	System.out.println(xByz(twoTwos, 5)); // false
	
	int b = 2;
	System.out.println(xByz(twoTwos, 1)); //false
	System.out.println("TEST____________");
System.out.println(b ==2.0);
	
	}
	/*
	 * Grant Gordon 8/24/2022
	 * Written in Eclipse IDE
	 */
	public static boolean xByz(int[] x, int y) {
		int c = 0;
		for(int i = 0; i < x.length; i ++) {
			if (x[i] == y) {
				c++;
			}
		}
		if(c == y) {
			return true;
		}else {
			return false;
		}	
	}

}
