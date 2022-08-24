package basic;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int n, S1=0;
		float S2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		n=sc.nextInt();
		if(n%2!=0) {
			for(int i=1; i<=n; i=i+2){
				S1=S1+i;
			}
		}
		else {
			for(int i=2; i<=n; i=i+2){
				S1=S1+i;
			}
		}
		System.out.println("a. S= "+S1);
		
		for(int i=1; i<=n; i++) {
			S2=S2+(float)1/(float)i;
		}
		System.out.println("b. S= "+S2);

	}

}
