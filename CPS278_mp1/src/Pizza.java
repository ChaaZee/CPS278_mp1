import java.util.ArrayList;

public class Pizza {
	String size;
	ArrayList<String> toppings;
	int numToppings = 0;
	
	public Pizza(String size) {
		this.size = size;
		toppings = new ArrayList<String>();
	}
	
	public void addTopping(String topping) {
		numToppings++;
		toppings.add(topping);
	}
	
	public ArrayList<String> getToppings(){
		return toppings;
	}
}
