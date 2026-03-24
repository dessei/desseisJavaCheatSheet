package classRelated;

public class varArgs {
    public static void varargs_example() {
        System.out.println(sum(4,5,6,7,8,9,100));
    }
    static int sum(int... numbers) {
        int sum = 0;
        for(int num: numbers) {
            sum += num;
        }
        return sum;
    }
}
