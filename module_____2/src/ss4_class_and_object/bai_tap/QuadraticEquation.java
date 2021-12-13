package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = Math.pow(b,2) - (4*a*c);
    }

    public double getDiscriminant(){
        return delta;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(delta))/2* a;
    }
    public double getRoot2() {
        return (-b - Math.sqrt(delta))/2* a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        System.out.println("Input b:");
        double b = sc.nextDouble();
        System.out.println("Input c:");
        double c = sc.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a,b,c);
        double delta= q.getDiscriminant();

        if(delta>0)
            System.out.printf("x1 = %.2f, x2 = %.2f", q.getRoot1(), q.getRoot2());
        else if(delta==0)
            System.out.printf("x= "+q.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}
