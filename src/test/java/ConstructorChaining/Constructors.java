package ConstructorChaining;

public class Constructors {


    int id;
    String name;
    int salary;

    public Constructors(){
        this(2,"Jinesh",20000);
        id=1;
        name="Jay";
        salary=10000;
        System.out.println(id+" "+name+" "+salary);
    }

    public Constructors(int id,String name,int salary){
       this.id=id;
       this.name=name;
       this.salary=salary;
       System.out.println(id+" "+name+" "+salary);
    }

    public static void main(String[] args) {
        Constructors c=new Constructors();
    }
}
