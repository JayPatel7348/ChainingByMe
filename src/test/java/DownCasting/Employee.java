package DownCasting;

public class Employee {

    int id;
    String name;
    int salary;
    public Employee(int id,String nm,int sal) {
        this.id=id;
        name=nm;
        salary=sal;
    }
    public void show(){
        System.out.println("Emplyee details: "+id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        Employee e=new Employee(1,"Jay",10000);
        e.show();
    }
}


