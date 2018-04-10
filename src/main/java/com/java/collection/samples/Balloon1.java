package com.java.collection.samples;

public class Balloon1 {

	private String color;

	public Balloon1() {
	}

	public Balloon1(String c) {
		this.color = c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Balloon1 red = new Balloon1("Red"); // memory reference 50
		Balloon1 blue = new Balloon1("Blue"); // memory reference 100
		System.out.println("red.hashCode()::" + red.hashCode());
		System.out.println("blue.hashCode()::" + blue.hashCode());
		swap(red, blue);
		System.out.println("red.hashCode()::" + red.hashCode());
		System.out.println("blue.hashCode()::" + blue.hashCode());
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		blue = foo(blue);
		System.out.println("red.hashCode()::" + red.hashCode());
		System.out.println("blue.hashCode()::" + blue.hashCode());
		System.out.println("blue color=" + blue.getColor());

	}

	private static Balloon1 foo(Balloon1 balloon) { // baloon=100
		System.out.println("Balloon instance ::" + balloon.hashCode());
		balloon.setColor("Red"); // baloon=100
		balloon = new Balloon1("Green"); // baloon=200
		System.out.println("Balloon instance ::" + balloon.hashCode());
		balloon.setColor("Blue"); // baloon = 200
		return balloon;
	}

	// Generic swap method
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

}
