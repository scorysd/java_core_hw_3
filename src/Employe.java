abstract class Employe {
    protected String name;
    protected double inPay;

    public Employe(String name) {
        this.name = name;
    }

    protected double calcPay(){
         return inPay;
    }

    public double getInPay() {
        return inPay;
    }

    public String getName() {
        return name;
    }

}
