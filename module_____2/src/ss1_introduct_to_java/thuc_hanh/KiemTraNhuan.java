package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập một năm:");
        year = scanner.nextInt();

        if(year %4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("năm nhuận");
                }else {
                    System.out.println("không nhuận");
                }
            }else {
                System.out.println("Năm nhuân nhuận");
            }
        }else {
            System.out.println("Năm  không nhuận");
        }
    }
}
