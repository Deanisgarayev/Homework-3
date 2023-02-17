public class Main {
    public static void main(String[] args) {;
        // task 1
        byte apple = 100;
        System.out.println("Значение переменной byte с типом apple равно " + apple);
        short box = 10;
        System.out.println("Значение переменной short с типом box равно " + box);
        int tray = 4;
        System.out.println("Значение переменной int с типом  tray равно " + tray);
        long car = 1;
        System.out.println("Значение переменной long с типом car равно " + car);
        float flour = 3.5f;
        System.out.println("Значение переменной float с типом flour равно " flour);
        double totalThing = apple + box + tray + car + flour;
        System.out.println("Значение переменной double с типом totalThing равно " + totalThing);
        // task 2
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = 987678965549L;
        float e = 2.786f;
        double f = 27.12;
        short g = 569;
        //task 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short totalSheet = 480;
        int allStudents = firstClass + secondClass + thirdClass;
        System.out.println("Общие количество учеников " + allStudents);
        int sheet = totalSheet / allStudents;
        System.out.println("На каждого ученика рассчитано … листов бумаги " + sheet);
        // task 4
        byte bottle = 16;
        byte time = 2;
        byte minuts = 20;
        short day = 1440;
        short threeDays = 4320;
        int month = 43200;
        long bottleMinuts = minuts / time * bottle;
        System.out.println("Производительность машины за 20 минут " + bottleMinuts + " бутылок");
        long bottleDay = day / time * bottle;
        System.out.println("производительность машины за 1 день " + bottleDay + " бутылок");
        long bottleThreeDays = threeDays / time * bottle;
        System.out.println("производительность машины за 3 дня " + bottleThreeDays + " бутылок");
        long bottleMonth = month / time * bottle ;
        System.out.println("производительность машины за месяц " + bottleMonth + " бутылок");
        // task 5
        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintOneClass = whitePaint + brownPaint;
        System.out.println("Количество красок для одного класса " + paintOneClass);
        int totalClass = paint / paintOneClass;
        System.out.println("В школе " + totalClass + " классов");
        int totalWhitePaint = totalClass * whitePaint;
        System.out.println("Нужно " + totalWhitePaint + " банок белой краски");
        int totalBrownPaint = totalClass * brownPaint;
        System.out.println("Нужно " + totalBrownPaint + " банок коричневой краски");
        //task 6
        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 2;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        long foodGram = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;
        System.out.println("Вес блюда " + foodGram + " грамм");
        float kilogram = 1000f;
        float foodKilogram = foodGram / kilogram;
        System.out.println("Вес блюда " + foodKilogram + " килограмм");
        // task 7
        short thin = 7000;
        short formOne = 250;
        short formTwo = 500;
        int dayFormOne = thin / formOne;
        int dayFormTwo = thin / formTwo;
        System.out.println("При похудение на 250 грамм в день, то потребуется " + dayFormOne + " дней");
        System.out.println("При похудение на 500 грамм в день, то потребуется " + dayFormTwo + " дней");
        int bothForm = formOne + formTwo;
        System.out.println("Общие похудение на граммов в двух рационах "+ bothForm);
        int middleForm = bothForm / 2;
        System.out.println("Средние значение похудение в граммов в день " + middleForm);
        int dayMiddleForm = thin / middleForm;
        System.out.println("В средним что бы похудеть на 7 кг потребуется " + dayMiddleForm + " дней");
        // task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte riseSalary = 10;
        short year = 12;
        int mashaRiseSalary = masha / riseSalary + masha;
        System.out.println("Маша теперь будет получать ежемесячную зарплату " + mashaRiseSalary + " рублей");
        int denisRiseSalary = denis / riseSalary + denis;
        System.out.println("Маша теперь будет получать ежемесячную зарплату " + denisRiseSalary + " рублей");
        int kristinaRiseSalary = kristina / riseSalary + kristina;
        System.out.println("кристина теперь будет получать ежемесячную зарплату " + kristinaRiseSalary + " рублей");
        int mashaYearBefore = masha * year;
        System.out.println("Маша получал в год " + mashaYearBefore + " рублей");
        int denisYearBefore = denis * year;
        System.out.println("Денис получал в год " + denisYearBefore + " рублей");
        int kristinaYearBefore = kristina* year;
        System.out.println("Кристина получала в год " + kristinaYearBefore + " рублей");
        int mashaYearAfter = mashaRiseSalary * year;
        System.out.println("Маша теперь будет получать в год " + mashaYearAfter + " рублей");
        int denisYearAfter = denisRiseSalary * year;
        System.out.println("Денис теперь будет получать в год " + denisYearAfter + " рублей");
        int kristinaYearAfter = kristinaRiseSalary * year;
        System.out.println("Кристина теперь будет получать в год " + kristinaYearAfter + " рублей");
        int mashaRiseSalaryYear = mashaYearAfter - mashaYearBefore;
        System.out.println("Годовой доход Маши вырос на " + mashaRiseSalaryYear + " рублей");
        int denisRiseSalaryYear = denisYearAfter - denisYearBefore;
        System.out.println("Годовой доход Дениса вырос на " + denisRiseSalaryYear + " рублей");
        int kristinaRiseSalaryYear = kristinaYearAfter - kristinaYearBefore;
        System.out.println("Годовой доход Кристины вырос на " + kristinaRiseSalaryYear + " Рублей");
    }
}