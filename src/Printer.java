import java.util.Scanner;

public class Printer {
	
	// Parent Class
	
	Scanner s = new Scanner(System.in);
	
	private double width, height, weight;
	
	
	Printer(){
		System.out.print("Please enter the width of printer: ");
		this.width = s.nextDouble();
		System.out.print("Please enter the height of printer: ");
		this.height = s.nextDouble();
		System.out.print("Please enter the weight of printer: ");
		this.weight = s.nextDouble();
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	
}
