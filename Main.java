import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("体重（kg）を入力してください: ");
        double weight = scanner.nextDouble();

        System.out.print("身長（m）を入力してください: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("あなたのBMIは %.2f です。\n", bmi);
    }
}