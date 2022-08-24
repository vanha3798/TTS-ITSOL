package basic;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		System.out.println("Cac so thuan nghich co 6 chu so: ");
		for(int i =100000; i<=999999; i++) {
			if(checkThuanNghich(i)==true) {
				System.out.println(i);
			}
		}
		System.out.println("Cac so thuan nghich co 6 chu so, tong chu so chia het cho 10: ");
		for(int i =100000; i<=999999; i++) {
			if(checkThuanNghich(i)==true && tongCS(i)%10==0) {
				System.out.println(i);
			}
		}
	}
	public static boolean checkThuanNghich(int n) {
		int cpyn1=n,cpyn2=n, i=1;
		while(cpyn1>0) {
			cpyn1=cpyn1/10;
			if(cpyn1>0) {
				i*=10;
			}
		}
		while(cpyn2>0) {
			cpyn1+=(cpyn2%10)*i;
			cpyn2/=10;
			i/=10;
		}
		if(cpyn1==n) {
			return true;
		}
		else {
			return false;
		}
		//3246=6x1+4x10+2x100+3x1000
		//6423=6x1000+4x100+2x10+3x1
		//return true;
	}
	public static int tongCS(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
