package projectUpload;

import java.util.Scanner;

public class invertedPyramid {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the value to print inverted praymid : ");
	      String a=sc.nextLine();
		int m=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(a);
			}
			System.out.println();
			m--;
	 	}
	}
}