

class AdvancedCalculator extends SimpleCalculator{
    public int pow(int a, int b) {
        int val = a;
        for (int i =0; i<b; i++) {
            a *= val;
        }
        return a;
    };
    public double log(double a) {
        return Math.log10(a);
    }
}
