class Parent {
    public void function() {
        System.out.println("Parent::function() called");
    }
}

class Child extends Parent {
    public void function() {
        System.out.println("Child::function() called");
    }
}

class MyApp {
    public static void main(String[] args) {
        Parent p = new Child();
        p.function();
    }
}