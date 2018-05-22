package lab;

import java.util.Scanner; // Cчитывает веденные пользователем данные
import java.lang.Math; // Дает доступ к встроенным мат. методам, как sqrt() и pow()

// Класс, содержащий main
public class Lab1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] mas = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				// Вывод на консоль и переход на новую строку
				System.out.println("Введите " + ((j == 0) ? "x":"") + ((j == 1) ? "y":"") + ((j == 2) ? "z":"") + " для точки " + (i+1));
				// Метод hasNextDouble возвр. true если след. эелемент является элементом типа Double 
				if(in.hasNextDouble())
					mas[i][j] = in.nextDouble();
				else
					// Остновка работы программы
					System.exit(0);
			}
		}
		// Метод Close прекращает сканирование данных 
		in.close();
		// Заполнение массива 3 на 3 координатами 3-х точек
		Point3d p1 = new Point3d(mas[0][0], mas[0][1], mas[0][2]);
		Point3d p2 = new Point3d(mas[1][0], mas[1][1], mas[1][2]);
		Point3d p3 = new Point3d(mas[2][0], mas[2][1], mas[2][2]);
		double answer = heron(p1, p2, p3);
		// Вывод на консоль и переход на новую строку
		System.out.println("Площадь треугольника по формуле Герона равна: " + answer);
	}

	public static double heron(Point3d p1, Point3d p2, Point3d p3) {
		// Поиск рассояния от точки до точки
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p1);
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
