package array;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		//nhập xuất
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
		////////////////////////////////////
		//số lần xuất hiện của từng phần tử
		System.out.println("\nSo lan xuat hien cua cac phan tu: ");
		int max=demPhanTu(a, a[0]); 
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j==i) {
					int soPhanTu=demPhanTu(a, a[i]);
					System.out.println(a[i]+": "+soPhanTu);
					if(max<soPhanTu) {
						max=soPhanTu;
					}
				}
				if(a[j]==a[i]) {
					break;
				}
			}
	    }
		/////////////////////////////////////////////////////////////////
		// phần tử xuất hiện nhiều nhất 9 9 7 3 7 
		System.out.println("Phan tu xuat hien nhieu nhat la: ");
		for(int i=0; i<n; i++) {
			int soPhanTu=demPhanTu(a, a[i]);
			if(soPhanTu==max) {
				System.out.println(a[i] +" <=> "+max+" phan tu");
				break;
			}
		}
	}
	// hàm đếm số lần xuất hiện của một phần tử trong mảng
	public static int demPhanTu(int[] a, int ai) {
		int n= a.length, count=0;
		for(int i=0; i<n; i++) {
			if(ai==a[i]) {
				count++;
			}
		}
		return count;
	}
}
		
		
		
		
	
