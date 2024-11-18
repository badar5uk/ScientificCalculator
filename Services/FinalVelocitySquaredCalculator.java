/*
    This service is used to calculate the final velocity of an object.
    A scanner is used to take input for the Initial Velocity, Acceleration and time.
    The final velocity squared is calculated using v² = u² + 2as
    u = initial velocity
    a = acceleration
    s = distance traveled
 */

package ScientificCalculator.Services;
import ScientificCalculator.Entities.MotionData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class FinalVelocitySquaredCalculator implements CalculatorInterface{

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        // Using scanner to take input and set them
        // to the motion object attributes
        Scanner scanner = new Scanner(System.in);
        MotionData motion= new MotionData();
        System.out.println("Enter initial Velocity: ");
        Float u = scanner.nextFloat();
        motion.setInitialVelocity(u);
        System.out.println("Enter Acceleration: ");
        Float a = scanner.nextFloat();
        motion.setAcceleration(a);
        System.out.println("Enter distance traveled: ");
        Float s = scanner.nextFloat();

        //final velocity² = u² + 2as
        Float velocitySquared = (float) (Math.pow(u,2) + 2*a*s);

        System.out.println("The final velocity is equal to : " + velocitySquared + "\n");
    }
}
