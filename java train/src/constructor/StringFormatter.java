package constructor;

public class StringFormatter {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(StringFormatter.reverseString(" I reversed a string "));
        System.out.println(StringFormatter.reverseString("DyPatilCollege"));
    }
}