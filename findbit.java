package bitmasking;

public class findbit {

	public static void checkithbit(int n,int num) {
		int one=1;
		for(int i=0;i<n-1;i++) {
			one=one<<1;
		}
		one=num & one;
		if(one==0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
	}
	public static void main(String[] args) {
	
		//checkithbit(2,6);
		//System.out.println(5<<3);
		//setithbit(3,3);
		//System.out.println(ithMagical(100));
         System.out.println(oneToithMagical(5));
	}
	public static void setithbit(int n,int num) {
		int one=1;
		one=one<<n-1;
		num=num | one;
		System.out.println(num);
	}
	public static int ithMagical(int n) {
	int	one;
	int ans=0;
	int num=1;
	while(n!=0) {
       one =1;
		num=num*5;
		one=one & n ;
		n=n>>1;
		if(one!=0) {
			ans=ans+num;
		}
	}
		return ans;
	}
	public static int  oneToithMagical(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans=ans+ithMagical(i);
		}
		return ans;
	}

}
