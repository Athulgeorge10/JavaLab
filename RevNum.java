package lab24;

import java.util.*;

public class RevNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,revNum=0;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		while(num>0) {
			revNum *= 10;
			revNum += num%10;
			num = num/10;
		}
		System.out.print("Reversed Num: " + revNum);
	}
}
