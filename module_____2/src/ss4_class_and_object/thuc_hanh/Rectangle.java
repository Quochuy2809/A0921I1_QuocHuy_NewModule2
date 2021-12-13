package ss4_class_and_object.thuc_hanh;

public class Rectangle {
//    Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
