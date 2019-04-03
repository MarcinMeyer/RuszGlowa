
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Str 97");

        int x = 0;
        Trojkat[] ta = new Trojkat[4];

        while (x < 4) {
            ta[x] = new Trojkat();
            ta[x].wysokosc = (x + 1) * 2;
            ta[x].dlugosc = x + 4;
            ta[x].okreslPole();
            System.out.print("Trójkąt " + x + ", pole");
            System.out.println(" = " + ta[x].pole);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Trojkat t5 = ta[2];
        ta[2].pole = 343;
        System.out.print("y = " + y);
        System.out.println(", pole t5 = " + t5.pole);


    }

}


