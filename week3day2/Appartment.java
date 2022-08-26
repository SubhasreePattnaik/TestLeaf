package week3day2;

public abstract class Appartment {
	
	public void flats() {
		System.out.println("constructed seriese of flats");
	}
     public abstract void terrace();
     
     public void park() {
    	 System.out.println("common to all flats");
     }
     
     //design
     
     public abstract void serviceArea();
}

