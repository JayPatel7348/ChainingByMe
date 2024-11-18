package StaticKeyword;

public class Employee {

    int id;
    String name;
    int salary;
    static String company="seed info";
    public Employee(int id, String nm, int sal) {
        this.id=id;
        name=nm;
        salary=sal;
    }
    public void show(){

        System.out.println("Emplyee details: "+id+" "+name+" "+salary+" "+company);
    }

    public void showCompany(){
        Employee.company="seed";  //now company value is changed and keeping new value for further execution
        System.out.println("Emplyee details: "+id+" "+name+" "+salary+" "+company);
    }
    public void showCompany2(){

        System.out.println("Emplyee details: "+id+" "+name+" "+salary+" "+company);
    }

    public static void main(String[] args) {
        Employee e=new Employee(1,"Jay",10000);
        e.show();
        e.showCompany();
        e.showCompany2();
    }
}


