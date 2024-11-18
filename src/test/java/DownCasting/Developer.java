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

    public void devSet(){
        System.out.println("dev does coding");
    }

    public static void main(String[] args) {

        Employee d1=new Developer(3,"Mukesh",25000,"PM");  //UpCasting
        d1.show();

        //we use down cast for access specific method from subclass eg. devSet method
        Developer d2=(Developer) d1;   //DownCasting
        d2.devSet();

        ((Developer) d1).devSet();

        Developer d3=new Developer(4,"Bapu",30000,"CEO");
        d2.devSet();


        //instanceof check is a good practice to ensure that downcasting is safe and won't throw a ClassCastException.
        if(d1 instanceof Developer){
            Developer de2=(Developer) d1;
            de2.devSet();
        }
        else {
            System.out.println("Dev is Not Employee yet");
        }

    }
}
