public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte numberOne = 1;
        short numberTwo = 2;
        int numberThree = 3;
        long numberFour = 4L;
        float numberFive = 5.0f;
        double numberSix = 6.0;
        System.out.println("Значение переменной  с типом byte равно " + numberOne);
        System.out.println("Значение переменной  с типом short равно " + numberTwo);
        System.out.println("Значение переменной  с типом int равно " + numberThree);
        System.out.println("Значение переменной  с типом long равно " + numberFour);
        System.out.println("Значение переменной  с типом float равно " + numberFive);
        System.out.println("Значение переменной  с типом double равно " + numberSix + "\n");

        //Задача 2
        float first = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five  = 159;
        short six = 27897;
        byte seven = 67;

        //Задача 3
        System.out.println("Задача 3");
        byte class1, class2, class3;
        short amountPaper;
        int numberOfPeople, paperPerPerson;
        class1 = 23; class2 = 27; class3 = 30;
        amountPaper = 480;
        numberOfPeople = class1 + class2 + class3;
        paperPerPerson = amountPaper / numberOfPeople;
        System.out.println("На каждого ученика расчитано "  + paperPerPerson + " листов бумаги.\n");

        //Задача 4
        System.out.println("Задача 4");
        byte botlePerMinute = 16;
        int twentyMinutes  = botlePerMinute * 20;
        int day  = botlePerMinute * 60 * 24;
        int threeDays  = day * 3;
        int month  = day * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + day + " штук бутылок.");
        System.out.println("За трое суток машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.\n");

        //Задача 5
        System.out.println("Задача 5");
        byte forSchool, whiteForClass, braunForClass;
        int forClass, whiteForSchool, braunForSchool, numberOfClasses;
        forSchool = 120; whiteForClass = 2; braunForClass = 4;
        forClass = whiteForClass + braunForClass;
        numberOfClasses = forSchool / forClass;
        whiteForSchool = numberOfClasses * whiteForClass;
        braunForSchool = numberOfClasses * braunForClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteForSchool + " банок белой краски и " + braunForSchool + " банок коричневой краски.\n");

        //Задача 6
        System.out.println("Задача 6");
        byte banana, milk, iceCream, egg;
        banana = 80; milk = 105; iceCream = 100; egg = 70;
        float breakfast = (banana * 5 + milk * 2 + iceCream * 2 + egg * 4) / 1000f;  //я так понимаю, достаточно одной f, чтобы она все числа интерпретировала во float?
        System.out.printf("Вес спортзавтрака равен: %.3f грамм \n\n",breakfast);

        //Задача 7
        System.out.println("Задача 7");
        byte target;
        float slowWeightLoss, fastWeightLoss, dayQuantitySlow, dayQuantityFast, dayAverage;
        target = 7; slowWeightLoss = 0.25f; fastWeightLoss = 0.5f;
        dayQuantitySlow = target / slowWeightLoss;
        dayQuantityFast = target/  fastWeightLoss;
        dayAverage = (dayQuantitySlow + dayQuantityFast) / 2;
        System.out.printf("Если спортсмен будет худеть по 250 грамм, уйдёт %.0f дней, если по 500 грамм, то %.0f дней. В среднем на похудение уйдёт %.0f день.\n\n", dayQuantitySlow, dayQuantityFast, dayAverage);

        //Задача 8
        System.out.println("Задача 8");
        float salaryMasha, salaryDenis, salaryKristina, salaryOfYearMasha, salaryOfYearDenis, salaryOfYearKristina, newSalaryOfYearMasha, newSalaryOfYearDenis, newSalaryOfYearKristina;
        salaryMasha = 67760f; salaryDenis = 83690f; salaryKristina = 76230f;
        salaryOfYearMasha = salaryMasha * 12; salaryOfYearDenis = salaryDenis * 12;  salaryOfYearKristina = salaryKristina * 12;
        salaryMasha = salaryMasha * 1.1f; salaryDenis = salaryDenis * 1.1f; salaryKristina = salaryKristina * 1.1f;
        newSalaryOfYearMasha = salaryMasha * 12; newSalaryOfYearDenis = salaryDenis * 12; newSalaryOfYearKristina = salaryKristina * 12;
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.\n", salaryMasha, (newSalaryOfYearMasha - salaryOfYearMasha));
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.\n", salaryDenis, (newSalaryOfYearDenis - salaryOfYearDenis));
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.\n", salaryKristina, (newSalaryOfYearKristina - salaryOfYearKristina));

    }
}