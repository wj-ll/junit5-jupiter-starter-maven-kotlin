package testIDE;

public class TestClass2 {
    private final Class3 class3 = new Class3();

    int intValue(){

        return class3.intValue();
    }
    public int generateNumber(){
        return class3.generateNumber();
    }
    protected static boolean generateBoolean(){
        return new Class3().generateBoolean();
    }
    private static void print() {
        System.out.println(generateText());
    }

    private static String generateText() {
        return generateText("Hello, World!");
    }

    private static String generateText(final String s) {
        return s.toUpperCase();
    }
}
