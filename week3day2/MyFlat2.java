package week3day2;

public class MyFlat2 extends Appartment {

	public void terrace() {
		System.out.println("friends chat");
		
		
	}
	
	public void ServiceArea() {
		System.out.println("store room");
	}
	
	public static void main(String[] args) {
		MyFlat2 call=new MyFlat2();
		call.flats();
		call.park();
		call.terrace();
		call.ServiceArea();
		int z=IndividualBuyer.x;//classname.variable name
		System.out.println(z);
	}

	
	public void serviceArea() {
		
		
	}

}
