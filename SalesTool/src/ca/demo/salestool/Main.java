package ca.demo.salestool;

public class Main {
	public static void main (String[] args){
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("TTHIS APP SHOWS SALES DATA");
	}

}
