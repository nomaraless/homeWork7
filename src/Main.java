public class Main {
    public static void main(String[] args) {
        //Задача 1
        double depAmount = 15000;
        double sav = 0;
        int i = 0;
        while (sav <= 2_459_000) {
            sav = sav + depAmount;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", sav) + " рублей");
        }
        System.out.println();
        //Задача 2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println();
        //Задача 3
        int population = 12_000_000, natality = 17, deathRate = 8;
        for (int c = 1; c <= 10; c++) {
            int b = population / 1000;
            population = population + ((b * natality) - (b * deathRate));
            System.out.println("Год " + c + ", численность населения составляет " + String.format("%,d", population));
        }
        System.out.println();
        //Задача 4
        double dep = 15000;
        double op = 0;
        for (int c = 1; op <= 12_000_000; c++) {
            op += dep;
            op = (op * 1.07);
            System.out.println("Месяц " + c + ", сумма накоплений равна " + String.format("%.2f", op) + " рублей");
        }
        System.out.println();
        //Задача 5
        double deposit = 15000;
        double saving = 0;
        for (int c = 1; saving <= 12_000_000; c++) {
            saving+= deposit;
            saving = (saving * 1.07); //В расчетах расхождение, которое растет в прогрессии
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + ", сумма накоплений равна " + String.format("%.2f", saving) + " рублей");
            }
        }
        System.out.println();
        //Задача 6
        double deposit1 = 15000;
        int monthOfYear = 12 * 9;
        double sav1 = 0;
        for (int c = 1; c <= monthOfYear; c++) {
            sav1 += deposit1;
            sav1 = (sav1 * 1.07); //В расчетах расхождение, которое растет в прогрессии
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + ", сумма накоплений равна " + String.format("%.2f", sav1) + " рублей");
            }
        }
        System.out.println();
        //Задача 7
        int day = 1;
        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
            day += 7;
        }
        System.out.println();
            //Задача 8
        for (int year = 1896; year <= 2100; ) {
             System.out.println(year);
             year += 79;
            }
        }
    }
