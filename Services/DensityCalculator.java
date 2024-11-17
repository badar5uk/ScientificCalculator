package ScientificCalculator.Services;

import ScientificCalculator.Entities.MotionData;
import ScientificCalculator.Entities.PhysicsData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void density(){
        PhysicsData physics = new PhysicsData();
        System.out.println("Enter Mass: ");
        physics.setMass(scanner.nextFloat());
        System.out.println("Enter Volume: ");
        physics.setAcceleration(scanner.nextFloat());
    }

    @Override
    public void calculate() {

    }
}
