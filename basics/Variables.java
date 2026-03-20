package basics;

public class Variables {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("World \n");
        //comment
        /*
        multi line comment
         */
       
        //Variables

        //primitive types -> may be passed by value
        int x = 7;
        double y = 6.7;
        char c = 'c';
        boolean b = true;

        //reference types -> pass by reference
        String s = "string";
        //arrasy
        int[] ints = {6,7};
        //objects
        // Class MyClass == MyClass(constructor_input)
        //object wrapped primitives
        Integer i = 5;
        //others: Boolean, Short, Character, Long, Float, Double
        UserInput u = new UserInput();
        u.InputTest();
        RandomNumbers r = new RandomNumbers();
        r.randomExample();
        Arithmetics.arithmet_example();
    }
}
