


class SwitchTester {
 public static void main(String args[]) {
   short a = 8;
   short b = 3300;
   switchExperiment(a, b);
   System.out.println(String.format("A: %s", ((Object)a).getClass().getName()));
   System.out.println(String.format("B: %s", ((Object)b).getClass().getName()));
   
 }
 public static void switchExperiment(int a, int b) {
   switch (a) {
     case 1:
       b -= 4;
     case 2:
       b += 4;
     case 3:
       b /= 4;
       break;
     case 4:
       b *= 4;
       break;
     default:
       b = 0;
       break;
   }
 System.out.println("b is " + b);
 }
}