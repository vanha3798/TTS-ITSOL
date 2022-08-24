package basic;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int n, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		System.out.print("-Cac uoc cua "+n+" la: ");
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.print(i+"; ");
				count++;
			}
		}
		System.out.println("\n-"+n+" co "+count+" uoc so");

	}

}
