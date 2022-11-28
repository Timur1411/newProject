import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a=in.nextInt();
        System.out.print("Введите второе число: ");
        int b=in.nextInt();
        logic(a,b);
    }
    static void logic(int a, int b){
        if(a%2==0||b%3==0){
            System.out.println(a==b);
        }
        if(a%2==0&&a%3==0){
            double result=Math.pow(a,b);
            if (result<Integer.MIN_VALUE||result>Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой");
            } else {
                System.out.println(result);
            }
        }
    }
}