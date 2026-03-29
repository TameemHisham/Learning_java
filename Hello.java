class Calculator {
    public int add(int num1, int num2) {
        System.out.println("Add!");
        return num1 + num2;
    }
}


class Hello {
    public static void main(String[] args) {
        Calculator mycalc = new Calculator();
        int result = mycalc.add(4, 5);
        System.out.println(result);
    }
}
