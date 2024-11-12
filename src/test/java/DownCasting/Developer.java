package DownCasting;

public class Developer extends Employee{
    String position;
    public Developer(int id,String nm,int sal,String pos){
        super(id,nm,sal);
        position=pos;
    }
    public void show(){
        System.out.println("Employee details: "+id+" "+name+" "+salary+" "+position);
    }
}
