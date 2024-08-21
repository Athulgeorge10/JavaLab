package lab24;
import java.util.*;
class Employee{
	float Bas;
	float DA,HRA;
	
	Employee(float Bas, float DA, float HRA){
		this.Bas = Bas;
		this.DA = DA;
		this.HRA = HRA;
	}
	void display() {
		System.out.println("....EMPLOYEE....");
	}
	void calcSal() {
		System.out.println("The Gross Salary of EMPLOYEE is "+(Bas + ((DA/100)*Bas )+ ((HRA/100)*Bas)));
	}
}
class Engineer extends Employee{
	Engineer(float Bas, float DA, float HRA){
		super(Bas,DA,HRA);
		super.display();
		super.calcSal();
	}
	void display() {
		System.out.println("....ENGINEER....");
	}
	void calcSal() {
		System.out.println("The Gross Salary of ENGINEER is "+((Bas + ((DA/100)*Bas )+ ((HRA/100)*Bas))*2));
	}
	
}

public class InheritanceLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Salary of the Employee: ");
		float B = sc.nextFloat();
		System.out.println("Enter the DA% of the Employee: ");
		float D = sc.nextFloat();
		System.out.println("Enter the HRA% of the Employee: ");
		float H = sc.nextFloat();
		sc.close();
		Engineer em = new Engineer(B,D,H);
		em.display(); 
		em.calcSal();
	}

}