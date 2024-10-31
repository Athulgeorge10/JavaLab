package lab24;
import java.io.*;
import java.util.Scanner;

public class FileHandlingStreamLab {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        File fs1=new File("number.txt");
        if(!(fs1.exists())) {
        	fs1.createNewFile();
        	System.out.println("number.txt created");
        }
        else {
        	System.out.println("number.txt exists");
        }
        File fs2=new File("even.txt");
        if(!(fs2.exists())) {
        	fs2.createNewFile();
        	System.out.println("\neven.txt created");
        }
        else {
        	System.out.println("\neven.txt exists");
        }
        File fs3=new File("odd.txt");
        if(!(fs3.exists())) {
        	fs3.createNewFile();
        	System.out.println("\nodd.txt created");
        }
        else {
        	System.out.println("\nodd.txt exists");
        }
        System.out.print("\nEnter the number of elements you want to store: ");
        int n = sc.nextInt();
        try {
	        FileOutputStream fout1 = new FileOutputStream(fs1);
	        System.out.println("Enter the elements: ");
	        for(int i=0; i<n; i++) {
	        	fout1.write(sc.nextInt());
	        }
        }catch(IOException e){
	    	System.out.println("Error storing to numbers.txt:"+ e.getMessage());
	    }
        System.out.println("Data added");
        try{
	        FileInputStream fin1 = new FileInputStream(fs1);
	        int i;
	        System.out.println("\nContent of number.txt: ");
	        while((i=fin1.read())!=-1) {
	        	  System.out.println(i);
	        }
        }catch(IOException e) {
        	System.out.println("Error reading from numbers.txt:"+ e.getMessage());
        }
        
        try {
        	FileInputStream fin1 = new FileInputStream(fs1);
	        FileOutputStream fout2 = new FileOutputStream(fs2);
	        FileOutputStream fout3 = new FileOutputStream(fs3);
	        int i;
			while((i=fin1.read())!=-1) {
	        	if(i%2 == 0) {
	        		fout2.write(i);
	        	}
	        	else {
	        		fout3.write(i);
	        	}
	        }
        }catch(IOException e) {
        	System.out.println("Error in storing to even.txt or odd.txt:"+ e.getMessage());
        }finally {
        	System.out.println("Even and odd numbers have been separated into even.txt and odd.txt");
        }
        try {
	        FileInputStream fin2 = new FileInputStream(fs2);
	        int i;
			System.out.println("\nContent of even.txt: ");
			while((i=fin2.read())!=-1) {
	      	  System.out.println(i);
			}
        }catch(IOException e) {
        	System.out.println("Error reading from even.txt:"+ e.getMessage());
        }
		
        try {
			FileInputStream fin3 = new FileInputStream(fs3);
			int i;
			System.out.println("Content of odd.txt: ");
			while((i=fin3.read())!=-1) {
	      	  System.out.println(i);
			}
		}catch(IOException e) {
			System.out.println("Error reading from odd.txt:"+ e.getMessage());
		}
    }
}