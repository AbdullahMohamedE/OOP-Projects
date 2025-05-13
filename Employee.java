public class Employee {
    private int emp_ID;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;

    public Employee () {
        emp_ID = 100;
        name = "No name";
        salary = 3000;
        bonus = 500;
        depart = "No Assigned Yet";
        resident = true;
    }

    public Employee (int idno, String n) {
        emp_ID = idno;
        name = n;
    }

    public Employee (int idno, String n, boolean r) {
        this (idno, n);
        resident = r;
    }

    public Employee(int idno, String n, String d, double s, double b, boolean r) {
        emp_ID = idno;
        name = n;
        depart = d;
        salary = s;
        bonus = b;
        resident = r;
    }

    public void Set_Salary(double salary) {
        this.salary = salary;
    }

    public void Set_Salary_and_Bonus(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public void set_Department(String depart) {
        this.depart = depart;
    }
    public void Set_Emp_ID (int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public void print_emp_data () {
        System.out.println("ID " + emp_ID);
        System.out.println("Name " + name);
        System.out.println("Depart " + depart);
        System.out.println("Salary " + salary);
        System.out.println("Bonus " + bonus);
        System.out.println("Resident " + resident);
    }
}
