/*
Experiment: Arithmetic Operations Using User-Defined Packages in Java

Aim:
To write a Java program to perform addition, subtraction, multiplication, and division using user-defined packages.

Algorithm:

1. Create four packages named add, sub, mul, and div.
2. Define the Add class in the add package.
3. Define the Sub class in the sub package.
4. Define the Mul class in the mul package.
5. Define the Div class in the div package.
6. Create a class named ArithDemo.
7. Import all four packages into ArithDemo.
8. Create objects for the Add, Sub, Mul, and Div classes.
9. Perform arithmetic operations on 20 and 10.
10. Display the results.


/*
Program 5: ArithDemo.java
*/

import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo {

public static void main(String[] args) {

    // Create objects of package classes
    Add ad = new Add();
    Sub su = new Sub();
    Mul mu = new Mul();
    Div di = new Div();

    // Perform arithmetic operations
    ad.addop(20, 10);
    su.subop(20, 10);
    mu.mulop(20, 10);
    di.divop(20, 10);
}


}

/*
Sample Output:
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2.0

Result:
Thus, the Java program to perform arithmetic operations using user-defined packages was executed successfully.
*/