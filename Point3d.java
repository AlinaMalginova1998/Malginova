package lab;

import java.lang.Math;

public class Point3d {
	private double xCoord, yCoord, zCoord;
	// ==============================
	public Point3d(double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	public Point3d() {
		xCoord = yCoord = zCoord = 0;
	}
	// ==============================
	public double getX() {
		return xCoord;
	}
	public double getY() {
		return yCoord;
	}
	public double getZ() {
		return zCoord;
	}
	// ==============================
	public void setX(double x) {
		this.xCoord = x;
	}
	public void setY(double y) {
		this.yCoord = y;
	}
	public void setZ(double z) {
		this.zCoord = z;
	}
	// ==============================
	public boolean equals(Point3d obj) {
		if( (this.getX() == obj.getX()) && (this.getY() == obj.getY()) && (this.getZ() == obj.getZ()) )
			return true;
		return false;
	}
	// ==============================
	public double distanceTo(Point3d obj) {
		return Math.sqrt(Math.pow(obj.getX()-this.getX(),2) + Math.pow(obj.getY()-this.getY(),2) + Math.pow(obj.getZ()-this.getZ(),2));
	}
}
