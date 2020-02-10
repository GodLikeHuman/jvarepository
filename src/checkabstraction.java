package src;

public class checkabstraction extends abstraction implements Interface
{
     //annotation

    @Override
    void showData() {
        System.out.println("Inside show data.");

    }

    public static void main (String[] args)
    {
        checkabstraction abstraction=new checkabstraction();
        abstraction.showData();
    }
    @Override
    public void add()
    {

    }
}
