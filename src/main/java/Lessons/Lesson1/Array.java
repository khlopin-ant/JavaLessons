package Lessons.Lesson1;

public class Array {
    public static void main(String[] args)
    {
        int[] mas = new int[10];
        mas[0] = 1;
        mas[1] = mas[2] = mas[3] = ++mas[0];

        for (int i = 4; i < mas.length; i++)
        {
            mas[i] = i;
        }

        for (int a : mas)
        {
            System.out.println(a);
        }
    }
}
