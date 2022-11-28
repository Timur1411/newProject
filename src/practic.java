import java.util.Scanner;
public class practic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введи число: ");
        int a= in.nextInt();
        System.out.println(factorial(a));
    }
    static int factorial(int a) {
        if (a==1) {
            return 1;
        } else {
            return a*factorial(a-1);
        }
    }
}