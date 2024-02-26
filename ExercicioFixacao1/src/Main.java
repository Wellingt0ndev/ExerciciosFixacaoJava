import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());

        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());

        System.out.printf("DIAGONAL = %.2f\n" , rectangle.diagonal());

        scanner.close();
    }
}