
public class Ght {
	static Flight[] listFlights = new Flight[4];
	static Flight fl1 = new Flight("LH1523");
	static Flight fl2 = new Flight("UI1943");
	static Flight fl3 = new Flight("RA1324");
	static Flight fl4 = new Flight("NA1074");
	
	public static void setData() {
		fl1.setOrigin("Munich");
		fl1.setDestination("Frankfurt");
		fl2.setOrigin("Kyiv");
		fl2.setDestination("Oslo");
		fl3.setOrigin("Dublin");
		fl3.setDestination("StockHolm");
		fl4.setOrigin("Paris");
		fl4.setDestination("Tallinn");
	}
	
	public static void main(String []args) {
		setData();
		listFlights[0]=fl1;
		listFlights[1]=fl2;
		listFlights[2]=fl3;
		listFlights[3]=fl4;
		System.out.println(""+listFlights);
	}
	public Flight[] getList() {
		return listFlights;
	}
}
