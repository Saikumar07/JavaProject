package Strings;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[0]);
		
		int[] a1 = {1,2,3,4,5};
		for(int i=0;i<a1.length;i++){
		System.out.println(a1[i]);
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		
		int n = s.nextInt();
	}

}
