package ss2_loop_and_array.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        a = input.nextInt();
        System.out.println("Nhập b");
        b = input.nextInt();

//Bước 4: Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);


        if (a == 0 || b == 0){
            System.out.println("không có yếu tố chugn lơn nhất");
        }

        while (a != b){
            if (a > b){
                a = a - b;
            }else{
                b = b - a;
            }
            System.out.println("Yếu tố chugn lớn nhất :" + a);
        }
    }
}
