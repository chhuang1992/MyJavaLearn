package baseTest;

public class BaseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hi";
		String str2 = "hello";
		System.out.println(str1 + " , "+str2);
		str2 = str1;
		System.out.println(str1 + " , "+str2);
		str2 = "welcome";
		System.out.println(str1 + " , "+str2);
		
		str1 = new String("hi");
		str2 = new String("hello");
		System.out.println(str1 + " , "+str2);
		str2 = str1;
		System.out.println(str1 + " , "+str2);
		str2 = "welcome";
		System.out.println(str1 + " , "+str2);
	}

}
