public class Ght {
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
        fl4.setOrigin("Paris");
        fl4.setDestination("Tallinn");
        listFlights[0] = fl1;
        listFlights[1] = fl2;
        listFlights[2] = fl3;
        listFlights[3] = fl4;
        return listFlights;
    }

    public static void main(String[] args) {
        Flight[] listFlights = generateFlights();

        for (int i = 0; i < listFlights.length; ++i) System.out.println(listFlights[i]);


    }


}
