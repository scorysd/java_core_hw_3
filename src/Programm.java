import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        /*
        Массив работников на базе абстрактного класса Employe
         */
        Employe[] employes = {
                new Salary("John", 65040.53),
                new HourlyPay("Mark", 5843.12),
                new HourlyPay("Douglas", 2503.67),
                new Salary("Robb", 29500.34),
        };
//      Вычисление зарплаты сотрудникам и вывод всех сотрудников в порядке добавления
        for (int i = 0; i < employes.length; i++) {
            employes[i].calcPay();
            System.out.print(employes[i].getName() + " ");
            System.out.println(employes[i].inPay);
        }
//        Приведение массива к листу и сортировка компаратором
        List<Employe> emp = new ArrayList<Employe>();
        emp = Arrays.asList(employes);
        EmployeComparator emcp = new EmployeComparator();
        emp.sort(emcp);
//      Вывод отсортированного списка сотрудников
        System.out.println("\nSorted: ");
        for (Employe e : emp) {
            System.out.print(e.getName() + " ");
            System.out.println(e.getInPay());
        }
        // Вывод через foreach класса массива сотрудников
        ArrayOfEmployes aoe = new ArrayOfEmployes(employes);
        aoe.displayInfo();
    }
}


