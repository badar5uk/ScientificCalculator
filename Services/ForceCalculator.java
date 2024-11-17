/*
    This service is used to calculate force of an object
    A user input for mass and acceleration are taken via a scanner
    The force is calculated using F = ma
    m = mass
    a= acceleration
 */

package ScientificCalculator.Services;

import ScientificCalculator.Entities.PhysicsData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class ForceCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void force(){
        PhysicsData physics = new PhysicsData();
        System.out.println("Enter Mass: ");
        physics.setMass(scanner.nextFloat());
        System.out.println("Enter Acceleration: ");
        physics.setAcceleration(scanner.nextFloat());
    }
    @Override
    public void calculate() {

    }
}
