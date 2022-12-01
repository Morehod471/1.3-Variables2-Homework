public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной " + " a " + " с типом " + " byte " + " равно " + a);
        short b = 1100;
        System.out.println("Значение переменной " + " b " + " с типом " + " short " + " равно " + b);
        int camelCase = 235684;
        System.out.println("Значение переменной " + " camelCase " + " с типом " + " int " + " равно " + camelCase);
        long d = 1255684L;
        System.out.println("Значение переменной " + " d " + " с типом " + " long " + " равно " + d);
        float g = 1.256f;
        System.out.println("Значение переменной " + " g " + " с типом " + " float " + " равно " + g);
        double t = 1.5555555555555;
        System.out.println("Значение переменной " + " t " + " с типом " + " double " + " равно " + t);
    }


    private static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte s = 67;
        System.out.println(s);
    }

    private static void task3() {
        System.out.println("Задача 3");
        byte ludPavl = 23;
        byte annSerg = 27;
        byte ekatAndr = 30;
        byte numberPupils = (byte) (ludPavl + annSerg + ekatAndr);
        short numberPapers = 480;
        short papersPupils = (short) (numberPapers/numberPupils);
        System.out.println("На каждого ученика рассчитано " + papersPupils + " листов бумаги");
    }

    private static void task4() {
        System.out.println("Задача 4");
        byte product = 16 / 2;
        short product20Min = (short) (product * 20);
        System.out.println("За 20 мин машина произвела " + product20Min + " штук бутылок");
        int productHour = product *60;
        int productDay = productHour * 24;
        System.out.println("За сутки машина произвела " + productDay + " штук бутылок");
        int product3Day = productDay * 3;
        System.out.println("За 3 дня машина произвела " + product3Day + " штук бутылок");
        int productMonth = productDay * 30;
        System.out.println("За месяц машина произвела " + productMonth + " штук бутылок");
    }

    private static void task5() {
        System.out.println("Задача 5");
        byte cansPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        byte paintClass = (byte) (whitePaintClass + brownPaintClass);
        byte classes = (byte) (cansPaint / paintClass);
        byte whitePaint = (byte) (classes * whitePaintClass);
        byte brownPaint = (byte) (classes * brownPaintClass);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }

    private static void task6() {
        System.out.println("Задача 6");
    }

    private static void task7() {

    }

    private static void task8() {

    }
}