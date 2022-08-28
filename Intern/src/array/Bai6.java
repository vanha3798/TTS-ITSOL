package array;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		float x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang a: ");
		float[] a = nhapMang();
		System.out.print("Mang a: ");
		hienThiMang(a);
		System.out.print("\nMang sau khi sap xep tang dan: ");
		a=sapXepMang(a);
		hienThiMang(a);
		System.out.print("\nNhap x: ");
		x=sc.nextFloat();
		float[] b= new float[a.length+1];
		for(int i=0; i<b.length-1; i++) {
			b[i]=a[i];
		}
		for(int i=b.length-2; i>=0; i--) {
			if(x>b[i]) {
				b[i+1]=x;
				break;
			}
			b[i+1]=b[i];
		}
		System.out.print("Mang a sau khi chen "+x+" vao: ");
		hienThiMang(b);

	}
	public static float[] nhapMang() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n=sc.nextInt();
		float[] a = new float[n];
		System.out.println("Nhap cac phan tu: ");
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]= ");
			a[i]=sc.nextFloat();
		}
		return a;
	}
	public static void hienThiMang(float[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	public static float[] sapXepMang(float[] a) {
		int n=a.length;
		float tg;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					tg=a[j];
					a[j]=a[i];
					a[i]=tg;
				}
			}
		}
		return a;
	}

}
