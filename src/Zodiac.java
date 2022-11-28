import java.util.Objects;
import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату рождения: ");
        int date = in.nextInt();
        System.out.print("Введите месяц рождения: ");
        String mounth = in.next();
        String oven = "Овен";
        String telec = "Телец";
        String blizn="Близнецы";
        String rak="Рак";
        String lev="Лев";
        String deva="Дева";
        String vesi="Весы";
        String scorp="Скорпион";
        String strel="Стрелец";
        String kozer="Козерог";
        String vodol="Водолей";
        String ribi="Рыбы";
        boolean oven1 = (date >= 21) && (Objects.equals(mounth, "март"));
        boolean oven2 = (date <= 20) && (Objects.equals(mounth, "апрель"));
        boolean telec1=(date>=21) && (Objects.equals(mounth,"апрель"));
        boolean telec2=(date<=21) && (Objects.equals(mounth,"май"));
        boolean blizn1=(date>=22) && (Objects.equals(mounth,"май"));
        boolean blizn2=(date<=21) && (Objects.equals(mounth,"июнь"));
        boolean rak1=(date>=22) && (Objects.equals(mounth,"июнь"));
        boolean rak2=(date<=22) && (Objects.equals(mounth,"июль"));
        boolean lev1=(date>=23) && (Objects.equals(mounth,"июль"));
        boolean lev2=(date<=21) && (Objects.equals(mounth,"август"));
        boolean deva1=(date>=22) && (Objects.equals(mounth, "август"));
        boolean deva2=(date<=23) && (Objects.equals(mounth, "сентябрь"));
        boolean vesi1=(date>=24) && (Objects.equals(mounth,"сентябрь"));
        boolean vesi2=(date<=23) && (Objects.equals(mounth,"октябрь"));
        boolean scorp1=(date>=24) && (Objects.equals(mounth,"октябрь"));
        boolean scorp2=(date<=22) && (Objects.equals(mounth,"ноябрь"));
        boolean strel1=(date>=23) && (Objects.equals(mounth,"ноябрь"));
        boolean strel2=(date<=22) && (Objects.equals(mounth,"декабрь"));
        boolean kozer1=(date>=23) && (Objects.equals(mounth,"декабрь"));
        boolean kozer2=(date<=20) && (Objects.equals(mounth,"январь"));
        boolean vodol1=(date>=21) && (Objects.equals(mounth,"январь"));
        boolean vodol2=(date<=19) && (Objects.equals(mounth,"февраль"));
        boolean ribi1=(date>=20) && (Objects.equals(mounth,"февраль"));
        boolean ribi2=(date<=20) && (Objects.equals(mounth,"март"));
        if (oven1 || oven2) {
            System.out.println("Ваш знак зодиака: " + oven);
        }
        else if (telec1||telec2) {
            System.out.println("Ваш знак зодиака: "+telec);
        }
        else if(blizn1||blizn2) {
            System.out.println("Ваш знак зодиака: "+blizn);
        }
        else if(rak1||rak2) {
            System.out.println("Ваш знак зодиака: "+rak);
        }
        else if(lev1||lev2) {
            System.out.println("Ваш знак зодиака: "+lev);
        }
        else if(deva1||deva2)  {
            System.out.println("Ваш знак зодиака: "+deva);
        }
        else if(vesi1||vesi2) {
            System.out.println("Ваш знак зодиака: "+vesi);
        }
        else if(scorp1||scorp2) {
            System.out.println("Ваш знак зодиака: "+scorp);
        }
        else if(strel1||strel2) {
            System.out.println("Ваш знак зодиака: "+strel);
        }
        else if(kozer1||kozer2) {
            System.out.println("Ваш знак зодиака: "+kozer);
        }
        else if(vodol1||vodol2) {
            System.out.println("Ваш знак зодиака: "+vodol);
        }
        else if(ribi1||ribi2) {
            System.out.println("Ваш знак зодиака: "+ribi);
        }
        else {
            System.out.println("Дата или месяц введены не корректно");
        }
    }
    }
