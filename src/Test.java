public class Test{
	static Flight fl1 = new Flight("LH1523");
	static Flight fl2 = new Flight("Lh1523");
	static Flight fl3 = new Flight("RA1324");

	public static void setAirports() {
		fl1.setOrigin("Munich");
		fl1.setDestination("Frankfurt");
		fl2.setOrigin("Munich");
		fl2.setDestination("FRankfurt");
		fl3.setOrigin("Dublin");
		fl3.setDestination("StockHolm");
	}
	
	public static void testComparison() {
		System.out.println(fl1.equals1(fl2));
		System.out.println(fl1.equals1(fl3));
		System.out.println(fl2.equals1(fl2));
		System.out.println(fl1.equals(fl2));
		System.out.println(fl1.equals(fl3));
		System.out.println(fl2.equals(fl2));
	}

	public static void testSort(FlightOperator fo){
		System.out.println(fo);
		fo.sortFlights();
		System.out.println("Sorted by code");
		System.out.println(fo);

	}

	public static void main(String []args) {
//		setAirports();
//		testComparison();
		testSort(new FlightOperator(new Flight[]{fl3, fl1, fl2}));


	}
}