package array;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		int ma,na,mb,nb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma tran A");
		System.out.print("-Nhap so hang: ");
		ma=sc.nextInt();
		System.out.print("-Nhap so cot: ");
		na=sc.nextInt();
		int[][] a= nhapMang(ma,na);
		
		System.out.println("Nhap ma tran B");
		do {
			System.out.print("-Nhap so hang: ");
			mb=sc.nextInt();
			if(mb!=na) {
				System.err.println("\nSo hang cua B phai bang so cot cua A!!!");
			}
		}while(mb!=na);
		System.out.print("-Nhap so cot: ");
		nb=sc.nextInt();
		int[][] b= nhapMang(mb,nb);
		///////////////////////////////////
		System.out.println("Mang A:");
		inMang(a, ma, na);
		System.out.println("Mang B:");
		inMang(b, mb, nb);
		//////////////////////////////////
		int[][] c= new int[ma][nb];
		int s;
		for(int i=0; i<ma; i++) {
			for(int j=0; j<nb; j++) {
				s=0;
				for(int k=0; k<na; k++) {
					s=s+a[i][k]*b[k][j];
				}
				c[i][j]=s;
			}
		}
		System.out.println("Tich 2 ma tran A va B la: ");
		inMang(c, ma, nb);


	}
	public static int[][] nhapMang(int m, int n) {
		Scanner sc = new Scanner(System.in);
		int[][] a= new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("arr["+i+"]["+j+"]= ");
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	public static void inMang(int[][] a, int m, int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]+" ");
				if(j==n-1) {
					System.out.println();
				}
			}
		}
	}

}
