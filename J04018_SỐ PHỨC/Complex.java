public class Complex {
    private int realPart, virtualPart;

    public Complex() {
        super();
    }

    public Complex(int realPart, int virtualPart) {
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }
    public Complex plus(Complex x){
        x.realPart = x.realPart + this.realPart;
        x.virtualPart = x.virtualPart + this.virtualPart;
        return x;
    }
    public Complex mul(Complex x){
        Complex y = new Complex();
        y.realPart = x.realPart * this.realPart - x.virtualPart * this.virtualPart;
        y.virtualPart = x.realPart * this.virtualPart + x.virtualPart * this.realPart;
        return y;
    }

    @Override
    public String toString() {
        if(virtualPart < 0){
            return realPart + " - " + (-1 * virtualPart) + "i";
        }
        return realPart + " + " + virtualPart + "i";
    }
}
