package basic;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a=sc.nextInt();
		System.out.print("Nhap b: ");
		b=sc.nextInt();
		System.out.print("Cac cap so nguyen to cung nhau trong doan [a;b] la: ");
		for(int i =a; i<=b-1; i++) {
			for(int j =i+1; j<=b; j++) {
				if(UCLN(i, j)==1) {
					System.out.print("("+i+","+j+"); ");
				}
			}
		}

	}
	public static int UCLN(int a, int b) {
		int tg;
		while(b>0) {
			tg=b;
			b=a%b;
			a=tg;
		}
		return a;
	}

}
