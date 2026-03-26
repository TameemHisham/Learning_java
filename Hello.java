class Hello {
    public static void main(String[] args) {
        int num1 = 3; // 4 bytes
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
//        Data Types:
//        Primitive:
//        Integer, Float,Character,Boolean
        double mark1 = 75.5; // 8 bytes
        float mark2 = 12.32f ; // 4 bytes
        long val1 = 10*100000; // 8 bytes
        byte val2 = -127; // -127-127
        short val3 = 3232; // 2 bytes
        char c1 = 'a'; // 2 bytes
        boolean isOver18 = true;
// type casting
        int num3 = 5;
        double num4 = 6.4;
        double sum = num4 + (double) num3 ;
        System.out.println(sum);
//        Operations
        int counter = 0;
        counter++; // post-increment <- fetch then increment
        ++counter; //pre-increment <- increment and fetch
    }
}
