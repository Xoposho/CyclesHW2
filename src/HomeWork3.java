public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println("\nTask 1");
        int moveCometYear = 79;
        int yearNow = 2022;
        int yearEarlier = yearNow - 200;
        int year = 0;

        while (year <= yearNow) {
            year += moveCometYear;
            if (year >= yearEarlier && year <= yearNow) System.out.println("Комета появлялась в " + year + " году.");
            else if (year > yearNow) System.out.println("Комета появится в " + year + " году.");


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