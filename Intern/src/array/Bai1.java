package array;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap cac phan tu: ");
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]= ");
			a[i]=sc.nextInt();
		}
		System.out.print("Mang vua nhap: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		if(checkArrDoiXung(a)==true) {
			System.out.println("\n=>doi xung");
		}
		else {
			System.out.println("\n=>khong doi xung");
		}
		
	}
	public static boolean checkArrDoiXung(int[] a) {
		int n=a.length;
		for(int i=0; i<n/2; i++) {
			if(a[i]!=a[(n-1)-i]) {
				return false;
			}
		}
		return true;
	}

}
