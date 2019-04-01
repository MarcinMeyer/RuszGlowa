package puzzle;


public class BadzJakKompilator {
    public static void startPuzzle() { // w zadaniach imituje main jak tester

        Perkusja p = new Perkusja();
        p.zagrajNaBebnie();
        p.beben = false;

        if(p.beben == true) {
            p.zagrajNaBebnie();
        }
        p.zagrajNaTalerzach();


    }
}
