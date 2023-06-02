public class HourlyPay extends Employe {
    double hourlyPay;

    public HourlyPay(String name, double hourlyPay) {
        super(name);
        this.hourlyPay = hourlyPay;
    }

    @Override
    protected double calcPay() {
        return inPay = 20.8 * 8 * hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

}

