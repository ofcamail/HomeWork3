import java.sql.SQLOutput;

public class Cycles {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            boolean isLeapYear = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0));
            if (isLeapYear) {
                System.out.println(i + " високосный год");
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i != 105; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int first = 29000;
        int total = 0;
        for (int i = 1; i < 13; i = i + 1) {
            total = total + first;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        int first = 29000;
        int total = 0;
        for (int i = 1; i < 13; i = i + 1) {
            total = total + total / 100;
            total = total + first;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задание 10");
        int n = 1;
        int n1 = 1;
        for (int i = 0; i < 11; i = i + 1) {
            int n2 = n + n1;
            System.out.print(" " + n + " ");
            n = n1;
            n1 = n2;
        }
    }

    public static void task11() {
        System.out.println("Задание 11");
        int deposit = 15_000;
        int savings = 0;
        int month = 1;
        while (savings < 2_460_000) {
            savings = deposit + savings;
            System.out.println("Месяц " + month + " сумма накоплений равна " + savings);
            month = month + 1;
        }
    }

    public static void task12() {
        System.out.println("Задание 12");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num = num + 1;
        }
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(" " + i);
            System.out.println();
        }
    }

    public static void task13() {
        System.out.println("Задание 13");
        int population = 12000000;
        int newPeople = 17;
        int death = 8;
        int year = 2022;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Год " + year + " численность населения равна " + population);
            population = population+population/1000 * (newPeople-death);
            year = year + 1;
        }
    }

    public static void task14() {
        System.out.println("Задание 14");
        double total = 15000;
        int month = 0;
        while (total <= 12000000) {
            total = total + (total / 100 * 7);
            month = month + 1;
            System.out.println("Месяц " + month + " накопленная сумма " + total);
        }
    }

    public static void task15() {
        System.out.println("Задание 15");
        double total = 15000;
        int month = 0;
        while (total <= 12000000) {
            total = total + (total / 100 * 7);
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " накопленная сумма " + total);
        }
    }

    public static void task16() {
        System.out.println("Задание 16");
        double total = 15000;
        int month = 0;
        while (month <= 108) {
            total = total + (total / 100 * 7);
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " накопленная сумма " + total);
        }
    }

    public static void task17() {
        System.out.println("Задание 17");
        int friday = 2;
        int daysInMonth = 31;
        int daysInweek = 7;
        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + daysInweek;
        }
    }

    public static void task18() {
        System.out.println("Задание 18");
        int cometFly = 79;
        int now = 2022;
        int pastYears = now - 200;
        int futureYear = now + 100;
        for (int i = 0; i <= futureYear; i = i + cometFly) {
            if (pastYears <= i && futureYear >= i) {
                System.out.println(i);
            }
        }
    }
}
