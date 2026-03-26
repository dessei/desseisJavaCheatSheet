package classRelated;

public class Inheritance extends Static{
    int some_other_num;
    
    public Inheritance(int num, int num2) {
        super(num);
        some_other_num = num;
    }
        @Override
        public void print_num() {
            System.out.println(test_num + some_other_num);
    }
    @Override
    public String toString() {
        return "ololol" + some_other_num;
    }
}

