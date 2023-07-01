package main.java;

public class Leaf extends Component {

	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void showPrice() {
		System.out.println("Component: " + name + " : " + price + "€");
	}

}
