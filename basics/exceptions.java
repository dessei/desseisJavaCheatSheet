package basics;

public class exceptions {
    public static void exception_test() {

        try{
            int i = 1/0;
        } catch(ArithmeticException e) {
            System.out.println("illegal");
        } catch(Exception e) {         
            //not recommended. doesnt tell the user *what* went wrong only use when there may be unforeseen exceptions  
            System.out.println("something went wrong");
        }
    }
}
