package ToStringDemo;

public class ToStringDemo {
    int d,m,y;
    ToStringDemo(){
        d=20;
        m=11;
        y=24;
    }
    public String toString()  //Overring method call automatically when we print object reference of the class, if we dont write toString method then it gives some hash in output
    {
        return "date is "+d+"/"+m+"/"+y;
    }

    public static void main(String[] args) {
        ToStringDemo t=new ToStringDemo();
        System.out.println(t);    //this will print toString overring method
    }
}
