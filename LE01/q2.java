class Mother {
    int x;  

    Mother() {
        x = 10;  
    }

    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {

    @Override
    void show() {
        System.out.println("Hello JUET");  
    }
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();  // Output: Hello World
        Child ch = new Child();
        ch.show();  // Output: Hello JUET (Overridden method in Child class)
    }
}
