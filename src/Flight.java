
public class Flight {
	String airline;
	String flightCode;
	Hora hour;
	int duration;
	String airportOrigin;
	String airportDestination;
	
	public Flight (String code) {
		flightCode = code;
	}
	public void setAirLine(String line) {
		airline = line;
	}
	public void setHour(Hora hora) {
		hour = hora;
	}
	public void setDuration(int dur) {
		duration = dur;
	}
	public void setOrigin(String origin) {
		airportOrigin = origin;
	}
	public void setDestination(String destination) {
		airportDestination = destination;
	}
	public String getAirline() {
		return airline;
	}
	public String getCode() {
		return flightCode;
	}
	public Hora getHour() {
		return hour;
	}
	public int getDuration() {
		return duration;
	}
	public Hora getLandHour() {
		return hour.horaTrasMinutos(duration);
	}
	public String getOrigin() {
		return airportOrigin;
	}
	public String getDestination() {
		return airportDestination;	
	}
	public boolean equals (Flight otherFlight){
		for ( int i = 0 ; i < flightCode.length() ; i ++){
			char myChar = flightCode.charAt(i);
			char otherChar = otherFlight.flightCode.charAt(i);
			if (myChar != otherChar){
				return false;
			}
		}
		return true;
		
	}
	public boolean equals1 (Flight otherFlight) {
		if (flightCode == otherFlight.getCode() && airportOrigin == otherFlight.getOrigin() && airportDestination == otherFlight.getDestination()) {
			return true;
		}
		else {
			return false;
		}
	}
}
