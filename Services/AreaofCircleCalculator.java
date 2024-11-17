/*
    This service is used to calculate the area of a circle,
    A user input for the radius is taken via a scanner input
    The area of a circle is calculated using A = πr²
    r = radius
 */

package ScientificCalculator.Services;

import ScientificCalculator.Entities.CircleData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class AreaofCircleCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void circleRadius(){
        CircleData circle = new CircleData();
        System.out.println("Enter radius to calculate Area: ");
        circle.setRadius(scanner.nextFloat());
    }
    @Override
    public void calculate() {

    }
}
