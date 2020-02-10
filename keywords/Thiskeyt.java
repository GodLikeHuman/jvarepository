package keywords;

public class Thiskeyt
{
    int id;
    String name;

    Thiskeyt(){
        this(1,"abcd");
        System.out.println("Inside default constructor");
    }

    Thiskeyt(int id,String name){

        this.id=id;
        this.name=name;
        System.out.println("constructor body : id : "+id+"\nName : "+name);
    }
    private void showData(){
        getData();
        System.out.println("Method body : id : "+id+"\nName : "+name);
    }

    private void getData(){
        System.out.println("Inside getData");
    }

    public static void main(String[] args) {
        Thiskeyt key=new Thiskeyt
                (1,"abcd");
        key.showData();
    }


}

