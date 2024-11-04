package lab24;
import java.util.*;
class AddTable extends Thread{
	int n;
	AddTable(int n){
		this.n=n;
	}
	public void run() {
		synchronized(AddTable.class) {
			for(int i=1;i<6;i++) {
				System.out.println(n+"+"+i+"="+(n+i));
			}
		}
	}
}
public class AddTableThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Table you want to run by thread1");
		int n1 = sc.nextInt();
		System.out.println("Enter the Table you want to run by thread2");
		int n2 = sc.nextInt();
		System.out.println("Enter the Table you want to run by thread3");
		int n3 = sc.nextInt();
		AddTable a1 = new AddTable(n1);
		a1.start();
		AddTable a2 = new AddTable(n2);
		a2.start();
		AddTable a3 = new AddTable(n3);
		a3.start();
		
	}
}
