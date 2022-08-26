package week3day2;

public class IndividualBuyer extends Appartment implements Land,Government {
	
	public static void main(String[] args) {
		
		IndividualBuyer house=new IndividualBuyer();
		house.malls();
		house.landtoBuy();
		house.playGround();
		house.commonArea();
		house.registrationAmount();
		System.out.println(s);
		System.out.println(x);
		
	}
     static int x=15;
	public void landtoBuy() {
		System.out.println("my individual plot");	
	}
	public void playGround() {
		System.out.println("playground");
	}
   public void malls() {
	   System.out.println("plots to build mall");
	
}

public void commonArea() {
	System.out.println("park");
	
}

public void registrationAmount() {
	System.out.println("2lakhs");
	
	
}

@Override
public void terrace() {
	// TODO Auto-generated method stub
	
}


public void serviceArea() {
	
	
}
}
