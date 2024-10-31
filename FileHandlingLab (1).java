package lab24;
import java.io.*;
import java.util.Scanner;

public class FileHandlingLab {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        File fs=new File("sample.txt");
        if(!(fs.exists())) {
        	fs.createNewFile();
        	System.out.println("Created File Sample.txt");
        }
        else {
        	System.out.println("Sample.txt exists");
        }
        System.out.println("\nEnter a line of text:");
        String input = sc.nextLine();
        try  {
        	FileWriter w = new FileWriter("sample.txt");
            w.write(input);
            w.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to sample.txt: " + e.getMessage());
        }finally {
        	System.out.println("\nContents written to sample.txt");
        }
        File fn=new File("new-Sample.txt");
        if(!(fn.exists())) {
        	fn.createNewFile();
        	System.out.println("Created File new-Sample.txt");
        }
        else {
        	System.out.println("new-Sample.txt exists");
        }
        System.out.println("\n------Contents of sample.txt:------");
        try  {
        	FileReader r = new FileReader("sample.txt");
            int character;
            while ((character = r.read()) != -1) {
                System.out.print((char) character);
            }
            r.close();
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file sample.txt" + ": " + e.getMessage());
        }
        try {
        	FileReader r = new FileReader("sample.txt");
        	FileWriter w = new FileWriter("new-sample.txt");
               int data;
               while ((data = r.read()) != -1) {
                   w.write(data);
               }
               r.close();
               w.close();
           } catch (IOException e) {
               System.out.println("An error occurred while processing the files: " + e.getMessage());
           }finally {
        	   System.out.println("Contents copied from sample.txt to new-sample.txt");
           }
        System.out.println("\n------Contents of new-sample.txt------");
        try  {
        	FileReader r = new FileReader("new-sample.txt");
            int data;
            while ((data = r.read()) != -1) {
                System.out.print((char) data);
            }
            r.close();
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("An error occurred while reading new-sample.txt: " + e.getMessage());
        }
    }
}