package mytest;

public class MyBitOpTest {

	public static void main(String[] args) {
		int a = 0x80000000;
		long la = a;
		long absla = Math.abs(la);
		//int b = a>>2;
		System.out.println(absla);
		int c = 0xFC000000;
		System.out.println(c);
	}
	
	public static boolean int2boolean(int a){
		if(a==0) return false;
		else return true;
	}
	public static boolean isneg(int a)
	{
		return int2boolean(a & 0x80000000);
	}
	public static boolean iszero(int a)
	{
		return !int2boolean(a & 0xFFFFFFFF);
	}
	public static boolean ispos(int a)
	{
		return int2boolean((a&0xFFFFFFFF)) && !int2boolean(a&0x80000000);
	}
	
	public static int add(int a, int b){
		return b==0?a:add(a^b,(a&b)<<1);
	}
	public static int addIter(int a,int b){
		int ans=a;
		while(b!=0){
			ans = a^b;
			b=(a&b)<<1;
			a=ans;
		}
		return a;
	}
	public static int negative(int a){
		return add(~a,1);
	}
	public static int minus(int a, int b){
		return add(a,negative(b));
	}
	public static int multiPos(int a,int b){
		int ans = 0;
		while(!iszero(b)){
			if(!iszero(b&1))
				ans = add(ans, a);
			a = a << 1;
			b = b >> 1;
		}
		return ans;
	}
	public static int dividePos(int a, int b)
	{
		int coun = 0;
		while(a >= b){
			a = minus(a, b);
			coun = add(coun, 1);
		}
		return coun;
	}
	public static int multi(int a, int b){
		if(iszero(a) || iszero(b))
			return 0;
		if(isneg(a)){
			if(isneg(b))
				return multiPos(negative(a), negative(b));
			else
				return negative(multiPos(negative(a), b));
		}else if(isneg(b))
			return negative(multiPos(a, negative(b)));
		else
			return multiPos(a, b);
	}
	public static int divide(int a, int b){
		if(iszero(b))
			return Integer.MAX_VALUE;
		if(iszero(a))
			return 0;
		if(isneg(a)){
			if(isneg(b))
				return dividePos(negative(a), negative(b));
			else
				return negative(dividePos(negative(a), b));
		}else if(isneg(b))
			return negative(dividePos(a, negative(b)));
		else
			return dividePos(a, b);
	}
}
