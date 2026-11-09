/*
Experiment: Calculate Area and Perimeter of Different Shapes Using User-Defined Package

Aim:
To write a Java program to calculate the area and perimeter of a square, circle, and triangle using classes defined in a user-defined package named Shape.

Algorithm:

1. Import the Shape package and Scanner class.
2. Read the side of the square from the user.
3. Create a Square object and calculate its area and perimeter.
4. Read the radius of the circle.
5. Create a Circle object and calculate its area and perimeter.
6. Read the three sides of the triangle.
7. Create a Triangle object and calculate its area and perimeter.
8. Display the results.
9. Close the Scanner and stop the program.


/*
Program 4: Calculate.java
*/

import shape.*;
import java.util.Scanner;

public class Calculate {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Calculate square area and perimeter
    System.out.print("Enter the side of the Square: ");
    int s = sc.nextInt();

    Square sq = new Square(s);
    System.out.println("Perimeter of Square is " + sq.perimeter());
    System.out.println("Area of Square is " + sq.area());

    // Calculate circle area and perimeter
    System.out.print("Enter the radius of the Circle: ");
    int r = sc.nextInt();

    Circle ci = new Circle(r);
    System.out.println("Perimeter of Circle is " + ci.perimeter());
    System.out.println("Area of Circle is " + ci.area());

    // Calculate triangle area and perimeter
    System.out.print("Enter Side1 of the Triangle: ");
    int s1 = sc.nextInt();

    System.out.print("Enter Side2 of the Triangle: ");
    int s2 = sc.nextInt();

    System.out.print("Enter Side3 of the Triangle: ");
    int s3 = sc.nextInt();

    Triangle t = new Triangle(s1, s2, s3);
    System.out.println("Perimeter of Triangle is " + t.perimeter());
    System.out.println("Area of Triangle is " + t.area());

    sc.close();
}


}

/*
Sample Output:
Enter the side of the Square: 4
Perimeter of Square is 16
Area of Square is 16
Enter the radius of the Circle: 7
Perimeter of Circle is 43.982297150257104
Area of Circle is 153.93804002589985
Enter Side1 of the Triangle: 3
Enter Side2 of the Triangle: 4
Enter Side3 of the Triangle: 5
Perimeter of Triangle is 12
Area of Triangle is 6.0

Result:
Thus, the Java program to calculate the area and perimeter of a square, circle, and triangle using a user-defined package was executed successfully.
*/