package lab;

import java.lang.Math;

//  ласс трехмерной точки
public class Point3d {
	private double xCoord, yCoord, zCoord;
	//  онструктор, инициализирующий точку (x,y,z)
	public Point3d(double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	//  онструктор по умолчанию
	public Point3d() {
		xCoord = yCoord = zCoord = 0;
	}
	//  онструкторы, возвращающие значение 
	// соответствующей координаты
	public double getX() {
		return xCoord;
	}
	public double getY() {
		return yCoord;
	}
	public double getZ() {
		return zCoord;
	}
	//  онструкторы, устанавливающие значение 
	// соответствующей координаты
	public void setX(double x) {
		this.xCoord = x;
	}
	public void setY(double y) {
		this.yCoord = y;
	}
	public void setZ(double z) {
		this.zCoord = z;
	}
	// ћетод срвнени€ координат двух точек
	public boolean equals(Point3d obj) {
		return (this.getX() == obj.getX()) && (this.getY() == obj.getY()) && (this.getZ() == obj.getZ());
	}
	// ћетод, вычисл€ющий рассто€ние между двум€ точками
	public double distanceTo(Point3d obj) {
		return Math.sqrt(Math.pow(obj.getX()-this.getX(),2) + Math.pow(obj.getY()-this.getY(),2) + Math.pow(obj.getZ()-this.getZ(),2));
	}
}
