
public class FlightOperator {
    Flight[] flights;

    public FlightOperator(Flight[] flights) {
        this.flights = flights;
    }


    public void sortFlights() {
        // TODO: add sort by different criteria if code is same
        for (int i = 0; i < this.flights.length; ++i) {
            for (int j = i + 1; j < this.flights.length; ++j) {
            	if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin())>0) {
            		Flight temp = this.flights[i];
                    this.flights[i] = this.flights[j];
                    this.flights[j] = temp;
            	}
            	else if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin())==0) {
            		if (this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination())>0) {
            			Flight temp = this.flights[i];
                        this.flights[i] = this.flights[j];
                        this.flights[j] = temp;
            		}
            		else if (this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination())==0) {
            			if (this.flights[i].getCode().compareToIgnoreCase(this.flights[j].getCode()) > 0) {
                			Flight temp = this.flights[i];
                			this.flights[i] = this.flights[j];
                			this.flights[j] = temp;
            		}
            	}
                }
            }
        }

    }

    public String toString() {
        String print = "";
        for (int i = 0; i < this.flights.length; ++i) {
            print += this.flights[i].toString();
            print += " -> ";
        }
        return print;
    }
}