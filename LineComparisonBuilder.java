import java.util.Scanner;

class LineComparisonBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        // creating two lines with respective cordinates
        Line L1 = new Line("Line1",1, 2, 3, 4);
        Line L2 = new Line("Line2", 6, 9, 12, 15);

       
        

        // calling equality method of line L1 with Line L2 as its parameter
        L1.equality(L2); 

        // calling comparison method of line L1 with Line L2 as its parameter
      L1.comparison(L2);
    }
}

class Line {
    String name;
    int x1, x2, y1, y2;
    double length;

    Line(String name, int x1, int y1, int x2, int y2) {
        this.name = name;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.length = lengthComputation();  // invoking lengthComparison method in its constructor only 
    }

    Line(Line line) {
        this.name = line.name;
        this.x1 = line.x1;
        this.x2 = line.x2;
        this.y1 = line.y1;
        this.y2 = line.y2;
        this.length = line.length;
    }

    double lengthComputation() {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The total length of the " + this.name + " formed by the Points (" + x1 + "," + y1 +
                " ) and ( " + x2 + "," + y2 + ") is :" + length);
        return length;
    }
 

   
    // making equality as member function and other line required for equalsto() is obtained from function argument
    void equality(Line L1) {
        String str1 = Double.toString(length);
        String str2 = Double.toString(L1.length);
        boolean flag = str1.equals(str2); // true or false
        if (flag)
            System.out.println(this.name + " is equal to " + L1.name);
        else
            System.out.println(this.name + " is not equal to " + L1.name);

    }
    
    //making comparison as member function and other line required for compareTo() is obtained from fnc arg
    void comparison(Line L1) {
         int flag = Double.compare(this.length, L1.length);
         if (flag == 0)
             System.out.println(this.name + " is equal to " + L1.name);
         else if (flag > 0)
             System.out.println(this.name + " is greater than " + L1.name);
        else System.out.println(this.name +" is less than "+ L1.name);
    }

   
}

