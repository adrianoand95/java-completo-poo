package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthDate = sdf.parse(sc.next());
		Client client = new Client(clientName, clientEmail, clientBirthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String clientOrderStatus = sc.nextLine();
		Order order = new Order(new Date(), OrderStatus.valueOf(clientOrderStatus), client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Enter #%d item data:%n", (i + 1));
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
		}

		System.out.println("\n" + order);

		sc.close();
	}
}
