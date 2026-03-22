package basics;

public class Arithmetics {
    public static void arithmet_example() {
        int x = 6;
        int y = 7;
        int z = x + y;
        z += x;
        x = z * y;
        y = x - z;
        z = x / y;
        x = z % y;
        x++;
        y--;

        //logical operators
        boolean tst = true && false;
        tst = true || false;
        tst = !true;
        //Constants
        double xx = Math.PI;
        xx = Math.E;

        //Power
        xx = Math.pow(2, 9);

        //Betrag
        xx = Math.abs(-575940);

        //Wurzel
        xx = Math.sqrt(625);

        //runden
        xx = Math.round(6.7);
        xx = Math.ceil(6.7);
        xx = Math.floor(6.7);

        //vergleichende rechenop
        xx = Math.max(6, 7);
        xx = Math.min(6, 7);
        return;
    }
    
}
