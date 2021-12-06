package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float with;
        float height;

//        Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều rộng");
        with = scanner.nextFloat();

        System.out.println("Nhập chiều cao");
        height = scanner.nextFloat();

//        Tính diện tích của hình chữ nhật và hiển thị ra màn hình

        float area = with * height;

        System.out.println("Area is: " + area);
    }
}
