package main.java;

import java.util.List;
import java.util.ArrayList;

public class Composite <T extends Component> extends Component{
	
	List<T> components = new ArrayList<>();
	
	public Composite() {
		
	}
	
	public void addComponent(T leaf) {
		components.add(leaf);
	}
	
	public String sum() {
		int price = 0;
		for (T component : components) {
			price += component.price;
		}
		return "Sum: " + price + "€";
	}
	
	@Override
	public void showPrice() {
		for (T component : components) {
			System.out.println("PC: " + component.name + " : " + component.price + "€");
		}
	}
}
