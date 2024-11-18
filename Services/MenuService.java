package ScientificCalculator.Services;

import java.util.Scanner;

public class MenuService {

    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("welcome to my scientific Calculator app" + "\n" +
                    "Please pick an option: \n" +
                    "1. Final Velocity (v = u + at)\n" +
                    "2. Displacement (s = ut + ½at²)\n" +
                    "3. Final Velocity Squared (v² = u² + 2as)\n" +
                    "4. Area of a Circle (A = πr²)\n" +
                    "5. Simple Interest (SI = P × R × T ÷ 100)\n" +
                    "6. Force (F = ma)\n" +
                    "7. Density (Density = Mass ÷ Volume)\n" +
                    "8. Compound Interest (CI = P × (1 + R ÷ 100)^T - P)\n" +
                    "9. Exit");
            try {
                Integer mainMenuInput = scanner.nextInt();
                if (mainMenuInput.equals(1)) {
                    FinalVelocityCalculator velocity = new FinalVelocityCalculator();
                    velocity.calculate();
                } else if (mainMenuInput.equals(2)) {
                    DisplacementCalculator displacement = new DisplacementCalculator();
                    displacement.calculate();
                } else if (mainMenuInput.equals(3)) {
                    FinalVelocitySquaredCalculator velocitySquared = new FinalVelocitySquaredCalculator();
                    velocitySquared.calculate();
                } else if (mainMenuInput.equals(4)) {
                    AreaofCircleCalculator Area = new AreaofCircleCalculator();
                    Area.calculate();
                } else if (mainMenuInput.equals(5)) {
                    SimpleinterestCalculator simpleInterest = new SimpleinterestCalculator();
                    simpleInterest.calculate();
                } else if (mainMenuInput.equals(6)) {
                    ForceCalculator force = new ForceCalculator();
                    force.calculate();
                } else if (mainMenuInput.equals(7)) {
                    DensityCalculator density = new DensityCalculator();
                    density.calculate();
                } else if (mainMenuInput.equals(8)) {
                    CompoundInterest compoundInterest = new CompoundInterest();
                    compoundInterest.calculate();
                } else if (mainMenuInput.equals(9)) {
                    exitFlag = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

        }
    }
}

