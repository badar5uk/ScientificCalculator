package ScientificCalculator.Services;

import java.util.Scanner;

public class MenuService {

    Scanner scanner = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("welcome to my scientific Calculator app"+"\n" +
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
    }
}
