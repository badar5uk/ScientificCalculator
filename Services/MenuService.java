package ScientificCalculator.Services;

import java.util.Scanner;

public class MenuService {

    static Scanner scanner = new Scanner(System.in);// initiate scanner for menu input

    public static void mainMenu() {
        System.out.println("\n"+"welcome to my scientific Calculator app" + "\n" +
                "Please pick an option: \n");
        Boolean exitFlag = true; // exit flag to end program if exit option is picked
        while (exitFlag) {
            System.out.println(
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

                    // if first option is chosen, the Final velocity calculator is called
                    FinalVelocityCalculator velocity = new FinalVelocityCalculator();
                    velocity.calculate();

                } else if (mainMenuInput.equals(2)) {

                    // if second option is chosen, Displacement Calculator is called
                    DisplacementCalculator displacement = new DisplacementCalculator();
                    displacement.calculate();

                } else if (mainMenuInput.equals(3)) {

                    // if third option is chosen, Final velocity squared is called
                    FinalVelocitySquaredCalculator velocitySquared = new FinalVelocitySquaredCalculator();
                    velocitySquared.calculate();

                } else if (mainMenuInput.equals(4)) {

                    // if fourth option is chosen, Area of circle is called
                    AreaofCircleCalculator Area = new AreaofCircleCalculator();
                    Area.calculate();

                } else if (mainMenuInput.equals(5)) {

                    // if fifth option is chosen, simple interest calculator is called
                    SimpleinterestCalculator simpleInterest = new SimpleinterestCalculator();
                    simpleInterest.calculate();

                } else if (mainMenuInput.equals(6)) {

                    // if sixth option is chosen, Force calculator is called
                    ForceCalculator force = new ForceCalculator();
                    force.calculate();

                } else if (mainMenuInput.equals(7)) {

                    // if seventh option is chosen, Density calculator is called
                    DensityCalculator density = new DensityCalculator();
                    density.calculate();

                } else if (mainMenuInput.equals(8)) {

                    // if eighth option is chosen, Compound interest calculator is called
                    CompoundInterest compoundInterest = new CompoundInterest();
                    compoundInterest.calculate();

                } else if (mainMenuInput.equals(9)) {

                    // if ninth option is chosen, scanner input is closed and it exits
                    System.out.println("Good Bye");
                    scanner.close();
                    exitFlag = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

        }
    }
}

