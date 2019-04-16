
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Str 120");

        int org = 42;
        Main x = new Main();
        int y = x.jazda(org);
        System.out.println(org + " " + y);




    }
    int jazda(int arg) {
        arg = arg *2;
        return arg;
    }

}


