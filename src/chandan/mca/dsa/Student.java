package chandan.mca.dsa;

public class Student {

	public static void main(String[] args) {
		Product1 p1=new Product1(100,"Desktop",12000);
		System.out.println(p1.hashCode());
		Product1 p2=new Product1(100,"Desktop",12000);
		System.out.println(p2.hashCode());
	}

}
