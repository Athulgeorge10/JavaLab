package lab24;

class A{
	int i, j;
	void showij() {
		System.out.println("i= " + i + " j= " + j);
	}
}

class B extends A{
	int k;
	void showk() {
		System.out.println("k= " + k);
	}
}

public class InheritanceDemo{
	public static void main(String[] args) {
		B obj = new B();
		obj.i = 10;
		obj.j = 20;
		obj.k = 30;
		obj.showij();
		obj.showk();
	}
}
