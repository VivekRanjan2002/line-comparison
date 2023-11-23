import java.util.Scanner;

class LineComparisonBuilder {

    // length computation method on the given points by user 
    public static double lengthComputation(String line) {
        
         // getting input of points from user 
         Scanner sc = new Scanner(System.in);
         String literal = " is : ";  
        System.out.println("Please Enter the first Point X-cordinate of "+ line + literal);
        double x1 = sc.nextDouble();
        System.out.println("Please Enter the first Point Y-cordinate of " + line +literal);
        double y1 = sc.nextDouble();
        System.out.println("Please Enter the second Point X-cordinate : " + line +literal);
        double x2 = sc.nextDouble();
        System.out.println("Please Enter the second Point Y-cordinate : " + line + literal);
        double y2 = sc.nextDouble();

        double length= Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The total length of the "+ line+ " formed by the Points (" + x1 +"," +y1+
                " ) and ( " + x2 + "," + y2 + ") is :" + length);
        return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        
       
        // invoking length computation method
        double length1 = lengthComputation("line 1");
        double length2 = lengthComputation("line 2");
       
        // checking equality of two lines 
     
        String str1 = Double.toString(length1);
        String str2 = Double.toString(length2);

        System.out.println(str1.equals(str2)); // true or false;

         
        /**comparing two lines
        if str1 == str2 return 0
        if str1>str2 return +ve
        if str1<str2 return -ve
        **/
        System.out.println(str1.compareTo(str2)); 
        System.out.println(str2.compareTo(str1));
    }
}