
public class Main {

	public static void main(String[] args) {
		
		HP a = new HP();   // first object
		System.out.println("Details: ");
		System.out.println("Width: " + a.getWidth() + "cm");
		System.out.println("Height: " + a.getHeight() + "cm");
		System.out.println("Weight: " + a.getWeight() + "kg");
		System.out.println("Brand: " + a.getBrand());
		System.out.println("Type: " + a.getType());
		System.out.println("Colour: " + a.getColour());
		System.out.println("Input tray Capacity: " + a.getInputTray() + " pages");
		System.out.println("Printing speed: " + a.getSpeed() + " sec");
		System.out.println("Price(RM): " + a.getPrice());
		System.out.println("Quantity: " + a.getQuantity());
		System.out.println("Total price(RM): " + a.getTotalPrice());
		
		System.out.println("------------------------------------");

		Canon b = new Canon();  // Second object
		System.out.println("Details: ");
		System.out.println("Width: " + b.getWidth() + "cm");
		System.out.println("Height: " + b.getHeight() + "cm");
		System.out.println("Weight: " + b.getWeight() + "kg");
		System.out.println("Brand: " + b.getBrand());
		System.out.println("Type: " + b.getType());
		System.out.println("Colour: " + b.getColour());
		System.out.println("Input tray Capacity: " + b.getInputTray() + " pages");
		System.out.println("Printing speed: " + b.getSpeed() + " sec");
		System.out.println("Price(RM): " + b.getPrice());
		System.out.println("Quantity: " + b.getQuantity());
		System.out.println("Total price(RM): " + b.getTotalPrice());
		
	}

}
