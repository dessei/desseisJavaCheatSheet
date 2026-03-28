package classRelated;

public class getters_setters {
    private int num;
    private int another_num;

    int getNum() {
        System.out.println("you got the num");
        return this.num;
    }

    void setNum(int n) {
        System.out.println("you set the num");
        if(num > n) {
            num = num - n;
        } else {
            num = num + n;
        }
    }


    //another num can only be gotten and not be changed
    int getAnother_num() {
        return another_num;
    }

    getters_setters(int a, int b) {
        num = a;
        another_num = b;
    }
}
