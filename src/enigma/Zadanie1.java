package enigma;

public class Zadanie1 {  // Strona 56 Rozdział 1

    public static void zagadkowyBasen1() { // moje rozwiązanie
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x < 1) {
                System.out.print("asz");
                x = x - 1;
            }
            if (x == 1) {
                System.out.print("talek");
            }
            if (x > 1) {
                System.out.print("tyczny");
            }
            System.out.println(" ");
            x = x + 2;

        }
    }

    public static void zagadkowyBasen2() { // podręcznikowe rozwiązanie dla porównania
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print("tyczny");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("talek");
            }
            if (x < 1) {
                System.out.print("asz");
            }
            System.out.println(" ");
            x = x + 1;

        }
    }
}
