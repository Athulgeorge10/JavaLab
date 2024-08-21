package lab24;

abstract class Animal{
	protected int legs;
	protected Animal(int legs){
		this.legs=legs;
	}
	Animal(){
	}
	abstract void eat();
	void walk() {
		System.out.println("This animal walk by "+legs+" legs.");
	}
}

class Spider extends Animal{
	Spider(int legs ){
		super(legs);
	}
	void eat() {
		System.out.println("Spider eat insects");
	}
}

interface Pet{
	void getName();
	void setName(String name);
	void play();
}

class Cat extends Animal implements Pet{
	String name;
	public void getName() {
		System.out.println("This cat's name is "+name);
	}
	public void setName(String name) {
		System.out.println("This cat's name is "+name);
	}
	public void play() {
		System.out.println("Cat play with rats");
	}
	Cat(String name, int legs){
		super(legs);
		this.name = name;
	}
	void eat() {
		System.out.println("Cat eat fishes");
	}
}

class Fish extends Animal implements Pet{
	String name;
	public void getName() {
		System.out.println("This fish's name is "+name);
	}
	public void setName(String name) {
		System.out.println("This fish's name is "+name);
	}
	void eat() {
		System.out.println("Fish eat plants");
	}
	Fish(String name){
		this.name = name;
	}
	void walk(){
		System.out.println("Fish has no legs.");
	}
	public void play() { }
}

public class TestAnimals {
	public static void main(String[] args) {
		Fish d = new Fish("Mimi");
		System.out.println("FISH");
		d.getName();
		d.eat();
		d.walk();
		d.setName("Momo");
		Cat c = new Cat("Fluffy",4);
		System.out.println("\nCAT");
		c.getName();
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		Animal e = new Spider(8);
		System.out.println("\nSPIDER");
		e.eat();
		e.walk();
		
	}
}
