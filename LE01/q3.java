class Mother {
    static void show() {
        System.out.println("Hello World from Mother (Static)");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Hello JUET from Child (Static)");
    }
}

public class Main {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show();  // Output: Hello World from Mother (Static)
    }
}
