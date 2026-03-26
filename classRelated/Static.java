package classRelated;

public class Static{
    int test_num;

    static int instances = 0;

    public Static(int num) {
        test_num = num;
        instances++;
    }

    //standard method
    public void print_num() {
        System.out.println(this.test_num);
    }

    //utility method
    public static void print_some_num() {
        //System.out.println(this.test_num);
        // Error -> this keyword can't be used in static contexts
        //          as static methods aren't bound to one singular instance of the class
        System.out.println(67);
    }
}
