package basic;

public class Bai9 {

	public static void main(String[] args) {
		System.out.println(" Cac so thoa man de bai la: ");
		for(int i=100000; i<=99999999; i++) {
			if(checkThuanNghich(i)==true && check068(i)==true && tongCS(i)%10==0) {
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
	}
	public static int tongCS(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static boolean check068(int n) {
		while(n>0) {
			if(n%10!=0 && n%10!=6 && n%10!=8) {
				return false;
			}
			n/=10;
		}
		return true;
	}

}
