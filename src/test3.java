import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        car[] cars = new car[5];
        cars[0] = new car("Тойота", "Черный", "Седан", 123);
        cars[1] = new car("Ниссан", "Белый", "Купе", 234);
        cars[2] = new car("Мазда", "Красный", "Хечбэк", 345);
        cars[3] = new car("Лексус", "Синий", "Внедорожник", 456);
        cars[4] = new car("Хонда", "Зеленый", "Минивен", 567);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите марку авто: ");
        String a = in.next();
        System.out.print("Введите цвет авто: ");
        String b = in.next();
        System.out.print("Введите тип авто: ");
        String c = in.next();
        System.out.print("Введите номер авто: ");
        int d = in.nextInt();
        car findcar=new car(a,b,c,d);
        String mark;
        String color;
        String type;
        int number;
        String result=null;
        for(int i=0;i<=4;i++){
            car car= cars[i];
            if (findcar.equals(car)) {
                mark = findcar.carname;
                color = findcar.carcolor;
                type = findcar.cartype;
                number = findcar.carregnumber;
                result = "\tМарка: " + mark + "\n\tЦвет: " + color + "\n\tТип кузова: " + type + "\n\tРег.Номер: " + number;
                break;
            }
        }
        if(result==null){
            result="\tМашина не найдена";
        }
        System.out.println("Результат:\n"+result);
    }
}
