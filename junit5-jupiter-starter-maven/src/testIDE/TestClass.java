package testIDE;

public class TestClass {


    testIDE.TestClass2 testClass2=new testIDE.TestClass2();
    private int anInt;

    public testIDE.TestInterface method() {
        final int i = 0;
        return new MyTestInterface(i);
    }
    public void method2(){
        final int a = 1;

        final int b = a + anInt;
        anInt = testClass2.intValue();
        final int c = b + anInt;

    }

    protected void print(){
        System.out.print(1 + "say something");
    }
    private class MyTestInterface implements testIDE.TestInterface {
        private final int i;

        public MyTestInterface(final int i) {
            this.i = i;
        }

        public int publicMethod() {
            return this.i;
        }
    }
}
