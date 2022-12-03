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
        byte banana = 80;
        int bananaWeight = banana * 5;
        byte milk = 105;
        int milkWeight = milk * 2;
        byte iceCream = 100;
        int iceCreamWeight = iceCream * 2;
        byte egg = 70;
        int eggWeight = egg * 4;
        short weight = (short) (bananaWeight + milkWeight + iceCreamWeight + eggWeight);
        System.out.println("Вес продуктов " + weight + " граммов");
        float weightKilo = (float) weight / 1000;
        System.out.println("Вес продуктов " + weightKilo + " килограммов");
    }

    private static void task7() {
        System.out.println("Задача 7");
        byte grammLoss = 7;
        short kiloLoss =  (short) (grammLoss * 1000);
        short weightLoss = 250;
        short daysLoss250 = (short) (kiloLoss / weightLoss);
        System.out.println("Если терять 250 граммов в день, то на похудение уйдёт " + daysLoss250 + " дней");
        short weightLoss2 = 500;
        short daysLoss500 = (short) (kiloLoss / weightLoss2);
        System.out.println("Если терять 500 граммов в день, то на похудение уйдёт " + daysLoss500 + " дней");
        short daysLossAverage = (short) ((daysLoss250 + daysLoss500) / 2);
        System.out.println("В среднем на похудение уйдёт " + daysLossAverage + " дней");
    }

    private static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        int mashaSalaryUp = (int) (mashaSalary * 1.1);
        int denisSalaryUp = (int) (denisSalary * 1.1);
        int cristinaSalaryUp = (int) (cristinaSalary * 1.1);
        int mashaSalaryYearDiff = mashaSalaryUp * 12 - mashaSalary * 12;
        int denisSalaryYeaDiff = (denisSalaryUp - denisSalary) * 12;
        int cristinaSalaryYearDiff = (cristinaSalaryUp - cristinaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaSalaryUp + " рублей. Годовой доход вырос на " + mashaSalaryYearDiff + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryUp + " рублей. Годовой доход вырос на " + denisSalaryYeaDiff + " рублей");
        System.out.println("Кристина теперь получает " + cristinaSalaryUp + " рублей. Годовой доход вырос на " + cristinaSalaryYearDiff + " рублей");
    }
}