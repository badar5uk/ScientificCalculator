/*
    This service is used to calculate Simple interest in a given duration
    Scanners are used to take user input for Principal amount, Rate and Time
    Simple interest is calculated using SI = P × R × T ÷ 100
    P = Principal
    R= rate
    T = time
 */


package ScientificCalculator.Services;

import ScientificCalculator.Entities.InterestData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class SimpleinterestCalculator implements CalculatorInterface {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        InterestData interest = new InterestData();
        System.out.println("Enter principal amount: ");
        Float p = scanner.nextFloat();
        interest.setPrincipal(p);
        System.out.println("Enter Rate: ");
        Float r = scanner.nextFloat();
        interest.setRate(r);
        System.out.println("Enter Duration: ");
        Float t = scanner.nextFloat();
        interest.setTime(t);

        Float simpleInterest = (p*r*t) / 100;

        System.out.println("The simple interest is equal to: " + simpleInterest + "\n");
    }
}

