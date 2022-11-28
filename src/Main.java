import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите длинну прямоугольника: ");
        int x= in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int y= in.nextInt();
        for (int a=1; a<=x; a++){
            System.out.print("-");
        }
        for (int b=1; b<=y; b++){
            System.out.print("\n|");
        }
        for (int q=1; q<=x; q++){
            System.out.print("-");
        }
    }
}