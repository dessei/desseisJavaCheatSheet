package threading;

import java.lang.Thread;

public class threading_test {
    public static void main(String[] args) throws InterruptedException{
        //creating threads
        //  extending thread clas (simple but not recommended)
        //  implementing the runnable interface
        random_operation seperate_thread = new random_operation();
        Thread thread = new Thread(seperate_thread);
        thread.start();
        int stop_condition = seperate_thread.res;
        while(stop_condition == 0) {
            System.out.println("Still running bs in the back");
            Thread.sleep(500);
            stop_condition = seperate_thread.res;
        }
        System.out.println(stop_condition);
        thread.join();
        System.out.println("bs in the back finished");
        
    }
}

class random_operation implements Runnable{
    public int res = 0;

    @Override
    public void run() {
        try {
            unnecesaary_operations();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
    }

    public void unnecesaary_operations() throws InterruptedException {
         int tmp_res = 0;
        for(int i = 1; i < 10001; i++) {
            for(int j = 1; j < 1001; j++) {
                for(int k = 1; k < 1001; k++) {
                    tmp_res = (i*j) / k + (i+k) / j; 
                }
            }
        }
        this.res = tmp_res;
        Thread.sleep(2000);
        for(int i = 0; i < 1000; i++) {
            if(i % 100 == 0) {
                System.out.println(i);
            }
        }
    }
}