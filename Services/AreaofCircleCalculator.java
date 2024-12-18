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

    @Override
    public void calculate() {
        // Using scanner to take input and set them
        // to the circle entity attributes
        CircleData circle = new CircleData();
        System.out.println("Enter radius to calculate Area: ");
        Float r = scanner.nextFloat();
        circle.setRadius(r);
        Float area = (float) (Math.PI * Math.pow(r,2)); // A = πr²
        System.out.println("The area of the circle with radius "
                + circle.getRadius() + " is equal to: " + area+"\n");
    }
}

