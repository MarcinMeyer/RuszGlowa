package puzzle;


public class BadzJakKompilator {
    public static void startPuzzle() { // w zadaniach imituje main

        Magnetofon m = new Magnetofon();
        m.mozeNagrywac = true;
        m.odtworzTasme();

        if (m.mozeNagrywac == true) {
            m.nagrajTasme();
        }


    }
}
