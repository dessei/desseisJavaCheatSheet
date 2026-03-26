package classRelated;

public abstract class Abstact {
    //abstract classes can't be instantiated directly and exist specifically to be inherited from
    int c;

    //concrete methods will be inherited directly
    void print_67() {
        System.out.println(67);
    }

    //must be implemented by its children
    abstract int return_some_num();
}
