public class Main {
    public static void main(String[] args) {

        double newCenti = calcFeetAndInchesToCentimeters(5,0);
        int newFeet = calcFeetAndInchesToCentimeters(60);


    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0 ) && ((inches >= 0) && (inches <=12))) {
          double centimeters = ((feet * 12) + inches) * 2.54;
            System.out.println("its " + centimeters);
        }
        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if(inches >= 0 ) {
            int feet = (inches /12);
            int newInches = inches % 12;

            calcFeetAndInchesToCentimeters(feet,newInches);

            System.out.println(inches + " inches is " + feet + " feet and " + newInches + " inches");

        } return -1;
    }
}
