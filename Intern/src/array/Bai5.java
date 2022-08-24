package array;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Bai5 {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang a");
		int[] a=nhapMang();
		System.out.println("Nhap mang b");
		int[] b=nhapMang();
		System.out.print("=>Mang a: ");
		hienThiMang(a);
		System.out.print("\n=>Mang b: ");
		hienThiMang(b);
		System.out.println();
		do {
			System.out.print("Nhap p: ");
			p=sc.nextInt();
			if(p<0 || p>=a.length) {
				System.err.println("p=[0; "+a.length+")!!!");
			}
		}while(p<0 || p>=a.length);
		///////////////////////////////////////////////
		int[] m=new int[a.length+b.length];
		for(int i=0; i<m.length; i++) {
			if(i<p) {
				m[i]=a[i];
			}
			else if(i>=p && i<p+b.length) {
				m[i]=b[i-p];
			}
			else {
				m[i]=a[i-b.length];
			}
		}
		System.out.print("Sau khi chen mang b vao vi tri "+p+" cua mang a: ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i]+" ");
		}

	}
	
	public static int[] nhapMang() {
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
		return a;
	}
	public static void hienThiMang(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
