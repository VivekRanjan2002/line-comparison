import java.util.Scanner;

class LineComparisonBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        // creating two lines with respective cordinates
        Line L1 = new Line("Line1",1, 2, 3, 4);
        Line L2 = new Line("Line2", 6, 9, 12, 15);

        // invoking lengthComparison method
        double length1 = L1.lengthComputation();
        double length2 = L2.lengthComputation();

        // checking equality of two lines

        String str1 = Double.toString(length1);
        String str2 = Double.toString(length2);

        System.out.println(str1.equals(str2)); // true or false;

        /**
         * comparing two lines
         * if str1 == str2 return 0
         * if str1>str2 return +ve
         * if str1<str2 return -ve
         **/
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

      
    }
}

class Line {
    String name;
    int x1, x2, y1, y2;

    Line(String name, int x1, int y1, int x2, int y2) {
        this.name = name;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    Line(Line line) {
        this.name = line.name;
        this.x1 = line.x1;
        this.x2 = line.x2;
        this.y1 = line.y1;
        this.y2 = line.y2;
    }

    double lengthComputation() {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The total length of the " + this.name + " formed by the Points (" + x1 + "," + y1 +
                " ) and ( " + x2 + "," + y2 + ") is :" + length);
        return length;
    }

   
}