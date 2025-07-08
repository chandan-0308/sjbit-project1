package chandan.mca.dsa;

public class MainPayment extends Payment {

	@Override
	void pay() {
		// TODO Auto-generated method stub
		System.out.println("cash payment");
	}
	@Override
	void upi() {
		// TODO Auto-generated method stub
		System.out.println("upi payment");
	}
	public static void main(String[]args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.upi();
		p.printbill();
	}
	

}
