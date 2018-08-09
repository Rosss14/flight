
public class FlightOperator {
	static Flight[] flightArray = Ght.generateFlights();
	public static Flight[] sortFlights() {
		Flight fl0 = flightArray[0];
		for (int i = 0; i < flightArray.length; i ++) {
			if (flightArray[i].toString().compareToIgnoreCase(fl0.toString())<=0) {
				flightArray[?]=?; //Не знаю як тут зробити.
			}
			if (flightArray[i].toString().compareToIgnoreCase(fl0.toString())>=0) {
				flightArray[?]=?;//І тут теж.
			}
		}
		return flightArray;
	}
}
