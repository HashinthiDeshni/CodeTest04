import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String OrderID;
		String Customer;
		String PickedUpBy;
		String DeliveryLocation;
		String DeliveryToPerson;
		double Cost;
		String DeliveryType;
		double weight;
		double distance;
		double priceper1Km;
		String continueOn = "Y";
		
				

		
		while(continueOn.equalsIgnoreCase("Y")) {
			System.out.println("Enter order id : ");
			OrderID = sc.next();
			System.out.println("Enter customer : ");
			Customer = sc.next();
			System.out.println("Enter picked by : ");
			PickedUpBy = sc.next();
			System.out.println("Enter DeliveryLocation: ");
			DeliveryLocation = sc.next();
			System.out.println("Enter DeliveryToPerson: ");
			DeliveryToPerson = sc.next();
			System.out.println("Enter Cost: ");
			Cost = sc.nextDouble();
			System.out.println("Enter DeliveryType: ");
			DeliveryType = sc.next();
			System.out.println("Enter weight: ");
			weight = sc.nextDouble();
			System.out.println("Enter distance: ");
			distance = sc.nextDouble();
			System.out.println("Enter priceper1Km: ");
			priceper1Km = sc.nextDouble();
			
			System.out.println("\n");
			
			order order = new order(OrderID, Customer, PickedUpBy, DeliveryLocation, DeliveryToPerson, Cost, DeliveryType, weight, distance, priceper1Km);
			System.out.println(order.toString());
			
			if(order.getDeliveryType().equalsIgnoreCase("Express")){
				express express = new express(order.getWeight(),order.getDistance(),order.getPriceper1Km());
				System.out.println(express.calculate());
			} else if (order.getDeliveryType().equalsIgnoreCase("Normal")){
				normal normal = new normal(order.getWeight(),order.getDistance(),order.getPriceper1Km());
				System.out.println(normal.calculate());
			} else {
				System.out.println("Please input valid delivery type");
			}
			
			System.out.println("\n");
			
			System.out.println("Do you want to continue (Y || N):  ");
			continueOn = sc.next();
			
		}
		

	}

}
