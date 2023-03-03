import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrder {
	
	public static void orderPizza() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		
		System.out.println("Address");
		System.out.println("Enter street: ");
		String street = input.nextLine();
		
		System.out.println("Enter city: ");
		String city = input.nextLine();
		
		System.out.println("Enter state: ");
		String state = input.nextLine();
		
		System.out.println("Enter zipcode: ");
		int zipcode = input.nextInt();
		
		Address address = new Address(street, city, state, zipcode);
		Customer customer = new Customer(name, address);
		Order order = new Order(customer);
		
		System.out.println("How many pizzas: ");
		int numPizzas = input.nextInt();
		
		for(int i = 1; i <= numPizzas; i++) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("pizza info " + i);
			
			System.out.println("Enter size: ");
			String size = input1.nextLine();
			
			System.out.println("Enter number of topppings: ");
			int numToppings = input1.nextInt();
			
			Pizza pizza = new Pizza(size);
			
			System.out.println("Choices: \n Mushroom \n Pineapple \n Zucchini \n Tomato \n Spinach \n Artichoke");
			
			for(int j = 1; j <= numToppings; j++) {
				Scanner input2 = new Scanner(System.in);
				System.out.println("Choose topping " + j + ":");
				
				pizza.addTopping(input2.nextLine());
			}
			
			order.addPizza(pizza);
			System.out.println("-Pizza added-");
		}
		
		System.out.println();
		
		System.out.println("Order Confirmation"
				+ "\nName: " + name
				+ "\nAddress: " + street + ", " + city + ", " + state + ", " + zipcode
				+ "\n" + numPizzas + " pizza/s:");
		
		for(int i = 0; i < numPizzas; i++) {
			Pizza pizza = order.getPizzas().get(i);
			System.out.print(pizza.size + " ");
			
			for(int j = 0; j < pizza.getToppings().size(); j++) {
				System.out.print(pizza.getToppings().get(j) + " ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		orderPizza();
	}
}
