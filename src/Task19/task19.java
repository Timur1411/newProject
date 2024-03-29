package Task19;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Тойота", "Черный", "Седан", 123);
        cars[1] = new Car("Ниссан", "Белый", "Купе", 234);
        cars[2] = new Car("Мазда", "Красный", "Хечбэк", 345);
        cars[3] = new Car("Лексус", "Синий", "Внедорожник", 456);
        cars[4] = new Car("Хонда", "Зеленый", "Минивен", 567);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку авто: ");
        String a = scanner.next();
        System.out.print("Введите цвет авто: ");
        String b = scanner.next();
        System.out.print("Введите тип авто: ");
        String c = scanner.next();
        System.out.print("Введите номер авто: ");
        int d = scanner.nextInt();
        scanner.close();

        Car findcar = new Car(a, b, c, d);

        String result = null;

        for (int i = 0; i <= 4; i++) {
            Car car = cars[i];
            if (findcar.equals(car)) {
                result = car.toString();
                break;
            }
        }

        if (result == null) {
            System.out.println("\tМашина не найдена");
        } else {
            System.out.println(result);
        }
    }
}
