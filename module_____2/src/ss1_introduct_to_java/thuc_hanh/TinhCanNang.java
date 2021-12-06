package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double with , height , bmi ;

        System.out.println("nhập cân nặng");
        with = scanner.nextDouble();

        System.out.println("Nhập chiều cao");
        height = scanner.nextDouble();

        System.out.println("Kết quả là : ");
        bmi = with / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
