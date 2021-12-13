package ss3_loop_to_java.bai_tap;

import java.util.Random;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= new Random().nextInt(100);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

        int res=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(res<matrix[i][j])
                    res= matrix[i][j];
            }
        }
        System.out.println("Max value in matrix: "+ res);
    }
}