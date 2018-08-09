
public class FlightOperator {
	public Flight[] sortFlights() {
		Flight[] flightArray = Ght.generateFlights();
		String fl0 = flightArray[0].toString();
		for (int i = 0; i < flightArray.length; i ++) {
			if (flightArray[i].toString().compareToIgnoreCase(fl0)<0) {
				fl0=flightArray[i].toString();
				flightArray[0]=flightArray[i];
			}
		}
		String fl1 = flightArray[1].toString();
		for (int i = 1; i < flightArray.length; i ++) {
			if (flightArray[i].toString().compareToIgnoreCase(fl1)<0) {
				fl1=flightArray[i].toString();
				flightArray[1]=flightArray[i];
			}
		}
		String fl2 = flightArray[2].toString();
		for (int i = 2; i < flightArray.length; i ++) {
			if (flightArray[i].toString().compareToIgnoreCase(fl2)<0) {
				fl2=flightArray[i].toString();
				flightArray[2]=flightArray[i];
			}
		}
		String fl3 = flightArray[3].toString();
		for (int i = 3; i < flightArray.length; i ++) {
			if (flightArray[i].toString().compareToIgnoreCase(fl3)<0) {
				fl3=flightArray[i].toString();
				flightArray[3]=flightArray[i];
			}
		}
		return flightArray;
	}
}
