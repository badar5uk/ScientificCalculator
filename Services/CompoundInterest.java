/*
    This service is used to calculate Compound interest
    Scanners are used to take user input for Principal amount, Rate and Time
    compound interest is calculated using: CI = P × (1 + R ÷ 100)^T - P
    P = Principal
    R= rate
    T = time
 */

package ScientificCalculator.Services;

import ScientificCalculator.Entities.InterestData;
import ScientificCalculator.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class CompoundInterest implements CalculatorInterface {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void calculate() {
        // Using scanner to take input and set them
        // to the interest data attributes
        InterestData interest = new InterestData();
        System.out.println("Enter Principal value: ");
        Float p = scanner.nextFloat();
        interest.setPrincipal(p);
        System.out.println("Enter rate: ");
        Float r = scanner.nextFloat();
        interest.setRate(r);
        System.out.println("Enter duration: ");
        Float t = scanner.nextFloat();
        interest.setTime(t);

        // CI = P × (1 + R ÷ 100)^T - P
        Float compoundInterest = (float) (p * Math.pow((1 + (r/100)),t) - p);

        System.out.println("The compound Interest is equal to: "+ compoundInterest+"\n");
    }
}
