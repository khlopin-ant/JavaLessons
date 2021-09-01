package Lessons.Lesson1;

public class IfElse
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = (a == 5) ? 1 : 2;

        if (b == 0)
        {
            System.out.println("statement IF");
        } else if (b == 1)
        {
            System.out.println("statement Else-IF 1");
        }  else if (b == 2)
        {
            System.out.println("statement Else-IF 2");
        } else
        {
            System.out.println("statement Else");
        }

        if (b > 0)
        {
            System.out.println("b > 0");
        }

        if (b <= 0)
        {
            System.out.println("b < 0");
        } else
        {
            System.out.println("b > 0");
        }



    }
}
