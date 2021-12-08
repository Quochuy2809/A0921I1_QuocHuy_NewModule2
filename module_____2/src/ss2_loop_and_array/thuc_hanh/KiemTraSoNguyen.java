package ss2_loop_and_array.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();

        if (number < 2){
            System.out.println(number + "Đây không phải số nguyên");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + "Là một nguyên số");
            else
                System.out.println(number + "khoogn phải số nguyên");
        }
    }
}
