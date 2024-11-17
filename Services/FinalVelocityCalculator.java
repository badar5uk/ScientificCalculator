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

public class FinalVelocityCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void velocity(){
        MotionData motion = new MotionData();
        System.out.println("Enter initial Velocity: ");
        motion.setInitialVelocity(scanner.nextFloat());
        System.out.println("Enter Acceleration: ");
        motion.setAcceleration(scanner.nextFloat());
        System.out.println("Enter time: ");
        motion.setTime(scanner.nextFloat());
    }
    @Override
    public void calculate() {
    }
}
