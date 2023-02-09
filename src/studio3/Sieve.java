package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Number n?");
		int n = in.nextInt();
		
		boolean[] array = new boolean[n+1];
		
		for (int i=1; i<n+1; i++) 
		{
			array[i] = true;}
		
		for (int i=4; i<n+1;i=i+2) {
				array[i] = false;
			}
		for (int i=6; i<n+1; i=i+3) {
			array[i] = false;
		}
		for (int i=10; i<n+1; i=i+5) {
			array[i] = false;
		}	
		for (int i = 1; i<n+1;i++) {
			if (array[i] == true) {
				System.out.println(i);
			}
		}
		
	}
}
				