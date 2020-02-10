package keywords;

public class ThisKey {

    int id;
    String name="";  ///empty
    //String name; //null
    ThisKey(int id,String name)
    {
        this.id=id;
        this.name=name;
        System.out.println("id"+id+"\nName"+name);
    }
    private void showData(){
        System.out.println("id: "+id+"\n Name :"+name);
    }
    private void getData()
    {
        System.out.println("Inside get data");
    }
    public static void main(String[] args)
    {
        ThisKey key=new ThisKey(1,"abcd");
        key.showData();
    }
}
