public class HomeWork1 {
    public static void main(String[] args) {

        //HomeWork 1
        //Task 1
        int moneyPerMonth = 15000;
        int piggyBank = 0;
        int wantToSave = 2_459_000;
        int monthToSave = 0;

        while (piggyBank <= wantToSave) {
            piggyBank += moneyPerMonth;
            monthToSave++;
            System.out.println("Месяц " + monthToSave + ", сумма накоплений равна " + piggyBank + " рублей.");
        }

        //Task 2
        int firstNum = 0;

        while (firstNum < 10) {
            firstNum++;
            System.out.print(firstNum + " ");
        }
        System.out.print("\n");
        for (int lastNum = 1; firstNum >= lastNum; firstNum--) {
            System.out.print(firstNum + " ");
        }

        System.out.print("\n");
        //Task 3
        int countryY = 12_000_000;
        int deathInYear;
        int bornInYear;
        int year = 2022;
        int yearEnd = year + 10;

        while (year <= yearEnd) {
            deathInYear = (8 * countryY) / 1000;
            bornInYear = (17 * countryY) / 1000;
            countryY -= deathInYear;
            countryY += bornInYear;
            System.out.println("Год " + year + ", численность населения составляет - " + countryY);
            year++;

        }
    }
}
//by Igor