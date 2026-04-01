package classRelated;

public class anonymousClass {
    //one time use class that can't be reused. practical when needing to add behaviour without implementing an entire new class;
    public static void main(String[] args) {
        test test1 = new test();
        test test2= new test() {
            private int other_num = 420;
            @Override
            public void print_funny_number(){
                System.out.println(69);
                System.out.println(this.other_num);
            }
        };

        test1.print_funny_number();
        System.out.println();
        test2.print_funny_number();
    }
}

class test {
    public void print_funny_number() {
        System.out.println(67);
    }
}
