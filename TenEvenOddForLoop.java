package homework2;

public class TenEvenOddForLoop {
    public static void main(String[] args) {
        for(int a=1; a <= 20; a++) {
            for (int b = a; b % 2 == 0; b++) {
                System.out.println("Even Number = " + a);
            }
        }
        for(int c=1; c <= 20; c++){
            for(int d=c; d%2 !=0; d++){
                System.out.println("Odd Number = " + c);

        }
        }

    }
}
