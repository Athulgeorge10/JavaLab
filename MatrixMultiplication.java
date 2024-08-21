package lab24;
import java.util.*;

public class MatrixMultiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r1,c1,r2,c2;
		System.out.println("Matrix Multiplication");
		System.out.println("Enter no. of rows and columns of Matrix 1:");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		int[][] mat1 = new int[r1][c1];
		System.out.println("Enter no. of rows and columns of Matrix 2");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		int[][] mat2 = new int[r2][c2];
		if(c1!=r2) {
			System.out.println("Matrix Multiplication is not possible");
		}
		else {
			System.out.println("Enter elements of Matrix 1");
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					mat1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter elements of Matrix 2");
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					mat2[i][j] = sc.nextInt();
				}
			}
			System.out.println("Matrix 1:");
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					System.out.print(mat1[i][j] + " ");
				}
				System.out.print("\n");
			}
			System.out.println("Matrix 2:");
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					System.out.print(mat2[i][j] + " ");
				}
				System.out.print("\n");
			}
			int[][] pro = new int[r1][c2];
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c2; j++) {
					pro[i][j] = 0;
					for(int k=0; k<r1; k++) {
						pro[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}
			System.out.println("Product Matrix:");
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c1; j++) {
					System.out.print(pro[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
		
	}
}

