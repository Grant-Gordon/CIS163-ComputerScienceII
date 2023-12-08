package main;

public class FixedRouteClass {
	public FixedRouteClass() {
		
	}
public static void main(String[] args) {
	
	System.out.println(fixedRoute("NSNEWEEEWNSEWNNNS"));
}

public static String fixedRoute(String route) {
	
	String str = "";
	for(int i = 0; i < route.length() - 1; i++) {
		if(route.charAt(i) == 'N') {
			if(route.charAt(i + 1) != 'S') {
				str += 'N';
			}else {
				i++;
			}
		}else if(route.charAt(i) == 'W') {
			if(route.charAt(i + 1) != 'E') {
				str += 'W';
			}else {
				i++;
			}
		}else if(route.charAt(i) == 'S') {
			if(route.charAt(i + 1) != 'N') {
				str += 'S';
			}else {
				i++;
			}
		}else if(route.charAt(i) == 'E') {
			if(route.charAt(i + 1) != 'W') {
				str += 'E';
			}else{
				i++;
			}
		}
	}
	return str;
}
}
