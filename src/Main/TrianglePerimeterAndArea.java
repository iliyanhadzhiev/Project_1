package Main;

import java.util.Scanner;

public class TrianglePerimeterAndArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is side A of the triangle? ");
        String firstEntry = scanner.nextLine();
        double sideA = Double.parseDouble(firstEntry);

        System.out.println("What is side B of the triangle? ");
        String secondEntry = scanner.nextLine();
        double sideB = Double.parseDouble(secondEntry);

        System.out.println("What is side C of the triangle? ");
        String thirdEntry = scanner.nextLine();
        double sideC = Double.parseDouble(thirdEntry);

        double trianglePerimeter = sideA + sideB + sideC;
        double s = (trianglePerimeter) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula

        System.out.println("The perimeter of the triangle is " + trianglePerimeter);
        System.out.println("The area of the triangle is " + area);
        System.out.printf("Triangle's area is: %.2f",area);
    }
}
