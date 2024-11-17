/*
    This service is used to calculate force of an object
    A user input for mass and acceleration are taken via a scanner
    The force is calculated using F = ma
    m = mass
    a= acceleration
 */


package ScientificCalculator.Services;

import ScientificCalculator.Entities.InterestData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class SimpleinterestCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void interest(){
        InterestData interest = new InterestData();
        System.out.println("Enter principal amount: ");
        interest.setPrincipal(scanner.nextFloat());
        System.out.println("Enter Rate: ");
        interest.setRate(scanner.nextFloat());
        System.out.println("Enter Duration: ");
        interest.setTime(scanner.nextFloat());
    }
    @Override
    public void calculate() {

    }
}
