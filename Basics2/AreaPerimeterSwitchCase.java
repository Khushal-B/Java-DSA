

import java.util.Scanner;

public class AreaPerimeterSwitchCase {
    public static void main(String[] args){
        // NOTE this
        System.out.println("Enter\nnumber " +
                "for\n" +
                "action " +
                ":");
        int n=-1;
        while (n!=0) {
            System.out.println("""    
                    1.Area Of Circle Java Program
                    2.Area Of Triangle
                    3.Area Of Rectangle Program
                    4.Area Of Isosceles Triangle
                    5.Area Of Parallelogram
                    6.Area Of Rhombus
                    7.Area Of Equilateral Triangle
                    8.Perimeter Of Circle
                    9.Perimeter Of Equilateral Triangle
                    10.Perimeter Of Parallelogram
                    11.Perimeter Of Rectangle
                    12.Perimeter Of Square
                    13.Perimeter Of Rhombus
                    14.Volume Of Cone Java Program
                    15.Volume Of Prism
                    16.Volume Of Cylinder
                    17.Volume Of Sphere
                    18.Volume Of Pyramid
                    19.Curved Surface Area Of Cone
                    20.Total Surface Area Of Sphere"""); //Trpile quotes prints new sentences in new lines

            Scanner sc = new Scanner(System.in);
            //sc.close(); OR
            // try (Scanner sc = new Scanner(System.in)) {code where where input is req}

            n = sc.nextInt();

            float a, b, c, d;
            switch (n) {
                case 1 -> {
                    System.out.println("Enter radius");
                    int r = sc.nextInt();
                    System.out.println(3.14 * r * r);
                }
                case 2 -> {
                    System.out.println("Enter height and base");
                    int h = sc.nextInt();
                    int g = sc.nextInt();
                    System.out.println(h * g * 0.5);
                }
                case 3 -> {
                    System.out.println("Enter 2 sides");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(a * b);
                }
                case 4 -> {
                    System.out.println("Enter 2 sides and angle between them");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    c = (float)Math.toRadians(sc.nextFloat());
                    //Note This
                    d = (float) Math.sin(c);
                    d = 0.5f * a * b * d;
                    System.out.println(d);
                }
                case 5 -> {
                    System.out.println("Enter height and base");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(a * b);
                }
                case 6 -> {
                    System.out.println("Enter 2 diagonals");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(a * b * 0.5);
                }
                case 7 -> {
                    System.out.println("Enter side");
                    a = sc.nextFloat();
                    b = (float) Math.sqrt(3) / 4 * a * a;
                    System.out.println(b);
                }
                case 8 -> {
                    System.out.println("Enter radius");
                    double e = sc.nextDouble();
                    System.out.println(2 * 3.14 * e);
                }
                case 9 -> {
                    System.out.println("Enter side");
                    a = sc.nextFloat();
                    System.out.println(3 * a);
                }
                case 10, 11 -> {
                    System.out.println("Enter 2 sides");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println((a + b) * 2);
                }
                case 12, 13 -> {
                    System.out.println("Enter a side");
                    int k = sc.nextInt();
                    System.out.println(4 * k);
                }
                case 14 -> {
                    System.out.println("Enter h and r");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(b * b * a * 3.14 / 3);
                }
                case 15 -> System.out.println("Not available");
                case 16 -> {
                    System.out.println("Enter height and radius");
                    int z = sc.nextInt();
                    int y = sc.nextInt();
                    int x = (int) (y * y * z * 3.14);
                    System.out.println(x);
                }
                case 17 -> {
                    System.out.println("Enter r");
                    long o = sc.nextLong();
                    float ans = (4f / 3) * 3.14f * o * o * o;
                    System.out.println(ans);
                }
                case 18 -> {
                    System.out.println("Enter l,w,h");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    c = sc.nextFloat();
                    d = a * b * c / 3;
                    System.out.println(d);
                }
                case 19 -> {
                    System.out.println("Enter r and l");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(a * b * 3.14);
                }
                case 20 -> {
                    System.out.println("Enter radius");
                    int rad = sc.nextInt();
                    double an = 4 * rad * rad * 3.14;
                    System.out.println(an);
                }
                default -> System.out.println("Invalid choice entered");

            }
        }
    }
}
