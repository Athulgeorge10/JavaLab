package lab24;
import java.util.*;

class SquareThread extends Thread{
	int r;
	SquareThread(int r){
		this.r=r;
	}
	public void run() {
		System.out.println("Square of "+ r+" = "+(r*r));
	}
}

class CubeThread extends Thread{
	int r;
	CubeThread(int r){
		this.r=r;
	}
	public void run() {
		System.out.println("Cube of "+ r+" = "+(r*r*r));
	}
}

class RandThread extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			Random robj = new Random();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			int randomnum=robj.nextInt(100);
			if(randomnum%2 == 0) {
				SquareThread s = new SquareThread(randomnum);
				s.start();
			}
			else {
				CubeThread c = new CubeThread(randomnum);
				c.start();
			}
		}
	}
}

public class SquareCubeThreadDemo {
	public static void main(String[] args) {
		RandThread rand = new RandThread();
		rand.start();
	}
}
