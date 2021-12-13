package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
//        Bước 3: Khai báo hai biến số nguyên a, b và nhập giá trị cho a, b từ bàn phím
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

//        Bước 5: Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0){
            System.out.println("không có yếu tố chugn lơn nhất");
        }

//        Bước 6: Tìm ước số chung lớn nhất của a, b
//Sử dụng vòng lặp kiểm tra trong khi a khác b thì
//Nếu a < b: a = a – b
//Còn lại b = b – a
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
