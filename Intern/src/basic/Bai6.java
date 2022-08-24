package basic;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		int n,i=2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		System.out.print(n+"= ");
		while(n>1) {
			if(n%i==0) {
				System.out.print(i);
				n=n/i;
				if(n>1) {
					System.out.print("x");
				}
			}
			else {
				i++;
			}
			
		}

	}

}
