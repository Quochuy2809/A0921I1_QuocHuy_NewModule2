package ss1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhập số tiền cần đổi");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền đổi là : " + quydoi);
    }
}
