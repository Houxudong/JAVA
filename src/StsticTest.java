public class StsticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("LY1", 75000);
        staff[1] = new Employee("LY2", 85000);
        staff[2] = new Employee("LY3", 95000);
        for (Employee e: staff){
            e.setId();
            System.out.println("name: " + e.getName() + " Slaray: " + e.getSlaray() + " id: " + e.getId());
        }

        int n = Employee.getNextId();
        System.out.println("next avilable id is :  " + n);
    }
}
    class Employee
    {
        private static int nextId = 1;

        private String name;
        private double slaray;
        private int id;
        public Employee(String n, double s){
            name = n;
            slaray = s;
            id = 0;
        }
        public String getName() {
            return name;
        }

        public double getSlaray() {
            return slaray;
        }
        public int getId(){
            return id;
        }

        public void setId(){
            id = nextId;
            nextId++;
        }
        public static int getNextId(){
            return nextId;
        }
        public static void main(String[] args){
            Employee e = new Employee("Herry", 50000);
            System.out.println(e.getName()+ " " + e.getSlaray());
        }
    }


