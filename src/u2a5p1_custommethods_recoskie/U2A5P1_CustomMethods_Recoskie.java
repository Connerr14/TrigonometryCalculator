 /* Created by Conner Recoskie,
    April 8th,
    This program takes in a reponse from the user, it then collects data for what
    is needed to fulfill the task chosen. Then it calulates the outcome using a 
    method and displays the calculated answer back to the user.
 */
package u2a5p1_custommethods_recoskie;

import java.util.Scanner;

public class U2A5P1_CustomMethods_Recoskie {
    /*
        promptingMessage
    
        This method outputs the options of question choices the user in a 
        user-freindly way and repeats until the user exits (keying in 6).
    
        Parameteres: None
    
        Returns: void
    */
    
    public static void promptingMessage ()
    {
        System.out.println("-------User Question Options-------");
        System.out.println("Enter 1 to find the area of a rectangle. Enter 2 to"
                + " find the area of a triangle. Enter 3 to find the radius of"
                + " a circle. Enter 4 to find the diameter of a circle. Enter 5"
                + " to find the hypotenuse of a right angled triangle. Enter 6"
                + " to exit.");
    }
    
    /* 
        areaOfRectangle
    
        This method recives the length and width values of a rectangle. It then 
        calculates and returns the area of the rectangle.
        
        Parameters: double, double
    
        Returns: void
    
    */
    
    public static double areaOfRectangle (double length, double width)
    {
        double area = length * width;
        return (area);
    }
    
    /*
        areaOfTriangle
        
        This method recives the base and height values of a triangle. It then
        calculates and returns the area of the triangle.
    
        Parameters: double, double
    
        Returns: double
    */
    
    public static double areaOfTriangle (double base, double height)
    {
        double triangleArea = (base * height)/2;
        return (triangleArea);
    }
    
    /*
        radiusOfCircle
        
        This method recives the diameter of a circle. It then calculates and
        returns the radius of the circle.
    
        Parameters: double
    
        Returns: double
    */
    
    public static double radiusOfCircle (double diameter)
    {
        double radius = diameter/2;
        return (radius);
    }
    
    /* 
        diameterOfCircle
        
        This method recives the circumference of a circle. It then calculates 
        and returns the diameter of the circle.
    
        Parameters: double
    
        Returns: double 
    */
    
    public static double diameterOfCircle (double circumference)
    {
        double diameter1 = circumference/3.14;
        return (diameter1);
        
    }
    
    /*
        hypotenuseOfTriangle
        
        This method recives two side lengths of a right angled triangle. It then
        caluculates and returns the hypotenuse of the triangle.
    
        Parameters: double
    
        Returns: double
    */
    
    public static double hypotenuseOfTriangle (double side1, double side2)
    {
        double hypotenuse = Math.hypot(side1, side2);
        return (hypotenuse);
    }

  
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int usersChoice = 0;
        
        // Initializing varibles for the calulating area of a rectangle task.
        double rectangleLength;
        double rectangleWidth;
        double area;
        
        // Initializing variables for the calculating area of a triangle task.
        double triangleBase;
        double triangleHeight;
        double triangleArea;
        
        /* Initializing variables for the calculating the radius of a circle
           task.*/
        double circleDiameter;
        double circleRadius;
        
        // Initializing variables for the calculating the diameter task. 
        double circleCircumference;
        double diameter;
        
        // Initializing variables for the calculating the hypotenuse task.
        double triSide1;
        double triSide2;
        double hypotenuse;
        
        /* Initializing a while loop to run the prompt message untill
           a number other than 6 is keyed in */
        while (usersChoice != 6)
        {
            promptingMessage();
        
         usersChoice = keyedInput.nextInt();
        
        /* For the first method (rectangle area). Gets inputs, calls method and 
        outputs area. */
        if (usersChoice == 1)
        {
            // Asking and getting users input.
            System.out.println("Please enter the length of the rectangle (cm):");
            rectangleLength = keyedInput.nextDouble();
            
            // Asking and getting users input.
            System.out.println("Please enter the width of the rectangle (cm):");
            rectangleWidth = keyedInput.nextDouble();
            
            area = areaOfRectangle(rectangleLength, rectangleWidth);
            
            System.out.println("The area of the rectangle is: " + area + " cm");
        }
        
        /* For the second method (Triangle area). Gets inputs, calls method and 
        outputs area. */
        else if (usersChoice == 2)
        {
            // Asking and getting users input.
            System.out.println("Please enter the base of the triangle (cm):");
            triangleBase = keyedInput.nextDouble();
            
            // Asking and getting users input.
            System.out.println("Please enter the height of the triangle (cm):");
            triangleHeight = keyedInput.nextDouble();
            
            // Passing the values from the user to the designated method.
            triangleArea = areaOfTriangle(triangleBase, triangleHeight);
            
            System.out.println("The area of the triangle is: " + triangleArea +
                    " cm");  
        }
        
        /* For the third method (radius). Gets inputs, calls method and 
        outputs radius. */
        else if (usersChoice == 3)
        {
            // Asking and getting users input.
            System.out.println("Please enter the diameter of the circle:");
            circleDiameter = keyedInput.nextDouble();
            
            // Passing the values from the user to the designated method.
            circleRadius = radiusOfCircle(circleDiameter);
            
            // Rounding the users answer
            circleRadius = circleRadius * 100;
            circleRadius = Math.round(circleRadius);
            circleRadius = circleRadius/100;
            
            System.out.println("The radius of the circle is: " + circleRadius);
        }
        
        /* For the fourth method (diameter). Gets inputs, calls method and 
        outputs diameter. */
        else if (usersChoice == 4)
        {
            // Asking and getting users input.
            System.out.println("Please enter the circumference of the circle:");
            circleCircumference = keyedInput.nextDouble();
            
            // Passing the values from the user to the designated method.
            diameter = diameterOfCircle(circleCircumference);
            
            // Rounding the users answer.
            diameter = diameter * 100;
            diameter = Math.round(diameter);
            diameter = diameter/100;
                
            System.out.println("The diameter of your circle is: " + diameter);
        }
        
        /* For the fifth method (hypotenuse). Gets inputs, calls method and 
        outputs hypotenuse. */
        else if (usersChoice == 5)
        {
            // Asking and getting user input.
            System.out.println("Please enter the length of one side of the "
                    + "triangle:");
            triSide1 = keyedInput.nextDouble();
            
            // Asking and getting users input.
            System.out.println("Please enter the other side length of the "
                    + "triangle:");
            triSide2 = keyedInput.nextDouble();
            
            // Passing the values from the user to the designated method.
            hypotenuse = hypotenuseOfTriangle(triSide1, triSide2);
            
            // Rounding the users answer.
            hypotenuse = hypotenuse * 100;
            hypotenuse = Math.round(hypotenuse);
            hypotenuse = hypotenuse/100;
            
            System.out.println("The hypotenuse of the triangle is: " +
                    hypotenuse);
        }
        
        }
        
        /* If the user wants to exit, (keys in 6), they will be prompted with a 
       goodbye message. */
        if (usersChoice == 6)
        {
            System.out.println("You exited, Goodbye!");
        }
    }
}
