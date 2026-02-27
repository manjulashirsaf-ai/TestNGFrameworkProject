package MostAksed;

class Example {
    static void staticMethod() {
        //System.out.println(this); // ❌ Compile-time error
    }

    void instanceMethod() {
        System.out.println(this); // ✅ Works, refers to current object
    }
}

public class Test {
    public static void main(String[] args) {
        Example.staticMethod();
        new Example().instanceMethod();
        new Example().instanceMethod();
    }
}
