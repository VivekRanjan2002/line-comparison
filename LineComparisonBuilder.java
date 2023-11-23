import java.util.Scanner;

class LineComparisonBuilder {
    public static double lengthComputation(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        
        // getting input of points from user 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first Point X-cordinate: ");
        double firstxcord = sc.nextDouble();
        System.out.println("Please Enter the first Point Y-cordinate : ");
        double firstycord = sc.nextDouble();
        System.out.println("Please Enter the second Point X-cordinate : ");
        double secondxcord = sc.nextDouble();
        System.out.println("Please Enter the second Point Y-cordinate : ");
        double secondycord = sc.nextDouble();

        // invoking length computation method on the given points by user 
        System.out.println("The total length of the line formed by the Points (" + firstxcord +"," +firstycord+
        " ) and ( " +secondxcord + "," + secondycord+ ") is :" + lengthComputation(firstxcord,firstycord,secondxcord,secondycord));
    }
}