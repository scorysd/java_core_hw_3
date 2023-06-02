public class ArrayOfEmployes {
    Employe[] employe;

    public ArrayOfEmployes(Employe[] employe) {
        this.employe = employe;
    }
    public void displayInfo(){
        System.out.println();
        for (Employe e: employe) {
            System.out.printf("Зарплата %s равна %s\n" ,e.getName(), e.inPay);
        }
    }
}
