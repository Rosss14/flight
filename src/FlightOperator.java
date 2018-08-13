
public class FlightOperator {
    Flight[] flights;

    public FlightOperator(Flight[] flights) {
        this.flights = flights;
    }

    public Flight[] getFlights() {
        return this.flights;
    }

    public void sortFlights() {
        // TODO: add sort by different criteria if code is same
        for (int i = 0; i < this.flights.length; ++i) {
            for (int j = i + 1; j < this.flights.length; ++j) {
                if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) > 0)
                    swap(i, j);

                if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) == 0
                        && this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination()) > 0)
                    swap(i, j);

                if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) == 0
                        && this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination()) == 0
                        && this.flights[i].getCode().compareToIgnoreCase(this.flights[j].getCode()) > 0) {
                    swap(i, j);

                }
            }
        }
    }

    public void sortFlightsAlt() {
        for (int i = 0; i < this.flights.length; i++) {
            for (int j = i + 1; j < this.flights.length; j++) {
                if (this.flights[i].getLandHour().getHora() > this.flights[j].getLandHour().getHora())
                    swap(i, j);
                if (this.flights[i].getLandHour().getHora() == this.flights[j].getLandHour().getHora()) {
                    if (this.flights[i].getLandHour().getMinuto() > this.flights[j].getLandHour().getMinuto())
                        swap(i, j);
                    if (this.flights[i].getLandHour().getMinuto() == this.flights[j].getLandHour().getMinuto()) {
                        if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) > 0)
                            swap(i, j);

                        if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) == 0
                                && this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination()) > 0)
                            swap(i, j);

                        if (this.flights[i].getOrigin().compareToIgnoreCase(this.flights[j].getOrigin()) == 0
                                && this.flights[i].getDestination().compareToIgnoreCase(this.flights[j].getDestination()) == 0
                                && this.flights[i].getCode().compareToIgnoreCase(this.flights[j].getCode()) > 0) {
                            swap(i, j);
                        }
                    }
                }
            }
        }
    }


    private void swap(int i, int j) {
        Flight temp = this.flights[i];
        this.flights[i] = this.flights[j];
        this.flights[j] = temp;

    }

    public static Flight[] generateFlights() {
        Flight[] listFlights = new Flight[4];
        Flight fl1 = new Flight("LH1523");
        Flight fl2 = new Flight("UI1943");
        Flight fl3 = new Flight("RA1324");
        Flight fl4 = new Flight("NA1074");
        fl1.setOrigin("Munich");
        fl1.setDestination("Frankfurt");
        fl2.setOrigin("Kyiv");
        fl2.setDestination("Oslo");
        fl3.setOrigin("Dublin");
        fl3.setDestination("StockHolm");
        fl4.setOrigin("Dublin");
        fl4.setDestination("Tallinn");
        fl1.setHour(new Hora(12, 00));
        fl2.setHour(new Hora(13, 20));
        fl3.setHour(new Hora(13, 30));
        fl4.setHour(new Hora(14, 00));
        fl1.setDuration(30);
        fl2.setDuration(160);
        fl3.setDuration(150);
        fl4.setDuration(190);
        listFlights[0] = fl1;
        listFlights[1] = fl2;
        listFlights[2] = fl3;
        listFlights[3] = fl4;
        return listFlights;
    }

    public String toString() {
        String print = "";
        for (int i = 0; i < this.flights.length; ++i) {
            print += this.flights[i].toString();
            print += "\n";
        }
        return print;
    }
}