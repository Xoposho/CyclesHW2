public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println("\nTask 1");
        int moveCometYear = 79;
        int yearNow = 2022;
        int yearEarlier = yearNow - 200;
        int yearFuture = yearNow + 100;


        for (int year = 0; year <= yearFuture; year += moveCometYear) {
            if (year >= yearEarlier)
                System.out.println(year);
        }

        System.out.println("\nTask 2");
        int factor = 1;
        int multiplicand = 2;
        while (factor <= 10) {
            System.out.println(multiplicand + " * " + factor + " = " + (factor * multiplicand));
            factor++;
        }
    }
}
//by Igor