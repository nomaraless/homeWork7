public class Main {
    public static void main(String[] args) {
        //Задача 1
        double depAmount = 15000;
        double sav = 0;
        int i=1;
        while (sav <= 2_459_000) {
            sav = sav + sav/100;
            sav = sav + depAmount;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", sav) + " рублей");
        }
    }
}