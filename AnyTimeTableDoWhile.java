package homework2;

public class AnyTimeTableDoWhile {
    public static void main(String[] args) {
        int a=1;
        do{
           int b=10; // b is Time Table you want
           int c=b*a;
            System.out.println(b +" X " +a +" = " +c);
            b++;
            a++;
        }while (a<=10);
    }
}
