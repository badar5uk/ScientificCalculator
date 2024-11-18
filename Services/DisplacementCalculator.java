/*
    This service is used to calculate the displacement
    A scanner is used to take input for the Initial Velocity, Acceleration and time.
    The displacement is calculated using s = ut + ½at²
    u = initial velocity
    a = acceleration
    t = time
 */

package ScientificCalculator.Services;

import ScientificCalculator.Entities.MotionData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DisplacementCalculator implements CalculatorInterface{

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

    }
}