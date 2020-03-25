package item_16_classes_and_interfaces;

/*
 * The complex class with static factory
 *  - to make a class immutable it can not be subclassed (extended) to achieve that one can 
 *  - set constructor to private and make static factory
 */


public class ComplexFac {
    private final double re;
    private final double im;

    // Changed from public to private 
    private ComplexFac(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public static ComplexFac valueOf(double re, double im) {
    	return new ComplexFac(re, im); 
    }

    
    public double realPart(){ 
    	return re; 
    }
    
    
    public double imaginaryPart() {
    	return im; 
    }

    
    public ComplexFac plus(ComplexFac c) {
        return new ComplexFac(re + c.re, im + c.im);
    }


    public ComplexFac minus(ComplexFac c) {
        return new ComplexFac(re - c.re, im - c.im);
    }

    public ComplexFac times(ComplexFac c) {
        return new ComplexFac(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public ComplexFac dividedBy(ComplexFac c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new ComplexFac((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        ComplexFac c = (ComplexFac) o;

        // See page 47 to find out why we use compare instead of ==
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }
    @Override public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}