
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Str 95");
        Ksiazka[] mojeKsiazki = new Ksiazka[3];

        mojeKsiazki[0] = new Ksiazka();
        mojeKsiazki[1] = new Ksiazka();
        mojeKsiazki[2] = new Ksiazka();

        int x = 0;
        mojeKsiazki[0].tytul = "Czterej koderzy i Java";
        mojeKsiazki[1].tytul = "Java nocy letniej";
        mojeKsiazki[2].tytul = "Java. Receptury";
        mojeKsiazki[0].autor = "janek";
        mojeKsiazki[1].autor = "wilhelm";
        mojeKsiazki[2].autor = "ian";

        while (x <3){
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(", autor ");
            System.out.println(mojeKsiazki[x].autor);
            x = x + 1;
        }
    }
}
