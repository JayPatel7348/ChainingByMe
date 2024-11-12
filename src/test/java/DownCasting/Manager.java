package DownCasting;

public class Manager extends Employee{

    String position;
    public Manager(int id,String nm,int sal,String position){
        super(id,nm,sal);
        this.position=position;
    }
    public void show(){
        System.out.println("Employee Details: "+id+" "+name+" "+salary+" "+position);
    }
    public static void main(String[] args) {
        Manager m=new Manager(2,"Jinesh",20000,"Team Lead");
        m.show();

    }

}
