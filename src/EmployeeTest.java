import java.time.LocalDate;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        //fill the staff with three Employee object
        Employee[] staff = new Employee[3];//构造数组填入对象

        staff[0] = new Employee("LY1", 75000, 1987,1, 1);
        staff[1] = new Employee("LY2", 85000, 1999,3, 1);
        staff[2] = new Employee("LY3", 95000, 1996,11, 11);

        // raise everyone's salsry by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //print out information about all employee object
        for (Employee e : staff)
            System.out.println("name:" + e.getName() + "  salary:" + e.getSalary() + "  hireday:" + e.getHireday());
    }
    static class Employee
    {
        private String name;
        private double salary;
        private LocalDate hireday; //私有的数据域

        public Employee(String n, double s, int year, int month, int day)//构造器 构造器与类同名
        {
            name =n;
            salary = s;
            hireday = LocalDate.of(year, month, day);//不要命名与实例域同名的局部变量

        }

        public String getName() {//域访问器
            return name;
        }//公有的域访问器方法

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireday() {
            return hireday;
        }

        public void raiseSalary(double byPercent)//byPercent为显示参数
        {
            double raise = salary * byPercent / 100;//employee对象为隐式参数 例如 LY1的薪资提高百分之五 double raise = LY1.salary *byPercent /100

            salary += raise;
            /*
            double raise = this.salary * byPercent / 100 ；
            this.salsry += raise;     //this 关键字在方法中可以表示隐式函数，可以将实例域与局部变量区分开
            * */
        }//公有的域更改器方法
    }
}
