package Lessons.Lesson1;

public class SwitchCase
{
    public static void main(String[] args)
    {
        int mark = 2;

        switch (mark)
        {
            case 5:
                System.out.println("Nice");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Bad");
                break;
            case 2:
            case 1:
                System.out.println("-_-");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
