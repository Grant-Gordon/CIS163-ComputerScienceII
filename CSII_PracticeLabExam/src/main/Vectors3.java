package main;

public class Vectors3 {
double x;
double y;
double z;
double w;


public Vectors3(double a, double b, double c, double d) {
	x = a;
	y = b;
	z = c; 
	w = d;
}
public Vectors3() {
	x = 0;
	y = 0;
	z = 0;
	w = 0;
}
public Vectors3 add (Vectors3 other) {
	if(this.w == 0 && other.w == 0) {
		return new Vectors3(this.x + other.x, this.y + other.y, this.z + other.z, 1);
	}else if(this.w == 1 && other.w == 0) {
		return new Vectors3(this.x + other.x, this.y + other.y, this.z + other.z, 0);

	}else if(this.w == 1 && other.w == 1) {
		return new Vectors3(this.x + other.x, this.y + other.y, this.z + other.z, 1);

	}else { // (this.w == 0 && other.w == 1)
		return new Vectors3(this.x + other.x, this.y + other.y, this.z + other.z, 0);

	}
}

public Vectors3 sub(Vectors3 other) {
	if(this.w == 0 && other.w == 0) {
		return new Vectors3(this.x - other.x, this.y - other.y, this.z - other.z, 1);
	}else if(this.w == 1 && other.w == 0) {
		return new Vectors3(this.x - other.x, this.y - other.y, this.z - other.z, 0);

	}else if(this.w == 1 && other.w == 1) {
		return new Vectors3(this.x - other.x, this.y - other.y, this.z - other.z, 1);

	}else { // (this.w == 0 && other.w == 1)
		return new Vectors3(this.x - other.x, this.y - other.y, this.z - other.z, 0);

	}
	
}

public double mult (Vectors3 other) {
	if(this.w == 0) {
		return 0.0;
	}else {
		return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
	}
}
}
