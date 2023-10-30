public class Apple {
    public static void main(String[] args) {
        final int APPLES_BURATINO = 5;
        final int APPLES_TOOK_KARABAS = 2;
        final int RESIDUAL_APPLES_BURATINO = APPLES_BURATINO - APPLES_TOOK_KARABAS; //остаток яблок

        System.out.println("У Буратино изначально было " + APPLES_BURATINO + " яблок.");
        System.out.println("Карабас Барабас отобрал у него " + APPLES_TOOK_KARABAS + " яблок.");
        System.out.println(RESIDUAL_APPLES_BURATINO + " яблок осталось у Буратино.");
    }
}