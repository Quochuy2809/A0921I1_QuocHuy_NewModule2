package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bước 4: Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

//        Bước 5: Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);

//        Bước 6: Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiển thị các thông số của hình chữ nhật
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
