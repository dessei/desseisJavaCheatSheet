package basics;

import java.util.Random;

public class RandomNumbers {
    public void randomExample() {
        Random r = new Random();
        int num = r.nextInt(1, 7); //second number exclusive
        double d_num = r.nextDouble(1, 7); //nextDouble without parameters will be between 0 and 1
        boolean b_bum = r.nextBoolean();
        System.out.println(num + " " + d_num);
    }    
}
