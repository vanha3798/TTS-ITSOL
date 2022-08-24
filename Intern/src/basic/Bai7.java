package basic;

public class Bai7 {

	public static void main(String[] args) {
		
		System.out.println("Cac so nguyen to co 6 chu so voi cac chu so le la: ");
		for(int i=100000; i<=999999; i++) {
			if(checkSNT(i)==true && checkCSLe(i)==true) {
				System.out.println(i);
			}
			
		}

	}
	public static boolean checkSNT(int n) {
		if(n<=1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	public static boolean checkCSLe(int n) {
		while(n>0) {
			if((n%10)%2==0) {
				return false;
			}
			n=n/10;
		}
		return true;
	}
}
