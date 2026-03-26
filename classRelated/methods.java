package classRelated;

public class methods {
    public static void main(String[] args) {
        int times = 3;
        hello(times);
        String s = hello(times, true);
        System.out.print(s);
        varArgs.varargs_example();

        //static test
        Static s1 = new Static(5);
        Static s2 = new Static(3);
        System.out.println(Static.instances);
        s1.print_num();
        Static.print_some_num();
        Inheritance.print_some_num();
        System.out.println(Inheritance.instances);
        Inheritance i = new Inheritance(3, 4);
        System.out.println(i.toString());
    }

    static void hello(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("Hello from a method");
        }
    }
    static String hello(int times, boolean linebreaks) {
        String res = "";
        for(int i = 0; i < times; i++) {
            res = res.concat("Hello from a method");
            if(linebreaks) res = res.concat("\n");
        }
        return res;
    }
}
