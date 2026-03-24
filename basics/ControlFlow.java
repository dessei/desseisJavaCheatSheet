package basics;

public class ControlFlow {
    public static void FlowingControl(){
        //if statements
        if(true) {
            //conditional code
        } else {
            System.out.println("otherwise");
        }

        //Enhanced switch
        int games_won = 2;
        String s = switch (games_won) {
            case 0 -> "3 wins to go";
            case 1 -> "2 wins to go";
            case 2 -> "1 win to go";
            case 3 -> "you won the best of 5";
            default -> "Well that's just unreasonable";
        };
        System.out.println(s);

        //switch
        switch (games_won) {
            case 0:
                s = "3 wins to go";
                break;
            case 1:
                s = "2 wins to go";
                break;
            case 2:
                s = "1 win to go";
                break;
            case 3:
                s = "you won the best of 5";
                break;
            default:
                s = "Well that's just unreasonable";
                break;
        }
        System.out.println(s);

        //ternary operator
        // variable = (condition) ? ifTrue : ifFalse;
        int groesse = 173;
        boolean grossGenugFürDieAchterbahn = (groesse > 140) ? true: false;
        System.out.println(grossGenugFürDieAchterbahn);

        //loops
        //for loop
        for(int counter = 0; counter < 100; counter++) {
            groesse-=1;
        }
        System.out.println(groesse);
        //while loop
        int i = 0;
        while(i < 10) {
            System.out.println("lol" + i);
            i++;
        }
        //oder
        i = 6;
        do{
            System.out.println("lal" + i);
            i++;
        } while(i < 5);


        //break & continue
        for(i = 0; i < 5; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }

        //for each
        String[] drinks = {"coke", "pepsi", "water", "dr. pfeffer", "Joe"};
        for(String drink : drinks) {
            System.out.println(drink);
        }
    }
}
