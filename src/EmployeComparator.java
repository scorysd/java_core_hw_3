import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe>{

    @Override
    public int compare(Employe a, Employe b) {
        if (a.inPay > b.inPay){
            return 1;
        } else if (a.inPay < b.inPay) {
            return -1;
        }
        else return 0;
    }
}
