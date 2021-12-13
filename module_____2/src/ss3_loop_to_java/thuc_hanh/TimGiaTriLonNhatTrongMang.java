package ss3_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước");
            size = scanner.nextInt();
            if (size > 20) ;
            System.out.println("Kích thước không được vượt quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách tài sản");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
//        Bước 6: Duyệt các phần tử trong mảng để tìm GTLN và vị trí

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
            System.out.println("Giá trị tài sản lớn nhất trong danh sách là  " + max + " ,ở vị trí " + index);
        }
    }
}
