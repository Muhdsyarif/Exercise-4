import java.util.Scanner;
public class Canon extends Printer {
	
	// Canon subclass
	
	Scanner s = new Scanner(System.in);
	
	private String brand, type, colour;
	private double input_tray, speed, price, quantity, total_price;
	private boolean on_off;
	
	Canon(){
		this.brand = "------Canon Pixma------";
		System.out.print("Enter type of printer(Inkjet/Laser): ");
		this.type = s.nextLine();
		System.out.print("Enter the colour: ");
		this.colour = s.nextLine();
		System.out.print("Enter total input tray: ");
		this.input_tray = s.nextDouble();
		System.out.print("Printing speed: ");
		this.speed = s.nextDouble();
		System.out.print("Enter the printer price: ");
		this.price = s.nextDouble();
		System.out.print("Enter the quantity: ");
		this.quantity = s.nextDouble();
		this.total_price = this.price * this.quantity;
	
		System.out.println("Turn on/off");
		this.on_off = s.nextBoolean();
			if (on_off == true) {
				System.out.println("Printer is ready to use");	
				
			}
			else 
				System.out.println("Printer was shut down");
			
	}
	
	//Getter Method
	public String getBrand() {
		return this.brand;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public double getInputTray() {
		return this.input_tray;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getQuantity() {
		return this.quantity;
	}
	
	public double getTotalPrice() {
		return this.total_price;
	}
	
	public boolean getOnOff() {
		return this.on_off;
	}
	
	
	
}
