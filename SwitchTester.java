


class SwitchTester {
 public static void main(String args[]) {
	int b = 8;
	System.out.println("A  |  B  |  switchExperiment");
	for (int a = 1; a < 6; a++) {
		switchExperiment(a, b);
	}

   //System.out.println(String.format("A: %s", ((Object)a).getClass().getName()));
   //System.out.println(String.format("B: %s", ((Object)b).getClass().getName()));
   
 }
 public static void switchExperiment(int a, int b) {
   int val_update = b;
   switch (a) {
     case 1:
       val_update -= 4;
     case 2:
       val_update += 4;
     case 3:
       val_update /= 4;
       break;
     case 4:
       val_update *= 4;
       break;
     default:
       val_update = 0;
       break;
   }
	System.out.println(String.format("%d  |  %d  |  %d", a,b,val_update));
 }
}