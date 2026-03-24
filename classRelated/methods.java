package classRelated;

public class methods {
    public static void main(String[] args) {
        int times = 3;
        hello(times);
        String s = hello(times, true);
        System.out.print(s);
        varArgs.varargs_example();
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
