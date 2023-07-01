package main.java;

public class Main {
	
	public static void main(String[] args) {
		Leaf ram = new Leaf("Ram", 40);
		Leaf gpu = new Leaf("Gpu", 190);
		
		ram.showPrice();
//		Component: Ram : 40€
		
		Composite pc = new Composite();
		pc.addComponent(ram);
		pc.addComponent(gpu);
		
		pc.showPrice();
//		PC: Ram : 40€
//		PC: Gpu : 190€
		
		System.out.println(pc.sum());
//		Sum: 230€
	}
}
