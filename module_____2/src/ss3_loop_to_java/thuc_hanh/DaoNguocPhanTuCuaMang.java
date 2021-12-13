package ss3_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập kích thước: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        }while (size >20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập phần tử" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

//        Bước 6: Đảo ngược thứ tự các phần tử trong mảng
//Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử.
        for (int j = 0 ;j < array.length /2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
