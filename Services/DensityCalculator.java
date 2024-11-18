/*
    This service is used to calculate density of an object
    A user input for mass and volume are taken via a scanner
    The force is calculated using density = m ÷ v
    m = mass
    v= volume
 */

package ScientificCalculator.Services;

import ScientificCalculator.Entities.PhysicsData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface{

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        // Using scanner to take input and set them
        // to the physics object attributes
        PhysicsData physics = new PhysicsData();
        System.out.println("Enter Mass: ");
        Float m = scanner.nextFloat();
        physics.setMass(m);
        System.out.println("Enter Volume: ");
        Float v = scanner.nextFloat();
        physics.setVolume(v);

        Float density = m/v; // Density = Mass ÷ Volume

        System.out.println("The density is equal to: "+density + "\n");
    }
}
