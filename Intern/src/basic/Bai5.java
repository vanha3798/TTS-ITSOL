package basic;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		int n,tg, tongcs=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		tg=n;
		while(tg>0) {
			tongcs=tongcs+tg%10;
			tg=tg/10;
		}
		System.out.println("Tong cac chu so cua "+n+" = "+tongcs);
	}

}
