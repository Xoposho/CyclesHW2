public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("\nTask 1 and 2");
        //Task 1 and 2
        int depositAmount = 15000;
        int depositPercentage = 7;
        int monthCounter = 1;

        while (depositAmount <= 12_000_000) {
            depositAmount = depositAmount + (depositAmount * depositPercentage / 100);
            monthCounter++;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", суммы накоплено - " + depositAmount);
            }
            //remove if to get task 1
        }

        System.out.println("\nTask 3");
        //Task 3
        int monthToSave = 9 * 12;
        depositAmount = 15000;
        monthCounter = 1;

        while (monthCounter <= monthToSave) {
            depositAmount = depositAmount + (depositAmount * depositPercentage / 100);
            monthCounter++;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", суммы накоплено - " + depositAmount);
            }
        }

        System.out.println("\nTask 4");
        //Task 4
        int daysOfMonth = 31;
        for (int friday = 1; friday <= daysOfMonth; friday += 7)
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");

    }
}
//by Igor