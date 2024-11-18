package ScientificCalculator.Services;

import ScientificCalculator.Entities.PhysicsData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface{

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        PhysicsData physics = new PhysicsData();
        System.out.println("Enter Mass: ");
        physics.setMass(scanner.nextFloat());
        System.out.println("Enter Volume: ");
        physics.setAcceleration(scanner.nextFloat());
    }
}
