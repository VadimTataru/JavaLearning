import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите год");
        int year = in.nextInt();
        int new_year = year%60;
        String name = "";

        switch (new_year / 12) {
            case 0 : name = "Зелён"; break;
            case 1 : name = "Красн"; break;
            case 2 : name = "Жёлт"; break;
            case 3 : name = "Бел"; break;
            case 4 : name = "Чёрн"; break;
        }

        switch (new_year%12) {
            case 0 : name += "ая обезьяна"; break;
            case 1 : name += "ый петух"; break;
            case 2 : name += "ая собака"; break;
            case 3 : name += "ая свинья"; break;
            case 4 : name += "ая крыса"; break;
            case 5 : name += "ый бык"; break;
            case 6 : name += "ый тигр"; break;
            case 7 : name += "ый кролик"; break;
            case 8 : name += "ый дракон"; break;
            case 9 : name += "ая змея"; break;
            case 10 : name += "ая лошадь"; break;
            case 11 : name += "ая овца"; break;
        }

        System.out.printf(name);
    }
}
