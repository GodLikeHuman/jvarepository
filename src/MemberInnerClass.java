package src;

public class MemberInnerClass
{
    private String password="abcd";
    class CheckMemberInnerClass
    {
        String showPassword()

        {
            return password;

        }

    }

    public static void main(String[] args)
    {
        MemberInnerClass memberInnerClass=new MemberInnerClass();
        CheckMemberInnerClass checkMemberInnerClass=
                memberInnerClass.new CheckMemberInnerClass();
        System.out.println(checkMemberInnerClass.showPassword());
    }
}

