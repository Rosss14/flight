public class Test {
    static Hora hora1 = new Hora(14, 30);
    static FlightOperator fo = new FlightOperator(FlightOperator.generateFlights());



    public static void testComparison(String[] args) {
        // TODO: add 'for loop' for comparison
    }


    public static void main(String[] args) {
        System.out.println(fo);
        fo.sortFlights();
        System.out.println(fo);

    }
}