package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class UngDungChoVayNangLai {
    public static void main(String[] args) {
//         Khai báo 3 biến để lưu thông tin về tiền gửi, tháng gửi,tỉ lệ lãi suất trong hàm main()
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

//Bước 4: Tạo đối tượng input thuộc lớp Scanner để thực hiện nhập liệu dữ liệu cho 3 biến đã khai báo từ bàn phím.
        Scanner input = new Scanner (System.in);

//Bước 5:Nhập giá trị cho các biến
        System.out.println("nhập số tiền gửi");
        money = input.nextDouble();
        System.out.println("số tháng gửi");
        month = input.nextInt();
        System.out.println("nhập lãi xuất");
        interestRate = input.nextDouble();

//Bước 6: Tính lãi suất nhận được
        double totalInterest = 0;
        for (int i = 0;i < month;i++ ){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("số tiền lãi xuất" + totalInterest);
        }
    }
}
