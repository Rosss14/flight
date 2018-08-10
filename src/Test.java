public class Test{
	static Flight fl1 = new Flight("LH1523");
	static Flight fl2 = new Flight("Lh1523");
	static Flight fl3 = new Flight("RA1324");
	static Hora hora1 = new Hora(14 , 30);
	static FlightOperator fo = new FlightOperator (FlightOperator.generateFlights());
	public static void setAirports(String []args) {
		fl1.setOrigin("Munich");
		fl1.setDestination("Frankfurt");
		fl2.setOrigin("Munich");
		fl2.setDestination("FRankfurt");
		fl3.setOrigin("Dublin");
		fl3.setDestination("StockHolm");
		fl1.setAirLine("LuftHansa");
		fl1.setDuration(35);
		fl1.setHour(hora1);
	}
	
	public static void testComparison(String []args) {
		System.out.println(fl1.equals1(fl2));
		System.out.println(fl1.equals1(fl3));
		System.out.println(fl2.equals1(fl2));
		System.out.println(fl1.equals(fl2));
		System.out.println(fl1.equals(fl3));
		System.out.println(fl2.equals(fl2));
		System.out.println(fl1.textRepresentation());
	}
	

	public static void main(String []args) {
		fo.sortFlightsAlt();
		//fo.sortFlights();
		for (int i=0;i<fo.getFlights().length;i++) {
			System.out.println(""+fo.getFlights()[i].textRepresentation());
		}
		System.out.println(fo.toString());
		
	}
}