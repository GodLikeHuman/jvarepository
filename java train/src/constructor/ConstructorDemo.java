package constructor;

import keywords.Statickey;

public class ConstructorDemo {
    ConstructorDemo() {
        System.out.println("default Constructor");
    }
    ConstructorDemo(int a)
    {
        System.out.println("Constructor:"+a);
    }

        public static void main(String[] args)
            {
                ConstructorDemo constructorDemo=new ConstructorDemo();
                keywords.Statickey staticKey=new Statickey();
                staticKey.getData();
                keywords.Statickey.showData();
            }


}
