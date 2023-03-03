import java.util.ArrayList;

public class Order {
	Customer customer;
	ArrayList<Pizza> pizzas;
	
	public Order(Customer customer) {
		this.customer = customer;
		pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	
	public ArrayList<Pizza> getPizzas(){
		return pizzas;
	}
}
