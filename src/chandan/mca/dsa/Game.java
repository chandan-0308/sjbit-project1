package chandan.mca.dsa;

public interface Game {
	void move();
	default void f1(){
		System.out.println("moving");
	}
	static void f2(){
		System.out.println("moving-right");
	}
	public static void main(String[]args) {
		f2();
	}
}
