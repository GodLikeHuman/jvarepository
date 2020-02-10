package keywords;

public class Statickey {

    static  int count=0;

    public static void showData()
    {
        System.out.println("Inside static method");


    }


    public void getData(){
        System.out.println("Inside non static method");
    }
    public static void main(String[] args)
    {
     //non static method
        showData();// static method
    }
}

