
public class Test {
	static Flight fl1 = new Flight("LH1523");
	static Flight fl2 = new Flight("LH1523");
	static Flight fl3 = new Flight("RA1324");
	
	public static void main1(String []args) {
		fl1.setOrigin("Munich");
		fl1.setDestination("Frankfurt");
		fl2.setOrigin("Munich");
		fl2.setDestination("Frankfurt");
		fl3.setOrigin("Dublin");
		fl3.setDestination("Stockholm");
	}
	
	public static void main(String []args) {
		System.out.println(fl1.equals1(fl2));
		System.out.println(fl1.equals1(fl3));
		System.out.println(fl2.equals1(fl2));
	}
	public static void main11(String []args) {
		System.out.println(fl1.equals(fl2));
		System.out.println(fl1.equals(fl3));
		System.out.println(fl2.equals(fl2));
		
	}

}
