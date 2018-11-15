package mcq;

public class TestClass {
    public static void main(String[] arges) {
        
        BaseClass bc = new BaseClass();
        ExtendedClass ec = new ExtendedClass();
        
        bc.hello();
        ec.hello();
    }
}
