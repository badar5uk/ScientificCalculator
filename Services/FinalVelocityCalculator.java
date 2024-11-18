/*
    This service is used to calculate the final velocity of an object.
    A scanner is used to take input for the Initial Velocity, Acceleration and time.
    The final velocity is calculated using v = u + at
    u = initial velocity
    a = acceleration
    t = time
 */

package ScientificCalculator.Services;
import ScientificCalculator.Entities.MotionData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class FinalVelocityCalculator implements CalculatorInterface{

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        MotionData motion= new MotionData();
        System.out.println("Enter initial Velocity: ");
        Float u = scanner.nextFloat();
        motion.setInitialVelocity(u);
        System.out.println("Enter Acceleration: ");
        Float a = scanner.nextFloat();
        motion.setAcceleration(a);
        System.out.println("Enter time: ");
        Float t = scanner.nextFloat();
        motion.setTime(t);

        Float finalVelocity = u + (a*t);

        System.out.println("The final velocity is equal to : " + finalVelocity + "\n");
    }
}
