
class A {
    public A () {
        System.out.println("I am in A ");
    }
    public A (int a ) {
        System.out.println("I am in int A ");
    }
}
class B extends  A{
    public B () {
        System.out.println("I am in B ");
    }
    public B (int a ) {
        super(3);
        System.out.println("I am in int B ");
    }
}



class Main {
    public static void main(String[] args) {
        B b = new B(1);
     }
}