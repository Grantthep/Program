public class MilestoKm {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETER_PER_MILES = 1.609;
        double kilometer = KILOMETER_PER_MILES * miles;
        System.out.println("There are " + kilometer + " kilometer in " + miles + " miles. ");
    }

}
