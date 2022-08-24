package basic;

public class Bai10 {

	public static void main(String[] args) {
		System.out.println("Cac so co 7 chu so thoa man de bai la:");
		for(int i=1000000; i<=9999999; i++) {
			if(checkSNT(i)==true && checkAllSNT(i)==true && checkSNT(daoSo(i))==true) {
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
	public static boolean checkAllSNT(int n) {
		while(n>0) {
			if(checkSNT(n%10)!=true) {
				return false;
			}
			n/=10;
		}
		return true;
	}
	public static int daoSo(int n) {
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
		return cpyn1;
	}
	//2736=

}
