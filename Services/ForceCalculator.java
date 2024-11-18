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

    @Override
    public void calculate() {
        // Using scanner to take input and set them
        // to the physics object attributes
        PhysicsData physics = new PhysicsData();
        System.out.println("Enter Mass: ");
        Float m = scanner.nextFloat();
        physics.setMass(m);
        System.out.println("Enter Acceleration: ");
        Float a = scanner.nextFloat();
        physics.setAcceleration(a);

        Float force = m*a;// force = mass * acceleration

        System.out.println("The force is equal to "+force +"\n");
    }
}
