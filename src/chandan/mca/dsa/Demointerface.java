package chandan.mca.dsa;

public class Demointerface implements Game{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving left");
	}
	public static void main(String[]args) {
		Demointerface o=new Demointerface();
		o.f1();
		o.move();
		Game.f2();
	}

}
