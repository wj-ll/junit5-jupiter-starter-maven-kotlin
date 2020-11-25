package testIDE;

import java.util.LinkedList;
import java.util.List;

public class Class3 {
    public Class3() {
    }

    protected boolean generateBoolean() {
        boolean flag= false;
        return !flag;
    }

    //    Class1 class1  =new Class1();
    public void method() {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = b + c;
        List<String> list = new LinkedList<>();
        list.add("string");
    }

    int add(int a, int b) {
        return a + b;
    }

    int intValue() {

        return 2;
    }

    public int generateNumber() {
        return 1;
    }

}