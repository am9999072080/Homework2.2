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
        byte aByte = 1;
        short bShort = -12;
        int cInt = 123;
        long dLong = 123_456_789L;
        float eFloat = 0.12f;
        double fDouble = -9.999;
        System.out.println("Значение переменной  aByte  с типом  byte   равно " + aByte);
        System.out.println("Значение переменной  bShort с типом  short  равно " + bShort);
        System.out.println("Значение переменной  cInt   с типом  int    равно " + cInt);
        System.out.println("Значение переменной  dLong  с типом  long   равно " + dLong);
        System.out.println("Значение переменной  eFloat с типом  float  равно " + eFloat);
        System.out.println("Значение переменной  double с типом  double равно " + fDouble);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte byteNum = 67;
        short shortNum = -159;
        int intNum = 569;
        long longNum = 987_678_965_549L;
        float floatNum = 27.12f;
        double doubleNum = 2.786;
        char charNum = 27897;
        System.out.println("Значение переменной             67  с типом  byte   равно " + byteNum);
        System.out.println("Значение переменной           -159  с типом  short  равно " + shortNum);
        System.out.println("Значение переменной            569  с типом  int    равно " + intNum);
        System.out.println("Значение переменной   987678965549L с типом  long   равно " + longNum);
        System.out.println("Значение переменной          27.12f с типом  float  равно " + floatNum);
        System.out.println("Значение переменной          2.786  с типом  double равно " + doubleNum);
        System.out.println("Значение переменной          27897  с типом  double равно " + charNum);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte pupilsInFirstClass = 23;
        byte pupilsInSecondtClass = 27;
        byte pupilsInThirdClass = 30;
        short totalPaperCount = 480;
        int totalPupils = pupilsInFirstClass + pupilsInSecondtClass + pupilsInThirdClass;
        int papersPerPupil = totalPaperCount / totalPupils;
        System.out.println("Каждому ученику достанется " + papersPerPupil + " листов");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerHour = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPer3Days * 10;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За час машина произвела      " + bottlesPerHour + " штук бутылок");
        System.out.println("в сутки машина произвела     " + bottlesPerDay + " штук бутылок");
        System.out.println("за 3 дня машина произвела    " + bottlesPer3Days + " штук бутылок");
        System.out.println("за 1 месяц  машина произвела " + bottlesPerMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = whiteCansPerClass * totalClasses;
        int totalBrownCans = brownCansPerClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananasCount = 5;
        byte milkCount = 2;
        byte iceCreamCount = 2;
        byte eggsCount = 4;
        byte weightBananasUnit = 80;
        byte weightMilkUnit = 105;
        byte weightIceCreamUnit = 100;
        byte weightEggUnit = 70;
        int totalWeightInGrams = bananasCount * weightBananasUnit + milkCount * weightMilkUnit + iceCreamCount * weightIceCreamUnit + eggsCount * weightEggUnit;
        double totalWeightInKg = (double) totalWeightInGrams / 1_000;
        System.out.println("Общий вес в граммах    - " + totalWeightInGrams + "гр");
        System.out.println("Общий вес в килогаммах - " + totalWeightInKg + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightForLossInGrams = 7_000;
        int lossWeightDayMin = 250;
        int lossWeightDayMax = 500;
        double maxDaysCount = (double) weightForLossInGrams / lossWeightDayMin;
        double minDaysCount = (double) weightForLossInGrams / lossWeightDayMax;
        double averageDaysCount = (maxDaysCount + minDaysCount) / 2;
        System.out.println("Минимальное каличество дней для похудения  " + minDaysCount + " дней");
        System.out.println("Максимальное каличество дней для похудения " + maxDaysCount + " дней");
        System.out.println("Средное каличество дней для похудения      " + averageDaysCount + " дней");


    }

    public static void task8() {
        System.out.println("Задача 8");
        double indPercent = 10;
        int salaryMasha = 67760;
        double newSalaryMasha = salaryMasha + salaryMasha / indPercent;
        double annualMashaSalary = (double) salaryMasha / 10 * 12;
        System.out.println("Маша теперь получает     " + newSalaryMasha + " рублей. Годовой доход вырос на  " + annualMashaSalary + " рублей");

        int salaryDenis = 83690;
        double newSalaryDenis = salaryDenis + salaryDenis / indPercent;
        double annualDenisSalary = (double) salaryDenis / 10 * 12;
        System.out.println("Денис теперь получает    " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualDenisSalary + " рублей");

        int salaryChristina = 76230;
        double newSalaryChristina = salaryChristina + salaryChristina / indPercent;
        double annualChristinaSalary = (double) salaryChristina / 10 * 12;
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на  " + annualChristinaSalary + " рублей");

    }
}