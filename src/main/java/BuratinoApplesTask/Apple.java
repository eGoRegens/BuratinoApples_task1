package BuratinoApplesTask;

public class Apple {
    public static void main(String[] args) {
        final int applesBuranino = 5;
        final int applesTookKarabas = 2;

        final int residualApplesBuratino = applesBuranino - applesTookKarabas; //остаток

        System.out.println("У Буратино изначально было " + applesBuranino + " яблок.");
        System.out.println("Карабас Барабас отобрал у него " + applesTookKarabas + " яблок.");
        System.out.println(residualApplesBuratino + " яблок(а) осталось у Буратино.");
    }
}