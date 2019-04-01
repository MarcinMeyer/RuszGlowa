package puzzle;


public class BadzJakKompilator {
    public static void startPuzzle() { // w zadaniach imituje main

      OdtwarzaczDVD o = new OdtwarzaczDVD();
      o.mozeNagrywac = true;
      o.odtworzPlyteDVD();

      if(o.mozeNagrywac == true) {
          o.nagrajPlyteDVD();
      }



    }
}
