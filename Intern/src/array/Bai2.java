package array;

import java.util.Scanner;

public class Bai2 {

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
		System.out.println();
		sortArr(a);
	}
	public static void sortArr(int[] a) {
		int n=a.length, tg;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					tg=a[j];
					a[j]=a[i];
					a[i]=tg;
				}
			}
		}
		System.out.print("Mang sau khi sap xep tang dan: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
