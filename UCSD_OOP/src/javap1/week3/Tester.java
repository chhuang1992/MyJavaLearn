package javap1.week3;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();
		
		String n = s.getName();
		p = s;
		o = s;
	}

}
