package basics;
import java.util.Scanner;

public class UserInput {
    public void InputTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num_string = sc.nextLine();
        System.out.println(num_string);
        int num = 0;
        try {
            num = Integer.parseInt(num_string);
        } catch (NumberFormatException e) {
            num = -1;
            System.out.println("Invalid number");
        }
        System.out.println(num);

        System.out.println("Enter another number_ ");
        int other_num = sc.nextInt();
        System.out.println(num+other_num);

        System.out.println("current price of pringles(tm)?");
        double pringle = sc.nextDouble();
        System.out.println("prignle" + (pringle + (double) num));

        double[] doublees = new double[2];
        for(int i = 0; i < doublees.length; i++) {
            System.out.print("Enter a number: ");
            doublees[i] = sc.nextDouble();
            System.out.print("\n");
        }


        sc.close();
    }
}
