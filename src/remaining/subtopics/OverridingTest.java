package remaining.subtopics;
class Employee
{
    int base  =40000;

    public  int getSalary()
    {
        return base;

    }
    protected  void  Designation()
    {
        System.out.print("tesco:");
    }


}
class Manager extends Employee{
    @Override
    public int getSalary()
    {
        return base+10000;

    }
    @Override
    public void Designation()
    {
        super.Designation();
        System.out.println("manager");

    }

}


class Tester extends Employee{
    @Override
    public int getSalary()
    {
        return base+5000;

    }
    @Override
    public void Designation()
    {
        super.Designation();
        System.out.println("tester");

    }
}


public class OverridingTest {
    public static void main(String[] args) {

        Employee emp1 =new Manager();
        Employee emp2 =new Tester();

        System.out.println(emp1.getSalary());
        System.out.println(emp2.getSalary());
        emp1.Designation();
        emp2.Designation();


    }

}
