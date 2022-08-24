package basic;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a=sc.nextInt();
		System.out.print("Nhap b: ");
		b=sc.nextInt();
		System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la "+UCLN(a, b));
		System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la "+BCNN(a, b));

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
	public static int BCNN(int a, int b) {
		int max=a*b;
		if(a>b) {
			for(int i=a; i<=max; i=i+a) {
				if(i%a==0 && i%b==0) {
					return i;
				}
			}
		}
		else {
			for(int i=b; i<=max; i=i+b) {
				if(i%a==0 && i%b==0) {
					return i;
				}
			}
		}
		return max;
	}

}
