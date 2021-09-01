package Lessons.Lesson2;

public class Employer
{
    protected String name;
    private int age;

    public Employer()
    {
    }

    public Employer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void work()
    {
        System.out.println(this.name + "is working");
    }

    public void setName(String name)
    {
        System.out.println("name is set");
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
