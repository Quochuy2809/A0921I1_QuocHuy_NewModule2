package ss2_loop_and_array.bai_tap;

public class HienThiSoNgToNhoHon100 {
    public static void main(String[] args) {
        int i=1;
        do{
            i++;

            boolean isPrime= true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrime= false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(i);
            }
        }while (i<100);


    }
}
