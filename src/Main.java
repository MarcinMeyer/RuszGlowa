
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Str 96");

        int[] indeks = new int[4];
        String[] wyspy = new String[4];
        int y = 0;
        int ref;

        wyspy[0] = "Bermudy";
        wyspy[1] = "Fiji";
        wyspy[2] = "Azory";
        wyspy[3] = "Kozumel";
        indeks[0] = 1;
        indeks[1] = 3;
        indeks[2] = 0;
        indeks[3] = 2;


        while (y < 4) {
            System.out.print("wyspa = ");
            ref = indeks[y];

            System.out.println(wyspy[ref]);

            y = y + 1;


        }




    }
}
